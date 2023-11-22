package com.zamannow.oop;

import com.zamannow.oop.data.Customer;
import com.zamannow.oop.data.enums.Level;

import java.util.Arrays;

public class DemoEnums {
    public static void main(String[] args) {
        Customer customer = new Customer("Sakura", Level.STANDARD);

        System.out.println(customer.name());
        System.out.println(customer.level().getDescription());
        System.out.println();

        // konversi dari Enum ke String
        String levelString = Level.STANDARD.name();

        // konversi dari String ke Enum
        Level levelEnum = Level.valueOf("STANDARD");

        // ambli list semua enum yang ada di lalu return ke Array Level
        Level[] valueEnums = Level.values();

        System.out.println(levelString);
        System.out.println(levelEnum);
        System.out.println(Arrays.stream(valueEnums).toList());
        System.out.println();

        for (Level level : valueEnums) {
            System.out.println(level);
        }
    }
}
