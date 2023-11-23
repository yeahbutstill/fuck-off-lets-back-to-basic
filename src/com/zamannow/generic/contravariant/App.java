package com.zamannow.generic.contravariant;

import com.zamannow.generic.genericclass.MyData;

public class App {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>();
        objectMyData.setData("Saya");

        // valid kenapa? karena generic typenya Object, disini nih bahayanya
        // jadi hati-hati kalau menggunakan contravariant, aman di setData, tidak aman di getData
        objectMyData.setData(1000);
        System.out.println(objectMyData);

        MyData<? super String> myData = objectMyData;
        System.out.println(myData);

        App app = new App();
        app.process(myData);
        System.out.println(myData);
    }

    public void process(MyData<? super String> myData) {
        // nah kalau di contravariant ternyata malah bahaya ketika kita getData dan di cast menjadi String
        // karena yang dikirim ke parameter process adalah object new MyData yang di simpan di objectMyData
        // dimana dia generic parameternya Object, artinya kalau object itu bisa diset apapun itu, entah itu String ataupun lainnya
        // Jangan gara-gara ada super String, terus kita paksa menjadi String
        // jadi kalau mau aman ya balikinnya ke type parent class lagi A.K.A Object
        String data = (String) myData.getData();
        System.out.println("Process parameter " + data);
        myData.setData("Saya1");
    }
}
