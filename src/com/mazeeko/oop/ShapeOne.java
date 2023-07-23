package com.mazeeko.oop;

public class ShapeOne {

    private String color;

    public ShapeOne() {}

    public void doSomething(ShapeOne shapeOne) {
        shapeOne.erase();
        shapeOne.draw();
        
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        doSomething(circle);
        doSomething(triangle);
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
