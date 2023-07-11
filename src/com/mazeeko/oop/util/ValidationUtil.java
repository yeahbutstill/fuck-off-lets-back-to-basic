package com.mazeeko.oop.util;

import com.mazeeko.oop.exception.ValidateException;
import com.mazeeko.oop.recordclass.LoginRequest;

public class ValidationUtil {
  /**
   *  exception itu biasanya terjadi di method, artinya ketika kita membuat exception di sebuah method,
   *  maka method tersebut harus ditandai dengan throw diikuti dengan class exception nya.
   *  jika method tersbut bisa menimbulkan lebih dari 1 class exception, maka kita bisa menambahkan lebih dari 1 class exception.
   *  inti dari ini adalah buat memberitau ke orang yang akan menggunakan method tersebut, kalau method tersebut bisa terjadi error(exception)
   */
  public static void validate(LoginRequest loginRequest) throws ValidateException, NullPointerException {
    if (loginRequest.username() == null) {
      throw new NullPointerException("username is null");
    } else if (loginRequest.password() == null) {
      throw new NullPointerException("password is null");
    } else if (loginRequest.password().isBlank()) {
      throw new ValidateException("password is blank");
    } else if (loginRequest.username().isBlank()) {
      throw new ValidateException("username is blank");
    } else {
      System.out.println("Success");
    }
  }
}
