package com.zamannow.stdclass;

import java.util.Base64;

public class TestBase64 {
    public static void main(String[] args) {
        String query = "dump() test() java";
        // encode
        String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(encode);

        // decode
        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);
    }
}
