package com.tij4awesome.chapter1;

public class TestShape {
    public static void main(String[] args) {
        Square square = new Square();
        square.draw();
        Triangle triangle = new Triangle();
        triangle.erase();
        triangle.setName("segitiga bermuda");
        System.out.println(triangle.getName());
        triangle.flipHorizontal();
        triangle.flipVertical();
        System.out.println("-------------------------------------");
        Circle circle = new Circle();
        circle.move();
        circle.draw();
        circle.erase();
        System.out.println();
        System.out.println();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        Circle circle1 = new Circle();
        Triangle triangle1 = new Triangle();
        Line line = new Line();
        Shape shape = new Shape();
        shape.doSomething(circle1);
        System.out.println();
        shape.doSomething(triangle1);
        System.out.println();
        shape.doSomething(line);
    }
}
