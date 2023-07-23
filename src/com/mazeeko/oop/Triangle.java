package com.mazeeko.oop;

public class Triangle extends ShapeOne {
    public Triangle() {
        super();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public void flipVertical() {
        System.out.println("vertical");
    }

    public void flipHorizontal() {
        System.out.println("horizontal");
    }
}
