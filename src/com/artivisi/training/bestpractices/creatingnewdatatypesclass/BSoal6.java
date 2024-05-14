package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

import java.util.Objects;

public class BSoal6 {
    private String a;
    private int c;

    public BSoal6() {
    }

    public BSoal6(String a, int c) {
        this.a = a;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public static void main(String[] args) {
        ASoal6 b = new ASoal6();
        BSoal6 a = new BSoal6();
        b.setA("Bogor");
        
    }
}
