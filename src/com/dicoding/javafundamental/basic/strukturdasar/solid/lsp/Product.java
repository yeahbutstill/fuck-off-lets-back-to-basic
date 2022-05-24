package com.dicoding.javafundamental.basic.strukturdasar.solid.lsp;

import org.joda.time.DateTime;

public abstract class Product {
    private String name;
    private String productInfo;

    public Product(String name, String productInfo) {
        this.name = name;
        this.productInfo = productInfo;
    }

    public Product() {
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    abstract DateTime getExpiredDate();

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }
}
