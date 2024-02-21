package com.tij4awesome.chapter1;

/***
 * Ketika tipe data primitif adalah anggota class, maka dijamin mendapatkan nilai default
 * jika anda tidak menginisialisasinya
 */
public class DefaultValueForPrimitiveMember {
    boolean b;
    char c;
    byte by;
    short sh;
    int i;
    long l;
    float f;
    double d;

    @Override
    public String toString() {
        return "DefaultValueForPrimitiveMember{" +
                "b=" + b +
                ", c=" + c +
                ", by=" + by +
                ", sh=" + sh +
                ", i=" + i +
                ", l=" + l +
                ", f=" + f +
                ", d=" + d +
                '}';
    }

    /***
     * nilai defualt hanyalah jaminan Java ketika variable digunakan sebagai anggota class
     * Hal ini memastikan bahwa variable anggota tipe primitif akan selalu diinisialisasi
     * (sesuatu yang tidak dilakukan di C++)
     * Yang terbaik adalah selalu menginisialisasi variable Anda secara eksplisit
     * @param args
     */
    public static void main(String[] args) {
        // jaminan ini tidak berlaku untuk variable lokal, variable yang bukan merupakan bidang kelas
        // dia biasanya ada di method, x akan mendapatkan nilai arbitrer ini tidak akan secara otomatis
        // diinisialisasi ke nol
        // anda bertanggung jawab untuk menetapkan nilai yang sesuai sebelum anda menggunakan x
        // jika anda lupa, anda mendpatkan pesan kesalahan waktu kompilasi yang memberi tahu anda bahwa variable
        // mungkin belum diinisialisasi
        int x;
        DefaultValueForPrimitiveMember defaultValueForPrimitiveMember = new DefaultValueForPrimitiveMember();
        System.out.println(defaultValueForPrimitiveMember);
        //System.out.println(x);
    }

}
