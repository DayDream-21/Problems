package com.slavamashkov.problems.yandex.training_1_0.lesson1;

import org.junit.jupiter.api.Test;

class AmbulanceTest {

    @Test
    void findFlatFloorNumber_normalInput() {
        String input = "89 20 41 1 11";
        String expected = "2 3";

        String[] split = input.split(" ");

        int k1 = Integer.parseInt(split[0]); // номер квартиры 1
        int m = Integer.parseInt(split[1]); // кол-во этажей
        int k2 = Integer.parseInt(split[2]); // номер квартиры 2
        int p2 = Integer.parseInt(split[3]); // номер подъезда 2
        int n2 = Integer.parseInt(split[4]); // номер этажа 2

        new Ambulance().findFlatFloorNumber(k1, m, k2, p2, n2);
    }

    @Test
    void findFlatFloorNumber_indefiniteInput() {
        String input = "11 1 1 1 1";
        String expected = "0 1";

        String[] split = input.split(" ");

        int k1 = Integer.parseInt(split[0]); // номер квартиры 1
        int m = Integer.parseInt(split[1]); // кол-во этажей
        int k2 = Integer.parseInt(split[2]); // номер квартиры 2
        int p2 = Integer.parseInt(split[3]); // номер подъезда 2
        int n2 = Integer.parseInt(split[4]); // номер этажа 2

        new Ambulance().findFlatFloorNumber(k1, m, k2, p2, n2);
    }

    @Test
    void findFlatFloorNumber_controversialInput() {
        String input = "3 2 2 2 1";
        String expected = "-1 -1";

        String[] split = input.split(" ");

        int k1 = Integer.parseInt(split[0]); // номер квартиры 1
        int m = Integer.parseInt(split[1]); // кол-во этажей
        int k2 = Integer.parseInt(split[2]); // номер квартиры 2
        int p2 = Integer.parseInt(split[3]); // номер подъезда 2
        int n2 = Integer.parseInt(split[4]); // номер этажа 2

        new Ambulance().findFlatFloorNumber(k1, m, k2, p2, n2);
    }
}