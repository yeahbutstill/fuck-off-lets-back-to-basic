package test;

import java.math.BigDecimal;

import com.artivisi.training.bestpractices.CaseInsensitiveString;
import com.artivisi.training.bestpractices.Product;
import org.junit.Test;

public class EqualsTests {

    @Test
    public void testEqualsProduct(){
        Product p1 = new Product();
        p1.setCode("P001");
        p1.setName("Transaksi 001");
        p1.setPrice(new BigDecimal("100000.00"));

        Product p2 = new Product();
        p2.setCode("P001");
        p2.setName("Transaksi 001");
        p2.setPrice(new BigDecimal("100000.00"));

        Product p3 = p1;

        System.out.println(" == ? "+(p1 == p2));  // true
        System.out.println("Equals ? "+(p1.equals(p2))); // false

        System.out.println(" == ? "+(p1 == p3));

        p3.setCode("P003");
        System.out.println("Code : "+p1.getCode());

        String nama = "endy";
        String nama2 = "Endy";
        System.out.println("Nama Equals : "+nama.equals(nama2));
    }

    @Test
    public void testSymmetry() {
        CaseInsensitiveString cs = new CaseInsensitiveString("endy");
        String s = "Endy";

        System.out.println("cs.equals(s) : "+cs.equals(s));
        System.out.println("s.equals(cs) : "+s.equals(cs));
    }
}