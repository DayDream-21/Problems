package com.slavamashkov.problems.yandex_30_05_2022;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        test(fileName);
    }

    private static File test(String inputFileName) {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFileName));
             FileWriter fileWriter = new FileWriter("output.txt");) {

            String[] nums = fileReader.readLine().split(" ");

            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);

            fileWriter.write(String.valueOf(a + b));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new File("output.txt");
    }
}
