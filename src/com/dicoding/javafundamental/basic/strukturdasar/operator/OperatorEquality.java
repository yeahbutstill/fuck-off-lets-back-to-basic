package com.dicoding.javafundamental.basic.strukturdasar.operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int value = 5;
        int anotherValue = 4;
        boolean result;
        result = value == anotherValue;

        System.out.println("Hasil 'value == anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Tidak sama dengan..");
        result = value != anotherValue;
        System.out.println("Hasil 'value != anotherValue' adalah " + result);

        System.out.println("Lebih besar dari..");
        result = value > anotherValue;
        System.out.println("Hasil 'value > anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Sama atau lebih besar dari..");
        result = value >= anotherValue;
        System.out.println("Hasil 'value >= anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Kurang dari..");
        result = value < anotherValue;
        System.out.println("Hasil 'value < anotherValue' adalah " + result);
        System.out.println();

        System.out.println("Sama atau kurang dari dengan..");
        result = value <= anotherValue;
        System.out.println("Hasil 'result <= anotherValue' adalah " + result);
        System.out.println();


    }
}

/**
 * Perhatikan kode berikut:
 * <p>
 * int value = 5;
 * int anotherValue = 4;
 * <p>
 * result = value == anotherValue;
 * result = value != anotherValue;
 * result = value > anotherValue;
 * result = value >= anotherValue;
 * result = value < anotherValue;
 * result = value <= anotherValue;
 * Operator Unary pada Java terlihat pada cuplikan kode di atas. Output-nya menghasilkan nilai berupa true/false sesuai
 * kondisi nilai yang diberikan.
 */