package com.mazeeko.dasar;
public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHelloMyName("Dani", "Setiawan");

        Integer a = 100;
        Integer b = 10;
        Integer c = sum(a, b);
        
        System.out.println(c);
        System.out.println(hitung(a, "-", b));
        System.out.println("==============================");

        // memanggil method dengan tanpa variable argumen47
        Integer[] values = {80, 80, 80, 80, 80};
        sayCongratulation("Dani", values);

        // memanggil method dengan variable argumen
        sayCongratulations("Maya", 75, 80, 90, 60);

    }

    private static Integer sum(Integer value1, Integer value2) {
        Integer hasil = value1 + value2;
        return hasil;
    }

    private static Integer hitung(Integer value1, String operasi, Integer value2) {
        if (operasi.equals("+")) {
            return value1 + value2;
        } else if (operasi.equals("-")) {
            return value1 - value2;
        } else if (operasi.equals("*")) {
            return value1 * value2;
        } else if (operasi.equals("/")) {
            return value1 / value2;
        } else if (operasi.equals("%")) {
            return value1 % value2;
        }
        return 0;
    }

    // dengan variable argumen
    private static void sayCongratulations(String name, Integer... values) {
        Integer total = 0;
        for (Integer value : values) {
            total += value;
        }

        Integer hasil = total / values.length;
        if (hasil >= 75) {
            System.out.println("Selamat " + name + " anda lulus");
        } else {
            System.out.println("Maaf " + name + " anda tidak lulus");
        }
    }

    // tanpa variable argumen
    private static void sayCongratulation(String name, Integer[] values) {
        Integer total = 0;
        for (Integer value : values) {
            total += value;
        }

        Integer hasil = total / values.length;
        if (hasil >= 75) {
            System.out.println("Selamat " + name + " anda lulus");
        } else {
            System.out.println("Maaf " + name + " anda tidak lulus");
        }
    }

    private static void sayHelloMyName(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);

    }

    private static void sayHelloWorld() {
        System.out.println("Hello World");
    }
}
