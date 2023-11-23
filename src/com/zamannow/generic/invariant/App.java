package com.zamannow.generic.invariant;

import com.zamannow.generic.genericclass.MyData;

public class App {
    public static void main(String[] args) {
        /**
         * Lihat setiap warpper class di java itu turunan dari Object
         * Rules:
         * - Tidak boleh mengsubtitut generic parameter type
         * - Tidak ada hubungannya Polymorphism dan Inheritance dengan Generic
         */
        MyData<String> objectMyData = new MyData<>();
        objectMyData.setData("DNL");
        //MyData<Object> objectMyData1 = objectMyData; // error

        MyData<Object> objectMyData2 = new MyData<>();
        objectMyData2.setData(9_999_999);
        //MyData<Integer> objectMyData21 = objectMyData2; // error

        // terus lu liat String, terus berharap wih bisa nih HAHAHAHAHAHA
        MyData<String> culture = new MyData<>("Your Dev is Good, BUT YOUR PRODUCT IS SO BAD");
        //goingSWEEz(culture); // error, karena INVARIANT

        var objectMyData3 = new MyData<>("Java juga?");
        var coba = objectMyData3;
        System.out.println(coba);

        var objectMyData4 = new MyData<>("Java juga nih?");
        //goingSWEEz(objectMyData4); // error
        //System.out.println(cobaa);
    }

    // iya dilihat object
    public static void goingSWEEz(MyData<Object> objectMyData) {
        System.out.println("KILLING IN THE NAME");
    }
}
