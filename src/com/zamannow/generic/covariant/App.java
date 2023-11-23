package com.zamannow.generic.covariant;

import com.zamannow.generic.genericclass.MyData;

public class App {
    public static void main(String[] args) {
        MyData<String> data = new MyData<>();
        data.setData("DNL");
        App app = new App();
        app.process(data);

        MyData<? extends Object> myData = data;
        System.out.println(myData);
    }

    // <? extends Object> ini adalah namanya covariant, ingat ini read only
    // cuman boleh ngambil data genericnya, contoh di MyData ada method getData yang dimana return type valuenya geenric.
    // nah tapi tidak boleh memanggil method yang parameternya generic type. contohnya di setData
    public void process(MyData<? extends Object> data) {
        Object o = data.getData();
        // sama kaya record berarti, di covariant kita hanya boleh ngambil data, tapi tidak boleh merubah datanya
        // data.setData("DAN"); // error
        System.out.println(o);
    }
}
