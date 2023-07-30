package com.tij.exercises1;

public class Solution5DOTest2 {
    public static void main(String[] args) {
        class Dataonly {
            int i;
            double d;
            boolean b;

            void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }

        Dataonly dataonly = new Dataonly();
        dataonly.i = 234;
        dataonly.d = 2.1234545;
        dataonly.b = true;
        dataonly.show();
    }
}
