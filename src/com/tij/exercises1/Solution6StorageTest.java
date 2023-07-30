package com.tij.exercises1;

public class Solution6StorageTest {
    public static void main(String[] args) {
        class StoreStuff {
            int storage(String s) {
                return s.length() * 2;
            }
        }

        StoreStuff storeStuff = new StoreStuff();
        System.out.println(storeStuff.storage("h1"));
    }
}
