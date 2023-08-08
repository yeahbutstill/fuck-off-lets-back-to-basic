package com.tij.exercises.reusingclasses;

// reusing/Stem.java
// TIJ4 Chapter Reusing, Exercise 9, page 246
/* Create a class called Root that contains an instance of each of the classes
 * (that you also create) named Component1, Component2 and Component3. Derive a
 * class Stem from Root that also contains an instance of each "component." All
 * classes should have default constructors that print a message about that class.
 */

class Component1a {
    Component1a() {
        System.out.println("Component1()"); }
}

class Component2a {
    Component2a() {
        System.out.println("Component2()"); }
}

class Component3a {
    Component3a() {
        System.out.println("Component3()"); }
}

class Roota {
    Component1 c1root;
    Component2 c2root;
    Component3 c3root;
    Roota() {
        System.out.println("Root()"); }
}

class Stem extends Root {
    Component1 c1stem;
    Component2 c2stem;
    Component3 c3stem;
    Stem() {
        super(1f);
        System.out.println("Stem()"); }
    public static void main(String[] args) {
        Stem s = new Stem();
    }
}
