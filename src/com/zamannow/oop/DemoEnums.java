package com.zamannow.oop;

import com.zamannow.oop.data.Customer;
import com.zamannow.oop.data.enums.Level;

import java.util.Arrays;

public class DemoEnums {
    public static void main(String[] args) {
        Customer customer = new Customer(Level.STANDARD);
        System.out.println(customer);
        System.out.println(customer.level().getDescription());
        System.out.println();
        String levelString = Level.STANDARD.name();
        Level levelEnum = Level.valueOf("STANDARD");
        Level[] valueEnums = Level.values();
        System.out.println(levelString);
        System.out.println(levelEnum);
        System.out.println(Arrays.stream(valueEnums).toList());
    }
}
