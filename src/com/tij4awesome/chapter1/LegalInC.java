package com.tij4awesome.chapter1;

public class LegalInC {
    public static void main(String[] args) {
        {
            int x = 12;
            {
                //int x = 96; // tapi kalau di Java ini Illegal atau tidak boleh
                System.out.println(x);
            }
            System.out.println(x);
        }
    }
}
