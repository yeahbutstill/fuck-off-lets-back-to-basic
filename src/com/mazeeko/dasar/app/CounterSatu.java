package com.mazeeko.dasar.app;

public class CounterSatu {
    protected int count; // a simple integer instance variable

    // the default constructor for a CounterSatu object
    CounterSatu() {
        count = 0;
    }

    // An accessor method to get the current count
    public int getCount() {
        return count;
    }

    // A modifier method for incrementing the count
    public void incrementCount() {
        count++;
    }

    // A modifier method for decrementing the count
    public void decrementCount() {
        count--;
    }

}
