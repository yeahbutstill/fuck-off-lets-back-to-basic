package com.tij4awesome.chapter1.exercise.everythingisanobject.ch5;

/****************** Exercise 5 ******************
 * Modify Exercise 4 so the values
 * of the data in DataOnly are assigned to and
 * printed in main().
 ************************************************/
public class CH5 {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.s = "MYT";
        dataOnly.i = 100;
        dataOnly.b = true;
        System.out.println(dataOnly.s);
        System.out.println(dataOnly.i);
        System.out.println(dataOnly.b);
    }
}
