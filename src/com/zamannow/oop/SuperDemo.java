package com.zamannow.oop;

public class SuperDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.getCorner());
        System.out.println();

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
