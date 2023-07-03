package com.dicoding.javafundamental.basic.strukturdasar.solid.specialization;

import java.util.Objects;
import org.joda.time.DateTime;

public class ConsumableProduct extends Product {
    private String id;
    private String name;
    private Long price;
    private DateTime expirationDate;

    public ConsumableProduct(String id, String name, Long price, String id1, String name1, Long price1, DateTime expirationDate) {
        super(id, name, price);
        this.id = id1;
        this.name = name1;
        this.price = price1;
        this.expirationDate = expirationDate;
    }

    public ConsumableProduct(String id, String name, Long price, DateTime expirationDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Long getPrice() {
        return price;
    }

    @Override
    public void setPrice(Long price) {
        this.price = price;
    }

    public DateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(DateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ConsumableProduct that = (ConsumableProduct) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(price, that.price) && Objects.equals(expirationDate, that.expirationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, price, expirationDate);
    }

    @Override
    public String toString() {
        return "ConsumableProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
