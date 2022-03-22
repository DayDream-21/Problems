package com.slavamashkov.problems.optional_test;

public class Main {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty(new Property("a", "5"));
        properties.setProperty(new Property("b", "true"));
        properties.setProperty(new Property("c", "-3"));

        System.out.println(properties.readDuration("a"));
        System.out.println(properties.optionalReadDuration("a"));
        System.out.println(properties.readDuration("b"));
        System.out.println(properties.optionalReadDuration("b"));
        System.out.println(properties.readDuration("c"));
        System.out.println(properties.optionalReadDuration("c"));
        System.out.println(properties.readDuration("d"));
        System.out.println(properties.optionalReadDuration("d"));
    }
}
