package com.zamannow.basic;

public class AwesomeScope {
    /*
    Di Java variable hanya bisa diakses di dalam area dimana mereka dibuat.
    Hal ini disebut scope.
    Contoh, jika sebuah variable dibuat di method, maka hanya bisa diakses di method tersebut, atau
    jika dibuat didalam bloack, maka hanya bisa diakses didalam block tersebut
     */
    public static void main(String[] args) {
        String nameinMain = "dnl";
        System.out.println(nameinMain);
        System.out.println();
        sayHello("     ");
        sayHello("dnldnl");
    }

    static void sayHello(String name) {
        if (!(name.isBlank())) {
            String hi = "Hi " + name;
            System.out.println(hi);
        } else {
            String hello = "Hello " + name;
            System.out.println(hello);
        }

        // System.out.println(hi); // error di luar scope
        // System.out.println(nameinMain); // error di luar scope

    /*
    Komentar
    kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut.
    Komentar adalah kode program yang akan dihiraukan saat proses kompilasi, sehingga di binary code Java,
    tidak akan ada kode komentar tesebut.
    Biasanya komentar digunakan untuk dokumentasi
     */
    }

    /**
     * Menghitung jumlah a + b
     *
     * @param a nilai a
     * @param b nilai b
     * @return a + b
     */
    static int sum(int a, int b) {
        // jumlahkan a + b
        return a + b;
    }
}
