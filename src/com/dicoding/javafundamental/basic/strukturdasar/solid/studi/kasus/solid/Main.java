package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

public class Main {

    public static void main(String[] args) {

        /**
         * Langkah terakhir adalah energy tersebut digunakan untuk menggerakkan piston agar mobil dapat bergerak.
         * Sehingga kira-kira penerapan class-nya menjadi seperti ini:
         */

        // Petrol Car
        StorageInterface<Oil> tank = new Tank();
        OilPipe oilPipe = new OilPipe();
        Piston piston = new Piston();
        EngineInterface petrolEngine = new PetrolEngine(oilPipe, piston);

        Car<Oil> petrolCar = new Car<>(petrolEngine, tank);
        Oil oil = new Oil();
        petrolCar.refill(oil);
        petrolCar.accelerate();
        petrolCar.brake();

        /**
         * Sumber tenaga disimpan pada baterai yang dimodelkan pada class Battery implements StorageInterface.
         * Di dalam Battery terdapat class Electrons, yang diibaratkan sebagai listrik yang tersimpan pada baterai.
         * Sehingga, kira-kira penerapan class-nya menjadi seperti ini:
         */
        //Electric car
        Electrons electrons = new Electrons();
        StorageInterface<Electrons> battery = new Battery(electrons);
        SpeedController speedController = new SpeedController(new BatteryManagementSystem(), new ElectricMotor());
        EngineInterface electricEngine = new ElectricEngine(speedController);
        Car<Electrons> electricCar = new Car<Electrons>(electricEngine, battery);
        electricCar.refill(electrons);
        electricCar.accelerate();
        electricCar.brake();

    }

}
