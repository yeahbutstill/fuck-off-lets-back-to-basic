package com.zamannow.oop;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "dnl";
        employee.sayHello("myt");

    /*
    problem ketika menggunakan polymorphism adalah kita tidak bisa langsung mengakses method
    atau properties yang ada di class childnya.
     */
        employee = new Manager();
        employee.name = "myt";
        employee.sayHello("dnl");

        employee = new VicePresident();
        employee.name = "wdn";
        employee.sayHello("myt");

        System.out.println();
        System.out.println();

        sayHello(new Employee("hahaha"));
        sayHello(new Manager("lllllllll"));
        sayHello(new VicePresident("Dan"));
    }

    // method polymorphism
    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident vp) { // Type Check before we casts
            // lego we cast them
            System.out.println("Hello VP " + vp.name);
        } else if (employee instanceof Manager mn) {
            System.out.println("Hello Manager " + mn.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
