package com.mazeeko.oop;

public class Rectangle extends Shape {
    Integer getCorner() {
        return 4;
    }

    Integer getParentCorner() {
        return super.getCorner();
    }
}
