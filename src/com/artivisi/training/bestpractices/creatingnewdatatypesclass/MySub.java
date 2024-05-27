package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

public class MySub extends MySuper {

    public static void main(String[] args) {

        new MySub();

    }

    int getResult() {

        super.x = 5;

        return x + 3;

    }

}
