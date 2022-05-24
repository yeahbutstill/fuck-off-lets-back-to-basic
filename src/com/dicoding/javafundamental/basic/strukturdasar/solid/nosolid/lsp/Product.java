package com.dicoding.javafundamental.basic.strukturdasar.solid.nosolid.lsp;

import org.joda.time.DateTime;

abstract class Product {

    abstract String setName();

    abstract DateTime setExpiredDate();

    /**
     * Function to get all of information about product
     */
    public void getProductInfoVegetable() {
        // some magic code
        System.out.println("Product Info");
        System.out.println("---------------------------");
        Vegetable vegetable = new Vegetable();
        System.out.println(vegetable.setName());
        System.out.println(vegetable.setExpiredDate());
        System.out.println("============================");
    }

    public void getProductInfoSmartPhone() {
        // some magic code
        System.out.println("Product Info");
        System.out.println("---------------------------");
        Smartphone smartphone = new Smartphone();
        System.out.println(smartphone.setName());
        System.out.println(smartphone.setExpiredDate());
        System.out.println("============================");
    }


}

