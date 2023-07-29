package com.mazeeko.oop;

import java.util.ArrayList;

public class ShapeOne {

    // reference
    private String s = "asdf";
    private String color;

    public ShapeOne() {}

    public void doSomething(ShapeOne shapeOne) {
        shapeOne.erase();
        shapeOne.draw();

        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        doSomething(circle);
        doSomething(triangle);

        ArrayList<ShapeOne> shapeOnes = new ArrayList<>();
    }

    public static void draw() {
        System.out.println("Draw");
    }

    public static void erase() {
        System.out.println("Erase");
    }

    public static void move() {
        System.out.println("Move");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Main {
    public static void main(String[] args) {
        // kata kunci new mengatakan "jadikan saya yang baru dari objek ini"
        String s = new String();

        char c = 'x';
        Character ch = c;

        Character ch1 = 'z';
        char c1 = ch1;

        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(c1);
    }
}