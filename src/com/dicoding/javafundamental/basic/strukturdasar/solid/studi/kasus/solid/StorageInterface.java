package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

public interface StorageInterface<T> {
    void fill(T source);

    T getSource();
}
