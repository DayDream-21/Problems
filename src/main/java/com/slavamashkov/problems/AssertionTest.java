package com.slavamashkov.problems;

public class AssertionTest {
    @FunctionalInterface
    interface Operation<T extends Number> {
        T operation(T a, T b);
    }

    public static void main(String[] args) {
        double a = 5;
        double b = 2;

        assert doMath(a, b, Double::sum) == 4;
        assert doMath(a, b, Double::sum) == 7;
    }

    private static Double doMath(Double a, Double b, Operation<Double> operation) {
        return operation.operation(a, b);
    }
}
