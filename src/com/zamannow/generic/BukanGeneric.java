package com.zamannow.generic;

public class BukanGeneric {
    public static void main(String[] args) {
        DataBukanGeneric dataBukanGeneric = new DataBukanGeneric();
        dataBukanGeneric.setData("DNL");
        String data = (String) dataBukanGeneric.getData();
        System.out.println(data);
    }
}