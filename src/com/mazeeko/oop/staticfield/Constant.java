package com.mazeeko.oop.staticfield;

public class Constant {
    public static final String APPLICATION = "Belajar Java OOP";
    public static final Integer VERSION = 1;

    public static final Integer PROCESSOR;

    // static block ini akan dieksekusi sekali sebelum kelas ini di load
    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }
}
