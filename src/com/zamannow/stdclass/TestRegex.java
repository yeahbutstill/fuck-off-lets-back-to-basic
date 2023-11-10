package com.zamannow.stdclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String nama = "Bejo wono soro serabi aja nih";
        Pattern pattern = Pattern.compile("[a-zA-z]*[a][a-zA-z]*");
        Matcher matcher = pattern.matcher(nama);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
