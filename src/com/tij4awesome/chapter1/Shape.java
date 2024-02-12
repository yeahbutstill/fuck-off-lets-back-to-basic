package com.tij4awesome.chapter1;

public class Shape {
    private String color;

    public void draw() {
        System.out.println("Gambar");
    }

    public void erase() {
        System.out.println("Hapus");
    }

    public void move() {
        System.out.println("Bergerak");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void doSomething(Shape shape) {
        shape.erase();
        shape.draw();
    }
}
