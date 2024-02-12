package com.tij4awesome.chapter1;

public class TestLampu {
    public static void main(String[] args) {
        LightImpl lightImpl = new LightImpl();
        lightImpl.on(1);
        lightImpl.on();
        lightImpl.off(0);
        lightImpl.off();
        lightImpl.brighten(50);
        lightImpl.dim();
    }
}
