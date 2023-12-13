package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise415getGrade {
    public static void main(String[] args) {
        System.out.println(getGrade(63));
    }

    public static double getGrade(int score) {
        if (score < 0 || 100 < score) throw new IllegalArgumentException();
        else if (score < 60) return 0.0;
        else if (60 <= score && score <= 62) return 0.7;
        else if (63 <= score && score <= 94) return (score - 63) * 0.1 + 0.8;
        else return 4.0; // >= 95
    }
}
