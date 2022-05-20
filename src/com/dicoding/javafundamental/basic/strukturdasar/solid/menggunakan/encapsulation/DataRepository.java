package com.dicoding.javafundamental.basic.strukturdasar.solid.menggunakan.encapsulation;

import java.util.ArrayList;
import java.util.List;

class DataRepository {
    private List data = new ArrayList();

//    public void setData() {
//        Response response = /* tons of logical code to retrieve data */
//                data.clear();
//        data.addAll(response.data);
//    }

    public List getData() {
        return data;
    }
}

