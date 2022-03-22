package com.slavamashkov.problems.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Design a parking system for a parking lot. The parking lot has three kinds of parking spaces:
 * big, medium, and small, with a fixed number of slots for each size.
 * <p>
 * Implement the {@code ParkingSystem} class:
 * <ul>
 *     <li>
 *         {@code ParkingSystem(int big, int medium, int small)} Initializes object of the
 *         {@code ParkingSystem} class. The number of slots for each parking space are given
 *         as part of the constructor.
 *     </li>
 *     <li>
 *         {@code bool addCar(int carType)} Checks whether there is a parking space of {@code carType} for the car
 *         that wants to get into the parking lot. {@code carType} can be of three kinds: big, medium, or small,
 *         which are represented by {@code 1}, {@code 2}, and {@code 3} respectively. <b>A car can only park in
 *         a parking space of its</b> {@code carType}. If there is no space available, return {@code false},
 *         else park the car in that size space and return {@code true}.
 *     </li>
 * </ul>
 * */

public class ParkingSystemTest {
    public static void main(String[] args) {

    }
}

class ParkingSystem {
    Map<Integer, Integer> typePlacesMap = new HashMap<>();

    public ParkingSystem(int big, int medium, int small) {
        typePlacesMap.put(1, big);
        typePlacesMap.put(2, medium);
        typePlacesMap.put(3, small);
    }

    public boolean addCar(int carType) {
        if (typePlacesMap.get(carType) != 0) {
            typePlacesMap.put(carType, typePlacesMap.get(carType) - 1);
            return true;
        }

        return false;
    }
}
