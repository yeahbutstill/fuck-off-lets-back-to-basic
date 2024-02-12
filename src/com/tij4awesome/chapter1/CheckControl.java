package com.tij4awesome.chapter1;

public class CheckControl {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat();
        thermostat.lowerTemperature();
        System.out.println();

        CoolingSystem coolingSystem = new CoolingSystem();
        coolingSystem.cool();
        coolingSystem.lowerTemperature();
        System.out.println();

        AirConditioner airConditioner = new AirConditioner();
        airConditioner.cool();
        System.out.println();

        HeatPump heatPump = new HeatPump();
        heatPump.cool();
        heatPump.heat();
    }
}
