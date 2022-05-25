package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

/**
 * Sumber tenaga disimpan pada baterai yang dimodelkan pada class Battery implements StorageInterface.
 * Di dalam Battery terdapat class Electrons, yang diibaratkan sebagai listrik yang tersimpan pada baterai.
 */
public class Battery implements StorageInterface<Electrons> {

    private Electrons electrons;

    public Battery(Electrons electrons) {
        this.electrons = electrons;
    }

    @Override
    public void fill(Electrons source) {

    }

    @Override
    public Electrons getSource() {
        return electrons;
    }
}
