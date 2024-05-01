package com.tij4awesome.chapter1;

import com.tij4awesome.chapter1.Car;
import com.tij4awesome.chapter1.CarSatu;
import com.tij4awesome.chapter1.Engine;

import java.math.BigDecimal;

public class TestCar {
    public static void main(String[] args) {
        CarSatu c1 = new CarSatu();
        c1.setName("Tesla007");
        c1.setPrice(new BigDecimal("1000000000"));
        c1.setBahanBakar("Listrik");

        Car car = new Car();
        Engine engine = new Engine();
        engine.setBahanBakar("Listrik");
        car.setName("Hyundai");
        car.setPrice("100000000000000");
        car.setEngine(engine);

        System.out.println(c1.getPrice());
        System.out.println(c1.getName());
        System.out.println(c1.getBahanBakar());
        System.out.println();

        System.out.println(car.getName());
        System.out.println(car.getEngine());
        System.out.println(car.getPrice());
    }
}
