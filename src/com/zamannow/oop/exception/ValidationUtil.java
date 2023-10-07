package com.zamannow.oop.exception;

import com.zamannow.oop.data.LoginReq;

public class ValidationUtil {
  public static void validateChecked(LoginReq loginReq)
      throws ValidationException, NullPointerException {
    if (loginReq.username() == null) throw new NullPointerException("Username tidak boleh null");
    if (loginReq.username().isBlank())
      throw new ValidationException("Username tidak boleh ada spasi");
    if (loginReq.username().isEmpty()) throw new ValidationException("Username tidak boleh kosong");

    if (loginReq.password() == null) throw new NullPointerException("Password tidak boleh null");
    if (loginReq.password().isBlank())
      throw new ValidationException("Password tidak boleh ada spasi");
    if (loginReq.password().isEmpty()) throw new ValidationException("Password tidak boleh kosong");
  }

  public static void validateRuntime(LoginReq loginReq) {
    if (loginReq.username() == null) throw new BlankException("username tidak boleh null");
    if (loginReq.username().isEmpty()) throw new BlankException("username tidak boleh kosong");
    if (loginReq.username().isBlank()) throw new BlankException("username tidak boleh ada spasi");

    if (loginReq.password() == null) throw new BlankException("password tidak boleh null");
    if (loginReq.password().isBlank()) throw new BlankException("password tidak boleh ada spasi");
    if (loginReq.password().isEmpty()) throw new BlankException("password tidak boleh kosong");
  }
}
