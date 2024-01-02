package com.tij4awesome.chapter1;

public class TestLampu {
    public static void main(String[] args) {
        LightImpl light = new LightImpl();
        light.on(1);
//        light.off(0);
        light.brighten(50);
        System.out.println(light.dim());
    }
}
