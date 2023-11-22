package com.zamannow.oop.data.enums;

public enum Level {
    // enum properties
    STANDARD("Standard Edition"), // saat teman-teman bikin constructor, maka secara otomatis saat membuat opsi enumnya disini, teman-teman harus manggil langsung si constructornya
    PREMIUM("Premium Edition"),
    VIP("Vip Edition");

    // properties
    private final String description;

    // constructor, khusus ini kita tidak bisa membuat public constructor, karena memang tujuan enum bukan untuk di instansiasi secara bebas
    // bukan untuk dibuat objeknya, tapi memang untuk langsung dipake si pilihan enumnya, jadi tidak boleh public access modifiernya
    Level(String description) {
        this.description = description;
    }

    // method
    public String getDescription() {
        return description;
    }
}
