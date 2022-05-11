package com.dicoding.javafundamental.basic.strukturdasar.tipedata.playwithstring;

public class StringvalueOfTest {
    public static void main(String[] args) {
        int iNum = 30;

        double fNum = 4.56789;
        String s = "91";

        // Returns the string representation of int iNum.
        String sample = String.valueOf(iNum);

        System.out.println(sample);

        // concatenating string with iNum
        System.out.println(sample + s);

        // Returns the string representation of the float
        // fnum.
        sample = String.valueOf(fNum);
        System.out.println(sample);

        // concatenating string with fNum
        System.out.println(s + sample);
    }
}
