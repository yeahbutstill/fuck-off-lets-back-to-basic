package com.dicoding.javafundamental.basic.strukturdasar.solid;

import java.util.Objects;

public class Kucing {

    // Property
    private String color;
    private Double height;
    private Double length;
    private Double weight;

    public Kucing() {
    }

    public Kucing(String color, Double height, Double length, Double weight) {
        this.color = color;
        this.height = height;
        this.length = length;
        this.weight = weight;
    }

    // Function atau fungsi merupakan sebuah prosedur yang memiliki keterkaitan dengan pesan dan objek
    public void purring() {
        System.out.print("Meow...");
    }

    public void eat() {
        weight = weight + 1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kucing kucing = (Kucing) o;
        return Objects.equals(color, kucing.color) && Objects.equals(height, kucing.height) && Objects.equals(length, kucing.length) && Objects.equals(weight, kucing.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, height, length, weight);
    }

    @Override
    public String toString() {
        return "Kucing{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", length=" + length +
                ", weight=" + weight +
                '}';
    }

}
