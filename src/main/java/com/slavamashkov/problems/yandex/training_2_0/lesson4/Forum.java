package com.slavamashkov.problems.yandex.training_2_0.lesson4;

import java.util.*;

public class Forum {
    static class Pair<T, T1> {
        T key;
        T1 value;

        public Pair(T key, T1 value) {
            this.key = key;
            this.value = value;
        }

        public T getKey() {
            return key;
        }

        public T1 getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] reply = new int[n];
        String[] topics = new String[n];

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(input.nextLine());
            if (num == 0) {
                reply[i] = i;
                topics[i] = input.nextLine();
                input.nextLine();
            } else {
                reply[i] = reply[num - 1];
                input.nextLine();
            }
        }

        Map<Integer, Integer> cntReplies = new HashMap<>();
        for (int rep : reply) {
            cntReplies.put(rep, cntReplies.getOrDefault(rep, 0) + 1);
        }

        List<Pair<Integer, String>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (cntReplies.containsKey(reply[i])) {
                ans.add(new Pair<>(-cntReplies.get(reply[i]), topics[i]));
                cntReplies.remove(reply[i]);
            }
        }

        Collections.sort(ans, Comparator.comparing(Pair::getKey));

        System.out.println(ans.get(0).getValue());
    }
}