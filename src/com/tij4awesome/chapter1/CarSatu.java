package com.tij4awesome.chapter1;

import java.math.BigDecimal;

/***
 * Inheritance tidak memiliki fleksibelitas seperti composition
 * karena compailer harus menempatkan batasan waktu kompilasi pada kelas yang dibuat
 * dengan pewarisan(inheritance)
 */
public class CarSatu extends EngineSatu {
    private String name;
    private BigDecimal price = BigDecimal.ZERO;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarSatu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
