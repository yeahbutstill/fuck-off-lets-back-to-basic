package com.zamannow.generic.boundedtypeparameter.constraint.inheritance;

/**
 * kita ingin VP ini bisa sayHello
 */
public class VicePresident extends Employee implements CanSayHello {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
