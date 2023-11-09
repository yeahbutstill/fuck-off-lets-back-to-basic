package com.zamannow.stdclass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestBigNumber {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1000000000000000000000"); // anggap saja ini melebihi batas maksimal nilai yang tipenya Long
        BigInteger b = new BigInteger("1000000000000000000000");
        BigDecimal a1 = new BigDecimal("2000000000000000000000");
        BigDecimal b1 = new BigDecimal("2000000000000000000000");
        // tambah
        BigInteger resultBigInt = a.add(b);
        BigDecimal resultBigDeci = a1.add(b1);
        System.out.println("tambah " + resultBigInt);
        System.out.println("tambah " + resultBigDeci);
        // kurang
        System.out.println(resultBigInt.subtract(resultBigDeci.toBigInteger()));
        // kali
        System.out.println(resultBigInt.multiply(resultBigInt));
        // bagi
        System.out.println(resultBigInt.divide(resultBigInt));
        // hasi sisa bagi
        System.out.println(resultBigInt.mod(resultBigInt));

    }

}
