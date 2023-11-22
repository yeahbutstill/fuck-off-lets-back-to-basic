package com.zamannow.oop.data;

import com.zamannow.oop.exception.ValidationException;
import com.zamannow.oop.exception.ValidationUtil;

public class RecordApp {
    public static void main(String[] args) {
        LoginReq loginReq = new LoginReq("dnl", "awsome");
        System.out.println(loginReq.username());
        System.out.println(loginReq.password());
        System.out.println(loginReq);
        loginReq.sayHello();
        System.out.println();

        LoginReq loginReq1 = new LoginReq(null, null);
        System.out.println(loginReq1);
        loginReq1.sayHello();
        System.out.println();

        LoginReq loginReq2 = new LoginReq("lnd");
        System.out.println(loginReq2.username());
        System.out.println(loginReq2.password());
        loginReq2.sayHello();
        System.out.println(loginReq2);
        System.out.println();
        System.out.println();
        System.out.println("====================================");

        /**
         * Try Catch
         * Saat kita memanggil sebuah function atau method yang bisa menyebabkan error atau exception, maka kita wajib
         * menggunakan try-catch expression di Java
         * Ini gunanya agar kita bisa menangkap exception yang terjadi, karena jika tidak ditangkap, lalu terjadi exception,
         * maka secara otomatis program kita akan berhenti.
         * Cara menggunakan try-catch expression di Java sangat mudah, di block try, kita tinggal panggil method yang
         * bisa menyebabkan error atau exception, dan di block catch, kita bisa melakukan sesuatu jika terjadi exception atau error
         * tapi kalau tidak terjadi error atau exception, block catch tidak akan di eksekusi atau dijalankan
         */
        LoginReq loginReq3 = new LoginReq(null, "    a");
        try {
            ValidationUtil.validateChecked(loginReq3);
            System.out.println(loginReq3.username()); // tidak dijalankan, karena terjadi error di statement method invocation, langsung lanjut ke block catch
            System.out.println(loginReq3.password()); // tidak dijalankan, karena terjadi error "-----------------------------"
            loginReq3.sayHello();
        } catch (ValidationException | NullPointerException e) { // block ini akan dieksekusi kalau terjadi error
            System.out.println("Terjadi error dengan pesan: " + e.getMessage());
        }

        /**
         * Finally Keyword
         * Dalam try-catch, kita bisa menambahkan block finally
         * Block finally ini adalah block dimana akan selalu dieksekusi baik terjadi error atau exception ataupun tidak error
         * Ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal di block try kita
         * ingin membaca file, di block catch kita akan tangkap jika terjadi error, dan di block finally error ataupun sukses membaca file
         * Kita wajib menutup koneksi ke file tersebut, biar tidak menggantung di memory
         */
        finally { // nah kalau block ini error engga error tetep eksekusi
            System.out.println("Error engga error, tetap di panggil");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        LoginReq loginReq4 = new LoginReq();
        ValidationUtil.validateRuntime(loginReq4);
    }
}
