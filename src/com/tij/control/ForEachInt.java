package com.tij.control;

import com.tij.util.Range;

public class ForEachInt {
    public static void main(String[] args) {
        for (int i : Range.range(10)) { // 0..9
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : Range.range(5, 10)) { // 5..9
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i : Range.range(5, 20, 3)) { // 5..20 step 3
            System.out.print(i + " ");
        }
    }
}
