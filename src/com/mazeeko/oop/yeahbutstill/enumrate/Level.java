package com.mazeeko.oop.yeahbutstill.enumrate;

public enum Level {
    STANDARD("Standard Edition"),
    PREMIUM("Premium Edition"),
    VIP("VIP Edition");

    private final String description;

    // khusus constructor, kita tidak bisa membuat public constructor
    // karena memang tujuan enum bukan untuk di instanisasi secara bebas
    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
