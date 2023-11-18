package com.zamannow.oop.reflection;

import com.zamannow.oop.annotation.CreateUserReq;
import com.zamannow.oop.exception.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserReq createUserReq = new CreateUserReq();
        ValidationUtil.validationReflection(createUserReq);
    }
}
