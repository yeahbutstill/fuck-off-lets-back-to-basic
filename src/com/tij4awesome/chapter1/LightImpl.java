package com.tij4awesome.chapter1;

public class LightImpl implements Light {
    @Override
    public Boolean on(int num) {
        if (num == 1) {
            System.out.println("Lampu nyala");
        }
        return true;
    }

    @Override
    public Boolean off(int num) {
        if (num == 0) {
            System.out.println("Lampu mati");
        }
        return true;
    }

    @Override
    public Integer brighten(int num) {
        if (num <= 0) {
            System.out.println("Gelap");
        } else if (num > 0) {
            System.out.println("Lumayan terang");
        } else if (num > 50) {
            System.out.println("Terang");
        }
        return num;
    }

    @Override
    public Boolean dim() {
        return false;
    }
}
