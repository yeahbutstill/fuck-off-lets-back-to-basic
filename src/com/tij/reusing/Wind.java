package com.tij.reusing;

// inheritance & upcasting
// Wind objects are instruments
// because they have the same interface
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Upcasting
    }
}

class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        //..
        i.play();
    }
}