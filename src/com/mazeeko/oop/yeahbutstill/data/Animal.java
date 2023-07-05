package com.mazeeko.oop.yeahbutstill.data;

public abstract class Animal {
    public String name;

    // kalau abstract cuman definisi, implementasi di kelas childnya dengan wajib harus override
    public abstract void run();
}
