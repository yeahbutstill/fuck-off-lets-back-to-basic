package com.dicoding.javafundamental.basic.strukturdasar.solid.nosolid.lsp;

import org.joda.time.DateTime;

public class Smartphone extends Product {

    @Override
    String setName() {
        return "Samsung S10+ Limited Edition";
    }

    @Override
    DateTime setExpiredDate() {
        return new DateTime(); // ???????
    }

}
