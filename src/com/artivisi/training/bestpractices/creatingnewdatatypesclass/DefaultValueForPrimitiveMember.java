package com.artivisi.training.bestpractices.creatingnewdatatypesclass;

public class DefaultValueForPrimitiveMember {
    // ketika tipe primitive berada di anggota class,
    // maka dijamin mendapatkan nilau bawaan atau default value
    // jika kita tidak menginisialisasinya
    boolean b;
    char ch;
    byte by;
    short sh;
    int i;
    long l;
    float f;
    double d;

    /*
    nilai default hanyalah jaminan Java ketika variable digunakan sebagai anggota class,
    hal ini memastikan bahwa variable anggota yang bertipe primitif akan selalu diinisialisasi
    (Sesuatu yang tidak dilakukan di C++). Namun, default value ini mungkin tidak benar atau bahkan
    legal untuk program yang anda tulis. Yang terbaik adalah selalu menginisialisasi variable anda secara eksplisit
     */

    public static void main(String[] args) {
        /*
         jaminan ini tidak berlaku untuk variable local, variable yang bukan merupakan bidang dari class,
         jadi, jika dalam definisi method anda memiliki seperti ini, ini adalah variable local.
         */
        int x;


        DefaultValueForPrimitiveMember defaultValueForPrimitiveMember = new DefaultValueForPrimitiveMember();
        System.out.println(defaultValueForPrimitiveMember);
//        System.out.println(x); // anda bertanggung jawab untuk menetapkan nilai yang sesuai sebelum anda menggunkannya
        /*
        jika anda lupa, anda akan mendapatkan kesalahan waktu kompilasi
         */
    }

    @Override
    public String toString() {
        return "DefaultValueForPrimitiveMember{" +
                "b=" + b +
                ", ch=" + ch +
                ", by=" + by +
                ", sh=" + sh +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                '}';
    }
}
