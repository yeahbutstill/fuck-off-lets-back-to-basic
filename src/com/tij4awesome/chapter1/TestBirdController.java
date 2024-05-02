package com.tij4awesome.chapter1;

public class TestBirdController {
    public static void main(String[] args) {
        Bird goose = new Goose();
        goose.move();
        Bird penguin = new Penguin();
        penguin.move();
    }
}
