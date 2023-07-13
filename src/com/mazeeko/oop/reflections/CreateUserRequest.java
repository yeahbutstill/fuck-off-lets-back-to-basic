package com.mazeeko.oop.reflections;

import com.mazeeko.oop.annotation.NotBlank;

/*
Reflection adalah kemampuan melihat struktur aplikasi kita pada saat berjalan
Reflection biasanya sangat berguna pada saat kita ingin membuat lib atau framework, sehingga bisa meng-automasikan pekerjaan
Untuk mengakses reflection class dari sebuaj object, kita bisa menggunakan method getClass() atau NamaClass.class
 */
public class CreateUserRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
