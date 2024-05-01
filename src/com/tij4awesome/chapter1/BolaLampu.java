package com.tij4awesome.chapter1;

import com.tij4awesome.chapter1.Light;

public class BolaLampu implements Light {
    @Override
    public Boolean on(int num) {
        if (num == 1) {
            System.out.println("Lampu nyala");
        }
        return true;
    }

    @Override
    public void on() {
        System.out.println("nyala");
    }

    @Override
    public Boolean off(int num) {
        if (num == 0) {
            System.out.println("Lampu mati");
        }
        return true;
    }

    @Override
    public void off() {
        System.out.println("mati");
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
    public void brighten() {
        System.out.println("terangkan");
    }

    @Override
    public void dim() {
        System.out.println("dimdimdim");
    }

}
