package com.dicoding.javafundamental.basic.strukturdasar.solid.lsp;

import org.joda.time.DateTime;

public abstract class FoodProduct extends Product {
    private DateTime expiredDate;

    public FoodProduct(String name, String productInfo, DateTime expiredDate) {
        super(name, productInfo);
        this.expiredDate = expiredDate;
    }

    public FoodProduct(DateTime expiredDate) {
        this.expiredDate = expiredDate;
    }

    public FoodProduct(String name, String productInfo) {
        super(name, productInfo);
    }

    public FoodProduct() {
    }

    public abstract DateTime getExpiredDate();

    public void setExpiredDate(DateTime expiredDate) {
        this.expiredDate = expiredDate;
    }
}
