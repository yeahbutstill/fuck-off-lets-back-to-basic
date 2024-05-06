package com.tij4awesome.chapter1;

public class KelasWrapper {
    public static void main(String[] args) {
        char c = 'x';
        // class wrapper untuk data primitif memungkinkan anda membut object non-primitif di Heap
        // untuk mewakili tipe primitif tersebut:
        Character ch = new Character(c);
        System.out.println(ch);

        // atau anda juga bisa menggunakan ini:
        Character ch1 = new Character('x');
        System.out.println(ch1);

        // autoboxing akan secara otomatis mengkonversi dari tipe primitif ke tipe wrapper:
        // wrapper
        Character ch2 = 'x';
        System.out.println(ch2);
        // primitif
        char c1 = ch2;
        System.out.println(c1);


    }
}
