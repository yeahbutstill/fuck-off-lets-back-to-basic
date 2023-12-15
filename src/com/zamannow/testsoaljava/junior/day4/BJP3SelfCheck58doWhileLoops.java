package com.zamannow.testsoaljava.junior.day4;

public class BJP3SelfCheck58doWhileLoops {
    public static void main(String[] args) {
//        int x = 1;
//        do {
//            System.out.print(x + " ");
//            x += 10;
//        } while (x < 100);

//        int max = 10;
//        do {
//            System.out.println("count down: " + max);
//            max--;
//        } while (max < 10);

//        int x = 250;
//        do {
//            System.out.println(x);
//        } while (x % 3 != 0);

//        int x = 100;
//        do {
//            System.out.println(x);
//            x = x / 2;
//        } while (x % 2 == 0);

//        int x = 2;
//        do {
//            System.out.println(x  + " ");
//            x *= x;
//        } while (x < 200);

//        String word = "a";
//        do {
//            word = "b" + word + "b";
//        } while (word.length() < 10);
//        System.out.println(word);

//        int x = 100;
//        do {
//            System.out.println(x / 10);
//            x = x / 2;
//        } while (x > 0);

        String str = "/\\";
        do {
            str += str;
        } while (str.length() < 10);
        System.out.println(str);
    }
}
