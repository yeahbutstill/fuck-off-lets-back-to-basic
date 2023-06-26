package com.mazeeko.dasar;

import java.util.Date;

public class OperasiMTK {
    public static void main(String[] args){
        Integer a = 100;
        Integer b = 10;
        Integer c = 11;
        Integer d = 12;
        Integer e = 13;

        Integer tambah = a + b;
        Integer kurang = a - b;
        Integer kali = a * b;
        Integer bagi = a / b;
        Integer sisaBagi = a % c;

        System.out.println(tambah);
        System.out.println(kurang);
        System.out.println(kali);
        System.out.println(bagi);
        System.out.println(sisaBagi);

        System.out.println("============================= Augmented Assignment");
        // Augmented Assignment ini adalah operasi ke variable dia sendiri
        a+=10; // a = a + 10
        b-=10; // b = b - 10
        c*=10; // c = c * 10
        d/=10; // d = d / 10
        e%=10; // e = e % 10

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("============================= Unary Operator");



        // unary operator
        // ++ // a = a + 1
        // -- // a = a - 1
        // - // negative
        // + // positive (Optional)
        // ! // boolean kebalikan

        // assignment statement
        Integer d1 = 100;
        Integer d2 = 200;
        boolean salah = true;

        // increment statement
        d1++;
        ++d2;

        // method invocation statement
        System.out.println(d1);
        System.out.println(d2);

        d1--;
        System.out.println(d1);
        System.out.println(!salah);

        // object creation statement
        Date date = new Date();

    }
}
