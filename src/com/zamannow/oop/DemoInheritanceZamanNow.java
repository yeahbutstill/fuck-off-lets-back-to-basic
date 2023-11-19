package com.zamannow.oop;

public class DemoInheritanceZamanNow {
    public static void main(String[] args) {
        ManagerZamanNow managerZamanNow = new ManagerZamanNow();
        managerZamanNow.name = "Eko";
        managerZamanNow.sayHello("Budi");

        VicePresidentZamanNow vicePresidentZamanNow = new VicePresidentZamanNow();
        vicePresidentZamanNow.name = "Kurniawan";
        vicePresidentZamanNow.sayHello("Budi");
    }
}
