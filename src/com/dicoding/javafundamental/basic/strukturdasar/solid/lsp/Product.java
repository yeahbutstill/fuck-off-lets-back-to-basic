package com.dicoding.javafundamental.basic.strukturdasar.solid.lsp;

abstract class Product {

    abstract String getName();

    /**
     * Function to get all of information about product
     */
    public void getProductInfoVegetable() {
        // some magic code
        System.out.println("Product Info Vegetable");
        System.out.println("---------------------------");
        Vegetable vegetable = new Vegetable();
        System.out.println(vegetable.getName());
        System.out.println(vegetable.getExpiredDate());
        System.out.println("============================");
    }

    public void getProductInfoSmartPhone() {
        // some magic code
        System.out.println("Product Info SmartPhone");
        System.out.println("---------------------------");
        Smartphone smartphone = new Smartphone();
        System.out.println(smartphone.getName());
        System.out.println("============================");
    }


}

