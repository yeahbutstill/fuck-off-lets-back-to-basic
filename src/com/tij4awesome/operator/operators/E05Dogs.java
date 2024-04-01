package com.tij4awesome.operator.operators;

// Create a class called Dog with two Strings:
// name and says. In main(), create two dogs, 
// "spot" who says, "Ruff!", and "scruffy" who says, "wurf!"
// Then display their names and what they say
public class E05Dogs {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "spot";
        spot.says = "ruff!";
        scruffy.name = "scruffy";
        scruffy.says = "wurf!";
        System.out.println(spot.name + " says: " + spot.says);
        System.out.println(scruffy.name + " says: " + scruffy.says);
        System.out.println(spot.equals(scruffy));
    }
}

/***
 * Ini memandu Anda memahami dasar-dasar objek,
 * dan menunjukkan bahwa setiap objek memiliki ruang penyimpanannya
 * sendiri yang berbeda.
 */

class Dog {
    String name;
    String says;
}
