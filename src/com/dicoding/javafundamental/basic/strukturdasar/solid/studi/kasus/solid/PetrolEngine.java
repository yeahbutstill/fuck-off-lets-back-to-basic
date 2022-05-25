package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

/**
 * Agar dapat memahami apa saja komponen di dalam mesin bahan bakar bensin,
 * perhatikan contoh pemodelan ini yang dibuat dalam bentuk class PetrolEngine:
 * Dalam class PetrolEngine untuk mesin mobil bahan bakar bensin konvensional, class PetrolEngine ini implements EngineInterface agar dapat digunakan pada parameter class Car.
 */
public class PetrolEngine implements EngineInterface {
    private final OilPipe oilPipe;
    private final Piston piston;

    public PetrolEngine(OilPipe oilPipe, Piston piston) {
        this.oilPipe = oilPipe;
        this.piston = piston;
    }

    @Override
    public void move() {
        Oil oil = oilPipe.suckOil();
        Energy energy = oil.burn();
        energy.push(piston);
    }
}
