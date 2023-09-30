package com.yeahbutstill.java21.artivisi;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class EqualTest {
    @Test
    void testEqualsProduct() {
        Product p1 = new Product();
        p1.setCode("P001");
        p1.setName("Product 001");
        p1.setPrice(BigDecimal.valueOf(1_000_000.00));

        Product p2 = new Product();
        p2.setCode("P001");
        p2.setName("Product 001");
        p2.setPrice(BigDecimal.valueOf(1_000_000.00));

        Product p3 = new Product();
        p3.setCode("P003");
        p3.setName("Product 003");
        p3.setPrice(BigDecimal.valueOf(50_000.00));

        Product p4 = p3;

        System.out.println(" == ? " + (p1 == p2)); // false karena ada new, sudah di object yang berbeda
        System.out.println("Equals ? " + (p1.equals(p2))); // true di object yang berbeda namun isi propertinya sama
        System.out.println(p4 == p3); // true di object yang sama
    }
}
