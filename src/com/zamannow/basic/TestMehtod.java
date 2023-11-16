package com.zamannow.basic;

public class TestMehtod {
    public static void main(String[] args) {
        TestMehtod testMehtod = new TestMehtod();
        testMehtod.sayHello();
        testMehtod.sayHello("dnl", "rahasia");

        int a = 10;
        int b = 20;
        int c = testMehtod.sum(a, b);
        System.out.println(c);

        System.out.println("------------------------");
        System.out.println(testMehtod.sum(10, 30));
        System.out.println(testMehtod.ucapan("my"));
        System.out.println("===========================");

        // karena method static dia milik class tidak perlu membuat object terlebih dahulu
        sayHelloStatic();

        System.out.println(testMehtod.hitung(100, "/", 100));
        System.out.println(testMehtod.hitung(100, "+", 100));
        System.out.println(testMehtod.hitung(100, "-", 100));
        System.out.println(testMehtod.hitung(100, "%", 100));

//        System.out.println(testMehtod.hitung(100, "salah", 100));
        System.out.println("-----------------------------");

        testMehtod.sayCongrats("DNL", new int[]{80, 80, 80, 80, 80, 80});
        testMehtod.sayCongratsVarArgs("MYT", 80, 90, 90, 100, 90, 100);
    }

    // static method
    public static void sayHelloStatic() {
        System.out.println("Hello Method");
    }

    // method yang tidak mengebalikan return value
    public void sayHello() {
        System.out.println("Hello Method");
    }

    // method dengan parameter
    public void sayHello(String username, String password) {
        System.out.println(username + " : " + password);
    }

    // method return value
    public int sum(int value1, int value2) {
        int total = value1 + value2;
        return total;
    }

    public String ucapan(String username) {
        return username;
    }

    public int hitung(int value1, String operasi, int value2) {
        switch (operasi) {
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            case "/":
                return value1 / value2;
            case "%":
                return value1 % value2;
            default:
                throw new IllegalStateException("Unexpected value: " + operasi);
        }
    }

    // tanpa variable argument
    public void sayCongrats(String name, int[] values) {
        // simpan rata-rata nilai
        int total = 0;
        for (int value : values) {
            total += value;
        }

        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Silakan coba lagi tahun depan");
        }
    }

    // method variable argument
    public void sayCongratsVarArgs(String name, int... values) {
        // simpan rata-rata nilai
        int total = 0;
        for (int value : values) {
            total += value;
        }

        int finalValue = total / values.length;
        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Silakan coba lagi tahun depan");
        }
    }
}
