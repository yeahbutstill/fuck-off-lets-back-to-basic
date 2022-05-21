package com.dicoding.javafundamental.basic.strukturdasar.solid.association.composition;

public class Main {
    public static final void main(String[] args) {
        User user = new User("1234", "Dani", new Address("123", "Depok"));
        System.out.println(user.toString());
    }
}
