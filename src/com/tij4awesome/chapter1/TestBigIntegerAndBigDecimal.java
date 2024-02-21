package com.tij4awesome.chapter1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class TestBigIntegerAndBigDecimal {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
        BigInteger bigInteger = new BigInteger(120, random);
        BigDecimal bigDecimal = new BigDecimal(120);
        System.out.println(bigInteger);
        System.out.println(bigDecimal);
    }
}
