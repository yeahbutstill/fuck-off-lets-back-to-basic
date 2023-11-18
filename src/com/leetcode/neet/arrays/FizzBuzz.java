package com.leetcode.neet.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz {
}

class Main {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.print("FizzBuzz\n");
            } else if (i % 5 == 0) {
                System.out.print("Buzz\n");
            } else if (i % 3 == 0) {
                System.out.print("Fizz\n");
            } else {
                System.out.printf("%d\n", i);
            }
        }
    }
}

class Main1 {
    static int binarySearch(int[] array, int value, int low, int high) {
        int mid;
        if (high < low) {
            return -1;
        } else {
            mid = (low + high) / 2;
            if (array[mid] > value) {
                return binarySearch(array, value, low, mid);
            } else if (array[mid] < value) {
                return binarySearch(array, value, mid + 1, high);
            } else {
                return mid;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, value, answer;
        int[] array = new int[10000];
        for (i = 0; i < 10000; i++) {
            array[i] = sc.nextInt();
        }
        for (i = 0; i < 10000; i++) {
            value = sc.nextInt();
            answer = binarySearch(array, value, 0, 9999);
            System.out.printf("%d\n", answer);
        }
    }
}

class Main2 {
    static int bitmask;
    static ArrayList<Character> characters;
    static ArrayList<Character> running;

    static void permutations() {
        int i;
        if (running.size() == characters.size()) {
            StringBuilder s = new StringBuilder();
            for (char c : running) {
                s.append(c);
            }
            System.out.printf("%s\n", s);
        } else {
            for (i = 0; i < characters.size(); i++) {
                if (((bitmask >> i) & 1) == 0) {
                    bitmask |= (1 << i);
                    running.add(characters.get(i));
                    permutations();
                    running.remove(running.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        characters = new ArrayList<Character>();
        for (i = 0; i < s.length(); i++) {
            characters.add(s.charAt(i));
        }
        running = new ArrayList<Character>();
        bitmask = 0;
        permutations();

    }
}