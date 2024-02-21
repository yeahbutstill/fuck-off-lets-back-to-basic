package com.tij4awesome.chapter1;

public class DataOnly {
    int i;
    double d;
    boolean b;
    LeftTank leftTank;

    @Override
    public String toString() {
        return "DataOnly{" +
                "i=" + i +
                ", d=" + d +
                ", b=" + b +
                ", leftTank=" + leftTank +
                '}';
    }

    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        // cara merujuk ke anggota suatu objek
        // objectReference.member
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println(data);

        // mungkin juga object anda berisi object lain yang berisi data yang ingin anda modifikasi
        // untuk ini, anda cukup terus "menghubungkan titik-titik"
        DataOnly myPlane = new DataOnly();
        myPlane.leftTank.capacity = 100;
        System.out.println(myPlane);
    }
}
