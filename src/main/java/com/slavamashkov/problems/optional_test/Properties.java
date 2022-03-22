package com.slavamashkov.problems.optional_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Properties {
    private final List<Property> properties = new ArrayList<>();

    public String getProperty(String key) {
        for (Property property : properties) {
            String nullableKey = property.getKey();
            if (nullableKey != null && nullableKey.equals(key)) {
                return property.getValue();
            }
        }
        return null;
    }

    public void setProperty(Property property) {
        properties.add(property);
    }

    public int readDuration(String name) {
        String value = getProperty(name);
        if (value != null) {
            try {
                int i = Integer.parseInt(value);
                if (i > 0) {
                    return i;
                }
            } catch (NumberFormatException ignored) {

            }
        }
        return 0;
    }

    public int optionalReadDuration(String name) {
        return Optional.ofNullable(getProperty(name))
                .flatMap(Properties::stringToOptionalInteger)
                .filter(i -> i > 0)
                .orElse(0);
    }

    private static Optional<Integer> stringToOptionalInteger(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        }  catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
