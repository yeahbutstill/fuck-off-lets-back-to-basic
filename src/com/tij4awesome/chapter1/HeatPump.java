package com.tij4awesome.chapter1;

public class HeatPump extends CoolingSystem {
    @Override
    void cool() {
        super.cool();
    }

    void heat() {
        System.out.println("check heat pump");
    }
}
