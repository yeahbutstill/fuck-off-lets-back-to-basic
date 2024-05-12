package com.artivisi.training.bestpractices.scoping;

public class TestScoping {
    public static void main(String[] args) {
        {
            int x = 10;
            // Only x variable
            System.out.println(x);
            //System.out.println(q); // karena diluar scop

            {
                int q = 90;
                // dua-duanya x dan q tersedia
                System.out.println(x);
                System.out.println(q);
            }

            // hanya x yang tersedia
            // q di luar scop
            System.out.println(x);
            //System.out.println(q);
        }
    }
}
