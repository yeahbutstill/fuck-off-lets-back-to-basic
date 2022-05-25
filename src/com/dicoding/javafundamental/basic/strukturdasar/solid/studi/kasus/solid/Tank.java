package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

/**
 * Terdapat pula class Tank yang implements StorageInterface, class ini berfungsi sebagai penyimpanan bensin,
 * di mana dimodelkan sebagai class Oil.
 */
public class Tank implements StorageInterface<Oil> {

    private Oil oil;

    @Override
    public void fill(Oil source) {
        this.oil = source;
    }

    @Override
    public Oil getSource() {
        return oil;
    }
}
