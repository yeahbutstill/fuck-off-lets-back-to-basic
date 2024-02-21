package com.tij4awesome.chapter1;

public class ScopeOfObjects {
    public static void main(String[] args) {
        {
            String s = new String("a String");
            // end of scope
        }
    }
}
