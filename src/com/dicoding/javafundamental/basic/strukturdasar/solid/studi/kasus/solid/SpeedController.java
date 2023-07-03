package com.dicoding.javafundamental.basic.strukturdasar.solid.studi.kasus.solid;

public class SpeedController {

  private BatteryManagementSystem bms;
  private ElectricMotor motor;

  public SpeedController(BatteryManagementSystem bms, ElectricMotor motor) {
    this.bms = bms;
    this.motor = motor;
  }

  void control() {
    Battery battery = bms.getBattery();
    motor.rotate(battery);
  }
}
