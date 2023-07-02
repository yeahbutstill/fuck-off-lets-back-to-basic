package com.mazeeko.dasar;
public class MethodOverloading {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloWorld("Dani");
        sayHelloWorld("Dani", "Setiawan");
    }

    // method overloading nama method boleh sama, yang penting tipe data atau jumlah parameter harus berbeda,
    // kalau engga akan error
    public static void sayHelloWorld() {
        System.out.println("Hello World");
    }

    public static void sayHelloWorld(String firstName) {
        System.out.println("Hello " + firstName);
    }

    public static void sayHelloWorld(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
