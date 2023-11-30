package com.zamannow.basic;

public class ErrorRecursive {
    public static void main(String[] args) {
        ErrorRecursive errorRecursive = new ErrorRecursive();
        System.out.println(errorRecursive.stackOverflow(10000));
    }

    public Integer stackOverflow(Integer value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            stackOverflow(value - 1);
        }
        return value;
    }
}
