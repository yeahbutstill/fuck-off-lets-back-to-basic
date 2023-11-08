package com.zamannow.stdclass;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Dani");
        buffer.append(" ");
        buffer.append("Setiawan");
        String namaLengkap = buffer.toString();
        System.out.println(namaLengkap);
    }
}
