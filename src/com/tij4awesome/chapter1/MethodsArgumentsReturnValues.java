package com.tij4awesome.chapter1;

// mengimport secara eksplisit

public class MethodsArgumentsReturnValues {
    static int f() {
        return 20_000;
    }

    public static void main(String[] args) {
        MethodsArgumentsReturnValues methodsArgumentsReturnValues = new MethodsArgumentsReturnValues();
        System.out.println(methodsArgumentsReturnValues.methodName("DNL"));
        int x = methodsArgumentsReturnValues.f();
        System.out.println(methodsArgumentsReturnValues.storage("Maya"));
        System.out.println(x);
        System.out.println();
        System.out.println();

        // return type non void
        System.out.println(methodsArgumentsReturnValues.flag());
        System.out.println(methodsArgumentsReturnValues.naturalLogBase());
        // return type void
        methodsArgumentsReturnValues.nothing();
        methodsArgumentsReturnValues.nothing1();
    }

    // Daftar argument di method menentukan informasi apa yang adana berikan ke dalam method.
    // Jadi yang harus anda tentukan dalam daftar argument adalah tipe object yang akan diteruskan
    // dan nama yang akan digunakan untuk masing-masing object
    // anda dapat melihat kata kunci return, ada 2 hal yang bisa dilakukan
    // Pertama artinya "Tingalkan methodd ini, saya sudah selesai"
    // Kedua, jika method menghasilkan suatu nilai, nila tersebut tepat setelah pernyataan return
    // Dalam hal ini, nilai kembalian dihasilkan dengan mengevaluasi ekspresi s.length() * 2;

    String methodName(String name) {
        return name;
    }

    // anda dapat mengembalikan tipe apa pun yang anda inginkan, tetapi jika anda tidak ingin mengembalikan apa pun
    // anda melakukannya dengan menunjukan bawah method tersebut mengembalikan void

    /**
     * method ini memberitahu anda berapa banyak byte yang diperlukan untuk menyimpan informasi dalam String tertentu
     * (Ukuran setiap karakter (char) dalam sebuah String adalah 16 bit, atau 2 byte, untuk menddukung karakter unicode
     *
     * @param s
     * @return mengembalikan jumlah karekter dalam sebuah string
     */
    int storage(String s) {
        return s.length() * 2;
    }

    // tetapi jika anda memberikan tipe pengembalian non-void seperti
    // Integer, String, atau TypeClassLain
    // kompailer akan memaksa anda (dengan pesan kesalahan) untuk mengembalikan tipe nilai yang sesuai
    boolean flag() {
        return true;
    }

    double naturalLogBase() {
        return 2.718;
    }

    // jika tipe pengembalian void, maka kata kunci return hanya digukan untuk keluar dari method
    // dan oleh karena itu tidak diperlukan saat anda mencapai akhir method. Anda dapat kembali
    // dari suatu method kapan saja.
    void nothing() {
        return;
    }

    void nothing1() {
    }


}
