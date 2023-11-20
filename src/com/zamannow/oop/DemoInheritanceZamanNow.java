package com.zamannow.oop;

public class DemoInheritanceZamanNow {
    public static void main(String[] args) {
        ManagerZamanNow managerZamanNow = new ManagerZamanNow("Eko");
        managerZamanNow.sayHello("Budi");

        VicePresidentZamanNow vicePresidentZamanNow = new VicePresidentZamanNow("Kurniawan");
        vicePresidentZamanNow.sayHello("Budi");
    }
}
