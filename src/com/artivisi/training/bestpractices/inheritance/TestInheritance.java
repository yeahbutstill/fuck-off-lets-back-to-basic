package com.artivisi.training.bestpractices.inheritance;

import com.artivisi.training.bestpractices.serializable.Category;
import com.artivisi.training.bestpractices.serializable.Product;

import java.math.BigDecimal;

public class TestInheritance {
    public static void main(String[] args) {
        Product product = new Product();
        Category category = new Category();
        category.setCode("TestHP1");
        category.setName("TestCatNameHP1");
        product.setCategory(category);
        product.setName("HP OPOJARE1");
        product.setCode("HPOPOJARE1");
        product.setPrice(new BigDecimal(10000000));

        TransaksiInheritance transaksiInheritance = new TransaksiInheritance();
        transaksiInheritance.hitungTotal();

        System.out.println(product);
        System.out.println(category);
        System.out.println(transaksiInheritance);
    }
}
