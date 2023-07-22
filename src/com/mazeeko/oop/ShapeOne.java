package com.mazeeko.oop;

public class ShapeOne {

    private String color;

    public ShapeOne() {}

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
