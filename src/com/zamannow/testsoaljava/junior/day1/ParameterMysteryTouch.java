package com.zamannow.testsoaljava.junior.day1;

public class ParameterMysteryTouch {
    public static void main(String[] args) {
        String head = "shoulders";
        String knees = "toes";
        String elbow = "head";
        String eye = "eyes and ears";
        String ear = "eye";

        touch(ear, elbow);
        touch(elbow, ear);
        touch(head, "elbow");
        touch(eye, eye);
        touch(knees, "Toes");
        touch(head, "knees " + knees);
    }

    private static void touch(String a, String b) {
        System.out.println("touch your " + a + " to your " + b);
    }
}
