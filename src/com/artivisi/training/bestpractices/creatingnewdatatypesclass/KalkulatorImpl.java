package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

public class KalkulatorImpl implements IKalkulator {
    @Override
    public Integer tambah(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer kurang(Integer a, Integer b) {
        return a - b;
    }
}
