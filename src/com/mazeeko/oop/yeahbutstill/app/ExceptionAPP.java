package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.exception.ValidateException;
import com.mazeeko.oop.recordclass.LoginRequest;
import com.mazeeko.oop.util.ValidationUtil;

public class ExceptionAPP {
  public static void main(String[] args) {

    /* checked exception always try catch
     * ini kalau error applikasi kita tidak akan mati
     */
    LoginRequest sasuke = new LoginRequest("", "rahasia");
    try {
      ValidationUtil.validate(sasuke);
    } catch (ValidateException | NullPointerException e) {
      System.out.println("Terjadi error dengan pesan: " + e.getMessage());
    } finally { // error gak error, tetap di panggil
      System.out.println("Terimakasih");
    }

    /* runtime exception
     * ini kalau error applikasi kita akan mati
     * makanya ini nanti akan berguna ketika kita pake framework, biar codenya clean dan nanti disimpan di ErrorHandler
     */
    LoginRequest maya = new LoginRequest(null, null);
    ValidationUtil.validateRuntime(maya);
  }
}
