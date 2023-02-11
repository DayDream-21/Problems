package com.slavamashkov.problems.yandex.training_2_0.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());

        List<Integer> coord = Arrays.stream(in.readLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(compute(n, coord));
    }

    public static int compute(int n, List<Integer> coord) {
        return coord.get(coord.size() / 2);
    }
}
