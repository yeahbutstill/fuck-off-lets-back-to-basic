package com.mazeeko.oop.yeahbutstill.app;

import com.mazeeko.oop.reflections.CreateUserRequest;
import com.mazeeko.oop.util.ValidationUtil;

public class TestReflectionApp {
  public static void main(String[] args) {
    CreateUserRequest request = new CreateUserRequest();
    request.setUsername("");
    request.setPassword(null);

    ValidationUtil.validationReflection(request);
  }
}
