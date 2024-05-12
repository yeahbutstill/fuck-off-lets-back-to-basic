package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

public class TestCallMethod {
    public static void main(String[] args) {
        // method static dipanggil tanpa harus membuat object terlebih dahulu
        MethodArgumentReturnValue.wellcome();

        MethodArgumentReturnValue marv = new MethodArgumentReturnValue();
        // anda memanggil method untuk suatu object dengan memberi nama object tersebut
        // diikuti dengan titik lalu diikuti dengan nama method dan daftar argumentnya.
        // seperti ini:
        // objectName.methodName(arg1, arg2, arg3);
        marv.setName("Dnl");
        marv.setAge("30");
        System.out.println(marv.getName());
        System.out.println(marv.getAge());

        // Anda memiliki method satuKaliSatu() yang tidak memerlukan argument
        // dan mengembalikan nilai bertipe int. Kemudian, jika anda memiliki object
        // bernama marv yang dapat dipanggil dengan satuKaliSatu(), anda dapat mengatakan ini:
        // pesannya adalah satuKaliSatu() dan objectnya adalah marv. Pemrograman OOP sering diringkas
        // sebagai sekedar "mengirim pesan ke object"
        int i = marv.satuKaliSatu();
        System.out.println(i);
        // Tipe nilai yang dikembalikan harus kompatibel dengan tipe i. Tindakan pemanggilan suatu
        // method ini biasa disebut dengan pengiriman pesan ke suatu object.

        System.out.println(marv.storage("Dani Stiawan"));
        System.out.println("==============================");
        marv.nothing();
        marv.nothing2();
    }
}
