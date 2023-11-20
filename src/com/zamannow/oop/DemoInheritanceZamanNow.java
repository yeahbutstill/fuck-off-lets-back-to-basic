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
        sayHello(new EmployeeZamanNow("Naruto"));

        employeeZamanNow = new ManagerZamanNow("Sasuke");
        employeeZamanNow.sayHello("Naruto");
        sayHello(new ManagerZamanNow("Sasuke"));

        employeeZamanNow = new VicePresidentZamanNow("Itachi");
        employeeZamanNow.sayHello("Gara");
        sayHello(new VicePresidentZamanNow("Itachi"));
    }

    // method polymorphism
    static void sayHello(EmployeeZamanNow employeeZamanNow) {
        if (employeeZamanNow instanceof VicePresidentZamanNow) {
            VicePresidentZamanNow vp = (VicePresidentZamanNow) employeeZamanNow;
            System.out.println("Hello VP " + vp.name);
        } else if (employeeZamanNow instanceof ManagerZamanNow) {
            ManagerZamanNow mg = (ManagerZamanNow) employeeZamanNow;
            System.out.println("Hello Manager " + mg.name);
        } else {
            System.out.println("Hello Employee " + employeeZamanNow.name);
        }
    }
}
