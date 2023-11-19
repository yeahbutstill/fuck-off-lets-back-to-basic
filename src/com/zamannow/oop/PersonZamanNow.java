package com.zamannow.oop;

class PersonZamanNow {
    final String country = "Indonesia";
    String name;
    String address;

    // Constructor overloading AKA AllArgumnet
    PersonZamanNow(String name, String paramAddress) {
        // jika nama parameter dan nama fieldnya sama, gunakan this, untuk mengakses object saat ini, agar menghindari variable shadowing
        this.name = name;
        address = paramAddress;
    }

    // Constructor overloading AKA ReqArgument
    PersonZamanNow(String paramName) {
        // memanggil constructor lain
        this(paramName, null);
    }

    // defualt constructor AKA NoArgument
    PersonZamanNow() {
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My name is " + name);
    }
}
