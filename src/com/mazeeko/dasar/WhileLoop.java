package com.mazeeko.dasar;
public class WhileLoop {
    public static void main(String[] args) {
        Integer counter = 1;
        // kalau di while loop cuman ada kondisi saja
        while (counter <= 5) {
            System.out.println("Perulangan ke - " + counter);
            counter++;
        }

        System.out.println("===================================");

        Integer counter2 = 1;
        while (true) {
            System.out.println("Perulangan ke - " + counter2);
            counter2++;
            if (counter2 > 10) {
                break;
            }
        }
        System.out.println("berehenti");
        System.out.println("==========================================");


        for (int a = 1; a < 10; a++) {
            if (a % 2 == 0) {
                continue;
            }
            System.out.println("Perulangan ganjil - " + a);
        }
        
        for (int a = 1; a < 10; a++) {
            if (a % 2 != 0) {
                continue;
            }
            System.out.println("Perulangan genap - " + a);
        }

    }
}
