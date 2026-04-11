package com.example.demo.util;

public class SanitizerUtil {

    public static String sanitize(String input) {
        if (input == null) return null;

        // Remove MongoDB operators
        return input.replaceAll("\\$", "")
                    .replaceAll("\\.", "")
                    .trim();
    }
}
