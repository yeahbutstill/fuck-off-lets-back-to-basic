package com.tij4awesome.chapter1;

import com.tij4awesome.chapter1.Circle;
import com.tij4awesome.chapter1.Line;
import com.tij4awesome.chapter1.Shape;
import com.tij4awesome.chapter1.Square;
import com.tij4awesome.chapter1.Triangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

        List<Integer> integerArrayListlist = new ArrayList<>(List.of(4, 1, 2, 3));
        integerArrayListlist.add(20);
        integerArrayListlist.add(3, 10);
        integerArrayListlist.remove(0);
        System.out.println(integerArrayListlist.get(0));
        System.out.println(integerArrayListlist);
        System.out.println();

        List<Integer> integerLinkedList = new LinkedList<>(List.of(5,4,3,2,1,0));
        integerLinkedList.add(19);
        integerLinkedList.add(-19);
        integerLinkedList.remove(0);
        System.out.println(integerLinkedList);
        System.out.println(integerLinkedList.get(0));
        System.out.println();

        ArrayList<Object> objects = new ArrayList<>(List.of(-1,-2,-3));
        objects.set(0, 1);
        objects.set(1, 2);
        objects.set(2, 3);
        objects.add(3, 4);
        System.out.println(objects.getFirst());
        System.out.println(objects);
    }
}
