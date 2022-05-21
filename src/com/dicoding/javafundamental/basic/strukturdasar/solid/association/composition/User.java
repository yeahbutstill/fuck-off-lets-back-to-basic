package com.dicoding.javafundamental.basic.strukturdasar.solid.association.composition;

public class User {
    private String id;
    private String name;
    private Address address;

    public User(String id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
