package com.zamannow.stdclass;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("application.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.out.println("Gagal load data dari file");
        }

        properties.put("hobby", "coding");
        properties.put("owner", "dnl");
        try (FileOutputStream fileOutputStream = new FileOutputStream("application.properties")) {
            properties.store(fileOutputStream, "Komentar");
        } catch (IOException e) {
            System.out.println("Gagal memasukan properties");
        }

        System.out.println(properties.getProperty("database.host"));
        System.out.println(properties.getProperty("database.port"));
        System.out.println(properties.getProperty("database.username"));
        System.out.println(properties.getProperty("database.password"));
    }
}
