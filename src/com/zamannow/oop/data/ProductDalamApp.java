package com.zamannow.oop.data;

import java.math.BigDecimal;

public class ProductDalamApp {
    public static void main(String[] args) {
        Product product1 = new Product("Mac Book Pro", new BigDecimal(25_000_000));
        System.out.println(product1);

        Product product2 = new Product("Asus Tuf Gaming", new BigDecimal(12_000_000));
        System.out.println(product2);

        Category ct001 = new Category("CT001", false);
        ct001.setId(null);
        System.out.println(ct001.getId());
        System.out.println(ct001.isExpensive());

        System.out.println();

        CategoryBahaya ct002 = new CategoryBahaya("CT002", false);
        ct002.setId(null); // broken
        ct002.setExpensive(null); // broken
        System.out.println(ct002.getId());
        System.out.println(ct002.isExpensive());
    }
}
