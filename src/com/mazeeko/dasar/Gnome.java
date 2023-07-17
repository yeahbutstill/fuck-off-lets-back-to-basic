package com.mazeeko.dasar;

public class Gnome {
    // instance variable
    public String name;
    public int age;
    public Gnome gnomeBuddy;
    private boolean magical = false;
    protected double height = 2.6;
    public static final int MAX_HEIGHT = 3; // maximum height

    // constructor
    Gnome(String nm, int ag, Gnome bud, double hgt) { // fully parameterized
        name = nm;
        age = ag;
        gnomeBuddy = bud;
        height = hgt;
    }

    // default constructor
    Gnome() {
        name = "Rumple";
        age = 30;
        gnomeBuddy = null;
        height = 2.1;
    }

    // method
    public static void makeKing(Gnome h) {
        h.name =  "King " + h.getRealName();
        h.magical = true; // only the Gnome class can reference this field
    }

    public void makeMeKing() {
        name = "King " + getRealName();
        magical = true;
    }

    public boolean isMagical() {
        return magical;
    }

    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public String getName() {
        return "I won't tell!";
    }

    public String getRealName() {
        return name;
    }

    public void renameGnome(String s) {
        name = s;
    }

}
