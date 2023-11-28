package com.zamannow.basic;

public class AwBoolean {
    public static void main(String[] args) {
        boolean benar = true;
        boolean salah = false;

        boolean benarSalah = benar;
        String stringBoolean = String.valueOf(benarSalah);
        boolean booleString = Boolean.parseBoolean(stringBoolean);

        // kalau tipenya primitiv pake ini
        System.out.println(benarSalah == salah);
        // kalau tipenya object pake ini
        System.out.println(stringBoolean.equals(benarSalah));

        System.out.println(booleString == benar);
    }
}
