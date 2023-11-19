package com.zamannow.oop;

class VicePresidentZamanNow extends ManagerZamanNow {
    // method overriding
    void sayHello(String name) {
        // method invocation ini menuju ke method yang ada di parent class
//        super.sayHello(name);

        System.out.println("Hello " + name + ", My name is VP " + this.name);
    }
}
