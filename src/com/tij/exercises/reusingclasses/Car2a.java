package com.tij.exercises.reusingclasses;

// reusing/Car2a.java
// TIJ4 Chapter Reusing, Exercise 14, page 258
// In Car2a.java add a service() method to Engine and call this method in main().

class Engine1a {
    public void start() {}
    public void rev() {}
    public void stop() {}
    public void service() { System.out.println("service engine"); }
}

class Wheel1a {
    public void inflate(int psi) {}
}

class Window1a {
    public void rollup() {}
    public void rolldown() {}
}

class Door1a {
    public Window1a window = new Window1a();
    public void open() {}
    public void close() {}
}

public class Car2a {
    public Engine1a engine = new Engine1a();
    public Wheel1a[] wheel = new Wheel1a[4];
    public Door1a
            left = new Door1a(),
            right = new Door1a(); // 2-door
    public Car2a() {
        for(int i = 0; i < 4; i++)
            wheel[i] = new Wheel1a();
    }
    public static void main(String[] args) {
        Car2a car = new Car2a();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }
}
