package com.mazeeko.dasar;

public class Expression {
    public static void main(String[] args) {
        // Expression adalah konstruksi dari variable, operator dan pemanggilan method yang mengevaluasi menjadi sebuah single value
        // expression adalah core component dari statement
        int value;
        value = 10; // pokoknya kalau yang single value atau yang menghasilkan single value itu adalah expression

        // Ini statement
        System.out.println(value = 100 /* Ini expression*/);
    }
}
