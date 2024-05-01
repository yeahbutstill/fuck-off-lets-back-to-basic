package com.tij4awesome.chapter1;

public class Engine {
    private String bahanBakar;

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "bahanBakar='" + bahanBakar + '\'' +
                '}';
    }
}
