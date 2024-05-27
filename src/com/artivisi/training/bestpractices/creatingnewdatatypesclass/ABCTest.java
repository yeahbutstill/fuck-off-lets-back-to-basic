package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

public class ABCTest {
    static void MyPrintMethod(A a) {

        System.out.println("ONE");

    }


    static void MyPrintMethod(B b) {

        System.out.println("TWO");

    }


    static void MyPrintMethod(Object obj) {

        System.out.println("THREE");

    }


    public static void main(String[] args) {

        C c = new C();
        A a = new A();
        B b = new B();


        MyPrintMethod(c);
        MyPrintMethod(a);
        MyPrintMethod(b);

    }
}
