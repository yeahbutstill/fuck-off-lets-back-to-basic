package com.tij4awesome.chapter1.exercise.everythingisanobject.ch11;

/******************
 * Exercise 11 *****************
 * Turn the AllTheColorsOfTheRainbow example into
 * a program that compiles and runs.
 ************************************************/
public class E11AllTheColorsOfTheRainbow {
    int anIntegerRepresentingColors;

    public static void main(String[] args) {
        E11AllTheColorsOfTheRainbow all = new E11AllTheColorsOfTheRainbow();
        all.changeTheHueOfTheColor(27);
    }

    void changeTheHueOfTheColor(int newHue) {
        anIntegerRepresentingColors = newHue;
        System.out.println(anIntegerRepresentingColors);
    }
}
