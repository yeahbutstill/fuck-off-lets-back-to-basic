package com.zamannow.testsoaljava.junior.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversePrint {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Masukan Kata: ");
            StringBuffer input = new StringBuffer(br.readLine());
            System.out.println(input.reverse());
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}