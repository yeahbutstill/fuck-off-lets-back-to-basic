package com.zamannow.oop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Try with Resource
 * Di Java 7, terdapat fitur baru yang bernama try with resource
 * Try with resource ini adalah sebuah mekanisme agar kita lebih mudah menggunakan resource (yang wajib di close) dalam block try
 * Jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface AutoCloseable
 */
public class TestTryWithResourceAuto {
    public static void main(String[] args) {
        // auto close resource
        try (var reader = new BufferedReader(new FileReader("README.md"))) {
            while (true) {
                String text = reader.readLine();
                if (text == null) break;
                System.out.println(text);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
