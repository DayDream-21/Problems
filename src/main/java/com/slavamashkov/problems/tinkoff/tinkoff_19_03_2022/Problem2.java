package com.slavamashkov.problems.tinkoff.tinkoff_19_03_2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        try {
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(System.in));
            String ab = br.readLine();
            String ac = br.readLine();
            String bc = br.readLine();

            order(ab, ac, bc);
        } catch (Exception e) {
            System.err.println("Error:" + e.getMessage());
        }
    }

    static String[] abc = {"a", "b", "c"};

    public static void order(String ab, String ac, String bc) {
        List<List<String>> list = new ArrayList<>();

        String[] signs = {ab, ac, bc};

        backtrack(list, new LinkedList<>(), signs);

        System.out.println(list);
    }

    // Works if all signs equals =
    // But if one of them equals < or > then StackOverflow happens
    //todo debug it
    private static void backtrack(List<List<String>> list, LinkedList<String> tempList, String[] signs) {
        // if tempList contains same elements amount as nums, then we can add it in result list
        if (tempList.size() == abc.length) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (String letter : abc) {
                // element already exists, skip
                if (tempList.contains(letter)) {
                    continue;
                }

                if (tempList.peekLast() == null) {
                    tempList.add(letter);
                } else {
                    if (tempList.peekLast().equals("a")) {
                        if (letter.equals("b")) {
                            if (signs[0].equals("<") || signs[0].equals("=")) {
                                tempList.add(letter);
                            }
                        } else if (letter.equals("c")) {
                            if (signs[1].equals("<") || signs[0].equals("=")) {
                                tempList.add(letter);
                            }
                        }
                    }

                    if (tempList.peekLast().equals("b")) {
                        if (letter.equals("a")) {
                            if (signs[0].equals(">") || signs[0].equals("=")) {
                                tempList.add(letter);
                            }
                        } else if (letter.equals("c")) {
                            if (signs[2].equals("<") || signs[0].equals("=")) {
                                tempList.add(letter);
                            }
                        }
                    }

                    if (tempList.peekLast().equals("c")) {
                        if (letter.equals("a")) {
                            if (signs[1].equals(">") || signs[0].equals("=")) {
                                tempList.add(letter);
                            }
                        } else if (letter.equals("b")) {
                            if (signs[2].equals(">") || signs[0].equals("=")) {
                                tempList.add(letter);
                            }
                        }
                    }
                }

                backtrack(list, tempList, signs);

                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
