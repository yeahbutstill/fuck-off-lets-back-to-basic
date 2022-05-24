package com.dicoding.javafundamental.basic.strukturdasar.solid.dip;

public class Main {
    public static void main(String[] args) {
        Car fuelCar = new Car(new PetrolEngine());
        Car diselCar = new Car(new DieselEngine());
        Car hybridCar = new Car(new HybridEngine());

        // Boom boom
        fuelCar.start();
        diselCar.start();
        hybridCar.start();

    }
}
