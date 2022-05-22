package com.dicoding.javafundamental.basic.strukturdasar.solid.generalization;

public class Main {
    public static void main(String[] args) {
        ConsumableProduct consumableProduct = new ConsumableProduct();
        consumableProduct.setName("A");
        consumableProduct.setPrice(10000L);
        consumableProduct.setQuantity(100L);
        System.out.println(consumableProduct);

        ElectronicProduct electronicProduct = new ElectronicProduct();
        electronicProduct.setName("B");
        electronicProduct.setPrice(1000L);
        electronicProduct.setQuantity(10L);
        System.out.println(electronicProduct);

        HealtProduct healtProduct = new HealtProduct();
        healtProduct.setName("C");
        healtProduct.setPrice(10000000L);
        healtProduct.setQuantity(1L);
        System.out.println(healtProduct);
        System.out.println(healtProduct.getName());
    }
}
