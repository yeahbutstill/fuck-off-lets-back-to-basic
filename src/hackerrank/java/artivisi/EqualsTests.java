package hackerrank.java.artivisi;

import hackerrank.java.artivisi.entity.Product;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class EqualsTests {

    @Test
    public void testEqualsProduct() {
        Product p1 = new Product();
        p1.setCode("P001");
        p1.setName("Product 001");
        p1.setPrice(new BigDecimal("100000.00"));

        Product p2 = new Product();
        p2.setCode("P001");
        p2.setName("Product 001");
        p2.setPrice(new BigDecimal("100000.00"));

        Product p3 = p1;

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(" == ? " + (p1 == p2));
        System.out.println("Equals ? " + (p1.equals(p2)));
        System.out.println(" == ? " + (p1 == p3));

        p3.setCode("P003");
        System.out.println("Code: " + p1.getCode());

        String nama = "dani";
        String nama2 = "Dani";
        System.out.println("Nama Equals : " + nama.equals(nama2));

    }
}
