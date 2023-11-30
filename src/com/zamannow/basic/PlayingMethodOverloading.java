package com.zamannow.basic;

/**
 * Mehtod Overloading adalah kemampuan meembuat method
 * dengan nama yang sama lebih dari satu.
 * Namun ada ketentuannya, yaitu data parameter di method
 * tersebut harus berbeda-beda untuk masing-masing baik dari
 * jumlah, tipe data parameternya.
 * Jika ada yang sama, maka program Java kita akan error
 */
public class PlayingMethodOverloading {
    public static void main(String[] args) {
        PlayingMethodOverloading playingMethodOverloading = new PlayingMethodOverloading();
        System.out.println(playingMethodOverloading.login("dnldnl", "hahahahaha"));
        System.out.println(playingMethodOverloading.login("dnldnl", "hahahahaha", "123"));
    }

    public String login(String username, String password) {
        if (username == username && password == password) {
            return "Login Berhasil";
        }
        return "Login Gagal";
    }

    // method overloading dari method yang atas
    public String login(String username, String password, String otp) {
        if (username == username && password == password && otp == otp) {
            return "Login Berhasil";
        }
        return "Login Gagal";
    }
}
