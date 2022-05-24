package com.dicoding.javafundamental.basic.strukturdasar.solid.dip;

public class Car {
    private final EngineInterface engine;

    public Car(EngineInterface engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
    }
}
