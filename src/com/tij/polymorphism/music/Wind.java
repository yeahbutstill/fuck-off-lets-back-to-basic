package com.tij.polymorphism.music;

// Wind onjects are instruments
// because they have the same interface
public class Wind extends Instrument {
    // Redefine interface method:
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
