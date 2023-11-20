package com.zamannow.oop;

class DemoInheritanceZamanNow {
    public static void main(String[] args) {
        ManagerZamanNow managerZamanNow = new ManagerZamanNow("Eko");
        managerZamanNow.sayHello("Budi");

        VicePresidentZamanNow vicePresidentZamanNow = new VicePresidentZamanNow("Kurniawan");
        vicePresidentZamanNow.sayHello("Budi");

        System.out.println(managerZamanNow);
        System.out.println(vicePresidentZamanNow);
        System.out.println();

        System.out.println("Kode Polymorphism");
        System.out.println("==================");
        EmployeeZamanNow employeeZamanNow = new EmployeeZamanNow("Naruto");
        employeeZamanNow.sayHello("Sakura");

        employeeZamanNow = new ManagerZamanNow("Sasuke");
        employeeZamanNow.sayHello("Naruto");

        employeeZamanNow = new VicePresidentZamanNow("Itachi");
        employeeZamanNow.sayHello("Gara");
    }
}
