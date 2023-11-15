package com.zamannow.basic;

public class TestSwitchLambda {
    public static void main(String[] args) {
        String nilai = "A";
        switch (nilai) {
            case "A" -> System.out.println("Wow anda lulus dengan baik");
            case "B", "C" -> System.out.println("Wow anda lulus");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }
    }
}
