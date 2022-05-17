package com.dicoding.javafundamental.basic.strukturdasar.oop.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            // mencoba membaca berkas namefile.txt
            String location = "namafile.txt";
            File file = new File(location);
            FileReader fileReader = new FileReader(file);

            // jika berhasil maka tampilkan pesan
            System.out.println("Read file berhasil");
        } catch (FileNotFoundException e) {
            // jika terjadi kesalahan maka tampilkan pesan ini
            throw new RuntimeException(e);
        }
    }
}
