package com.zamannow.basic;

import java.math.BigDecimal;

public class VariableMenggunakanVar {
    // var namaOrangtua = "sae"; // ERROR, var hanya bisa digunakan didalam method.

    // konstant tidak bisa diubah, karena nilainya sudah diset saat pertamakali dibuat
    private final BigDecimal price = new BigDecimal("10000");
    private String name1;
    private Integer age1;

    public static void main(String[] args) {
        var name = "Dani";
        var age = 30;
        System.out.println(name);
        System.out.println(age);
        System.out.println();

        VariableMenggunakanVar variableMenggunakanVar = new VariableMenggunakanVar();
        variableMenggunakanVar.age1 = 29;
        variableMenggunakanVar.name1 = "Dnl";
        System.out.println(variableMenggunakanVar.name1);
        System.out.println(variableMenggunakanVar.age1);
        System.out.println(variableMenggunakanVar.price);
    }
}
