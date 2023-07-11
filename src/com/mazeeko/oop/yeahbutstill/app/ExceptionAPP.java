package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.exception.ValidateException;
import com.mazeeko.oop.recordclass.LoginRequest;
import com.mazeeko.oop.util.ValidationUtil;

public class ExceptionAPP {
  public static void main(String[] args) {
    LoginRequest sasuke = new LoginRequest("", "rahasia");
    // please always try dont throw exception with runtime
    try {
      ValidationUtil.validate(sasuke);
    } catch (ValidateException | NullPointerException e) {
      System.out.println("Terjadi error dengan pesan: " + e.getMessage());
    } finally{ // error gak error, tetap di panggil
      System.out.println("Terimakasih");
    }
  }
}
