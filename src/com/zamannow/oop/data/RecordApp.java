package com.zamannow.oop.data;

import com.zamannow.oop.exception.ValidationException;
import com.zamannow.oop.exception.ValidationUtil;

public class RecordApp {
    public static void main(String[] args) {
        var loginReq = new LoginReq("dnl", "awsome");
        System.out.println(loginReq.username());
        System.out.println(loginReq.password());
        System.out.println(loginReq);
        loginReq.sayHello();
        System.out.println();

        var loginReq1 = new LoginReq(null, null);
        System.out.println(loginReq1);
        loginReq1.sayHello();
        System.out.println();

        var loginReq2 = new LoginReq("lnd");
        System.out.println(loginReq2.username());
        System.out.println(loginReq2.password());
        loginReq2.sayHello();
        System.out.println(loginReq2);
        System.out.println();
        System.out.println();
        System.out.println("====================================");

        LoginReq loginReq3 = new LoginReq(null, "    a");
        try {
            ValidationUtil.validateChecked(loginReq3);
            System.out.println(loginReq3.username());
            System.out.println(loginReq3.password());
            loginReq3.sayHello();
        } catch (ValidationException | NullPointerException e) {
            System.out.println("Terjadi error dengan pesan: " + e.getMessage());
        } finally {
            System.out.println("Error engga error, tetap di panggil");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        LoginReq loginReq4 = new LoginReq();
        ValidationUtil.validateRuntime(loginReq4);
    }
}
