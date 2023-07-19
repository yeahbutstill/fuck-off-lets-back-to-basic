package com.dicoding.javafundamental.basic.strukturdasar.solid.specialization;

import org.joda.time.DateTime;

import java.util.Objects;

public class ElectronicProduct extends Product {
    private String id;
    private String name;
    private Long price;
    private DateTime productionDate;

    public ElectronicProduct(String id, String name, Long price, String id1, String name1, Long price1, DateTime productionDate) {
        super(id, name, price);
        this.id = id1;
        this.name = name1;
        this.price = price1;
        this.productionDate = productionDate;
    }

    public ElectronicProduct(String id, String name, Long price, DateTime productionDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productionDate = productionDate;
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

    public DateTime getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(DateTime productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElectronicProduct that = (ElectronicProduct) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(price, that.price) && Objects.equals(productionDate, that.productionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, name, price, productionDate);
    }

    @Override
    public String toString() {
        return "ElectronicProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productionDate=" + productionDate +
                '}';
    }
}
