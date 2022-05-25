package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

public class Car<T> implements Vehicle<T> {

    private final EngineInterface engine;
    private final StorageInterface<T> storage;

    /**
     * parameter EngineInterface, yaitu sebuah interface yang berfungsi agar dapat digunakan oleh dua mesin
     * yang berbeda
     * parameter StorageInterface sebagai interface yang berfungsi agar dapat digunakan oleh dua sumber daya yang berbeda.
     * Penggunaannya adalah pada mesin bahan bakar bensin konvensional dan mesin dengan sumber daya listrik.
     *
     * @param engine
     * @param storage
     */
    public Car(EngineInterface engine, StorageInterface<T> storage) {
        this.engine = engine;
        this.storage = storage;
    }

    @Override
    public void accelerate() {
        engine.move();
    }

    @Override
    public void brake() {

    }

    @Override
    public void refill(T source) {
        storage.fill(source);
    }
}
