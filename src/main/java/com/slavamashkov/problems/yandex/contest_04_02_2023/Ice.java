package com.slavamashkov.problems.yandex.contest_04_02_2023;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Ice {
    static int n, x, t, a[];
    static ArrayList<Integer> list;

    static int compare(int a, int b) {
        return Math.abs(Ice.x - Ice.a[a]) - Math.abs(Ice.x - Ice.a[b]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        t = sc.nextInt();
        a = new int[n];
        list = new ArrayList<>();
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            indices[i] = i;
        }

        Arrays.sort(indices, Ice::compare);

        for (int i : indices) {
            int diff = Math.abs(a[i] - x);
            if (diff <= t) {
                t -= diff;
                list.add(i + 1);
            }
        }
        System.out.println(list.size());
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}


/**
 * К Новому году работники Тындекса построили N ледяных скульптур, i-я скульптура состоит из ai килограмм льда.
 * Но они не посоветовались с Кузей! А ведь Кузя знает, что идеальная скульптура состоит из ровно X килограмм льда, не больше и не меньше.
 * Новый год уже совсем скоро, до него осталось всего T минут. За одну минуту Кузя может выбрать одну скульптуру и добавить или удалить ровно 1 килограмм льда из неё.
 * Вас, как отличника художественной школы, Кузя просит найти максимальное количество идеальных скульптур в момент наступления праздника.
 * Формат ввода
 *
 * В первой строке вводятся три целых числа N, X, T — количество скульптур, идеальное количество льда в скульптуре и оставшееся количество минут до наступления праздника.
 *
 * Во второй строке вводятся через пробел N целых чисел ai — количество килограмм льда в i-й скульптуре.
 *
 * Формат вывода
 *
 * В первой строке выведите целое число — максимально возможное количество идеальных скульптур в момент наступления праздника.
 *
 * Во второй строке выведите через пробел K различных целых чисел bi — номера скульптур, которые будут идеальными в момент наступления Нового-пренового года.
 *
 * Скульптуры нумеруются с 1 в порядке ввода.
 *
 * Если оптимальных ответов несколько, то выведите любой из оптимальных.
 */