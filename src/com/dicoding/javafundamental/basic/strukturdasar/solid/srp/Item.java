package com.dicoding.javafundamental.basic.strukturdasar.solid.srp;

public class Item {
    private String id;
    private String name;
    private String phoneNumber;
    private Integer nominal;

    public Item(String id, String name, String phoneNumber, Integer nominal) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.nominal = nominal;
    }

    public Item() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getNominal() {
        return nominal;
    }

    public void setNominal(Integer nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", nominal=" + nominal +
                '}';
    }
}
