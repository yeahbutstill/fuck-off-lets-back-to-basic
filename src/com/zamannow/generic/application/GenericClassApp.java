package com.zamannow.generic.application;

import com.zamannow.generic.genericclass.MyData;
import com.zamannow.generic.genericclass.multipleparametertype.Pair;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>();
        stringMyData.setData("DNL");
        System.out.println(stringMyData.getData());

        MyData<Integer> integerMyData = new MyData<>();
        integerMyData.setData(1);
        System.out.println(integerMyData.getData());

        Pair<String, String> stringStringPair = new Pair<>();
        stringStringPair.setFirst("pertama");
        stringStringPair.setSecond("kedua");
        System.out.println(stringStringPair);

        Pair<String, Integer> stringIntegerPair = new Pair<>();
        stringIntegerPair.setFirst("pertama");
        stringIntegerPair.setSecond(2);
        System.out.println(stringIntegerPair);
    }
}
