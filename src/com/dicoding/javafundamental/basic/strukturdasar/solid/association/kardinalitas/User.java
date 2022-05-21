package com.dicoding.javafundamental.basic.strukturdasar.solid.association.kardinalitas;

import java.util.List;

public class User {
    private String id;
    private String name;
    // one to many
    private List<Seller> sellerList;
}
