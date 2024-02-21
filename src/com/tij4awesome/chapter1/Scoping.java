package com.tij4awesome.chapter1;

public class Scoping {
    public static void main(String[] args) {
        {
            int x = 12;
            // only x available
            System.out.println(x);
            {
                int q = 96;
                // Both x & q available
                System.out.println(x);
                System.out.println(q);
            }
            // only x available
            System.out.println(x);
            // q is "out of scope"
            // System.out.println(q); // error
        }
    }
}
