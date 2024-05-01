package com.tij4awesome.chapter1;

import com.tij4awesome.chapter1.Shape;

public class Triangle extends Shape {
    String name;

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
