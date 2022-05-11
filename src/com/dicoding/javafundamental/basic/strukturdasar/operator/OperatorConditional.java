package com.dicoding.javafundamental.basic.strukturdasar.operator;

public class OperatorConditional {
    public static void main(String[] args) {
        int value = 4;
        int anotherValue = 5;

        System.out.println("Conditional AND");
        // Pada kode yang menerapkan Operator AND
        // terlihat bila ada salah satunya tidak memenuhi syarat yang sudah diberikan, hasilnya adalah nilai false.
        boolean result = value == 3 && anotherValue == 5;
        boolean anotherResult = value != 3 && anotherValue == 5;

        System.out.println("Hasil Operator AND pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator AND pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();
        System.out.println("Conditional OR");

        // Berkebalikan dengan operator Conditional AND, Operator OR
        // akan memberikan nilai true apabila salah satunya sudah memenuhi syarat.
        result = value == 3 || anotherValue == 5;
        anotherResult = value != 3 || anotherValue == 5;

        System.out.println("Hasil Operator OR pada syarat value == 3 dan anotherValue == 5 adalah " + result);
        System.out.println("Hasil Operator OR pada syarat value != 3 dan anotherValue == 5 adalah " + anotherResult);
        System.out.println();

    }
}
