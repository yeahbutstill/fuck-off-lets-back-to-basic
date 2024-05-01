package com.tij4awesome.chapter1;

import com.tij4awesome.chapter1.Bird;
import com.tij4awesome.chapter1.Goose;
import com.tij4awesome.chapter1.Penguin;

public class TestBirdController {
    public static void main(String[] args) {
        Bird goose = new Goose();
        goose.move();
        Bird penguin = new Penguin();
        penguin.move();
    }
}
