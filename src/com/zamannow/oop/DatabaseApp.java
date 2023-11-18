package com.zamannow.oop;

import com.zamannow.oop.exception.ValidationUtil;

public class DatabaseApp {
    public static void main(String[] args) {
        ValidationUtil.connectedDatabase("admin", null);
    }
}
