package com.mazeeko.dasar;
public class RecursiveMethod {
    public static void main(String[] args){
        System.out.println(factorialLoop(5));

        System.out.println("manual");
        System.out.println(1*2*3*4*5);

        System.out.println("menggunakan recursive method");
        System.out.println(factorialRecursive(5));

        System.out.println("stack overflow");
        loopstack(4_000); // max 3999
  }

    public static Integer factorialLoop(Integer value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    // recursive method ini harus berhati-hati
    // karena ketika kita memanggil method, Java akan menyimpannya dalam stack, jika terlalu banyak memanggil method lain
    // maka stack akan terlalu besar dan bisa menyebabkan error stack overflow
    public static Integer factorialRecursive(Integer value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    // contoh stack overflow
    public static void loopstack(Integer value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Looping - " + value);
            loopstack(value - 1);
        }
    }

}
