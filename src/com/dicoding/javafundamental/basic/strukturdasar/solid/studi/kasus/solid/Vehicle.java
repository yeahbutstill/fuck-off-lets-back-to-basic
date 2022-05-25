package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

interface Vehicle<T> {
    void accelerate();

    void brake();

    void refill(T source);
}
