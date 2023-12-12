package com.zamannow.testsoaljava.junior.day3;

public class DominanceRules {
    public static void main(String[] args) {
        run(200);
        run(404);
        run(500);
        run(600);
    }

    public static void run(Integer status) {
        System.out.printf("%n=== %d ===%n", status);
        String text = switch (status) {
            // Sort these lines according to the dominance rules
            default -> "Valid"; // EVIL
//            case Number n when n.intValue() >= 600 -> "Invalid";
            case 200 -> "Ok";
            case 404 -> "Not found";
        };

        System.out.println(text);
    }
}
