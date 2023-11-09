package com.zamannow.stdclass;

public class TestRuntime {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // Processor Laptop kita
        System.out.println(runtime.availableProcessors());
        // ini semua memory JVM bukan memory Laptop
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.maxMemory());
    }
}
