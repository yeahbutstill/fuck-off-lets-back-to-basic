package com.artivisi.training.bestpractices.highprecisionnumbers;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestHighprecisionnumbers {
    public static void main(String[] args) {
        // untuk bilangan titik tetap dengan presisi arbitrer;
        // Anda dapat menggunakan ini untuk perhitungan moneter yang akurat
        BigDecimal decimal = new BigDecimal(10);
        // mendukung bilangan bulat presisi arbitrer.
        // Artinya, Anda dapat secara akurat merepresentasikan nilai integral
        // dengan ukuran berapa pun tanpa kehilangan informasi apa pun selama pengoperasian.
        BigInteger bigInteger = new BigInteger("10000");
        System.out.println(decimal);
        System.out.println(bigInteger);
    }
}
