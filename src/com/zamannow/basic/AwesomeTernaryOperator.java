package com.zamannow.basic;

public class AwesomeTernaryOperator {
    public static void main(String[] args) {
    /*
    Ternary operator adalah operator sederhana dari if statement
    Ternary operator terdiri dari kondisi yang dievaluasi, jika menghasilkan true maka
    nilai pertama yang diambil, jika false nila kedua yang diambil
     */
        int nilai = 70;
        // setelah ? kondisi nilai ke 1 if (true) : kondisi nilai ke 2 else (false)
        String ucapan = nilai >= 75 ? "Selamat anda lulus" : "silakan coba lagi";
        System.out.println(ucapan);
    }
}
