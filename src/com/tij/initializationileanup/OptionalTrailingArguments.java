package com.tij.initializationileanup;

public class OptionalTrailingArguments {
    static void f(int required, String... traling) {
        System.out.print("required: " + required + " ");
        for (String s :
                traling) {
            System.out.println(s + " ");
        }
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "two three");
        f(0);
    }
}
