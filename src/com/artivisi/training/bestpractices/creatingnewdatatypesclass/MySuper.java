package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

public class MySuper {

    int x = 1;


    public MySuper() {

        System.out.print(getResult(3));

    }

    int getResult() {

        return x;

    }

    int getResult(int i) {

        return (i + x + getResult() + x);

    }

}


