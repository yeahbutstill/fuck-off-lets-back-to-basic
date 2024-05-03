package com.tij4awesome.chapter1;

public class Triangle extends Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void flipVertical() {
        System.out.println("vertical");
    }

    public void flipHorizontal() {
        System.out.println("horizontal");
    }

    @Override
    public void draw() {
        super.draw();
    }

    @Override
    public void erase() {
        super.erase();
    }
}
