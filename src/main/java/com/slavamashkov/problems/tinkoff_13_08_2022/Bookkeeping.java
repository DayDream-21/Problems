package com.slavamashkov.problems.tinkoff_13_08_2022;

import java.util.*;

public class Bookkeeping {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Map<Integer, Deque<String>> calls = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.skip("\\s+");

        for (int i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }

        for (int i = 0; i < q; i++) {
            String[] call = sc.nextLine().split(" ");

            int key = Integer.parseInt(call[0]);
            String value = call[1];

            if (calls.get(key) == null) {
                calls.put(key, new ArrayDeque<>());
                calls.get(key).addLast(value);
            } else {
                calls.get(key).addLast(value);
            }
        }

        for (int i = 0; i < calls.size(); i++) {
            Integer key;

            key = (Integer) calls.keySet().toArray()[i];

            while (!calls.get(key).isEmpty()) {
                System.out.println(findPerson(key, calls.get(key).pollFirst(), names));
            }
        }
    }

    private static int findPerson(int index, String prefix, List<String> names) {
        int indexCounter = 0;
        int positionCounter = 1;

        for (String name : names) {
            if (name.startsWith(prefix)) {
                indexCounter++;
            }

            if (indexCounter == index) {
                return positionCounter;
            }

            positionCounter++;
        }

        return -1;
    }
}
