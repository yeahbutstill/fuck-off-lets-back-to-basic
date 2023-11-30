package com.zamannow.basic;

public class AwesomeVariableArguments {
    public static void main(String[] args) {
        AwesomeVariableArguments awesomeVariableArguments = new AwesomeVariableArguments();
        int[] rata = {75, 75, 75, 75, 75, 75, 75, 80, 80, 10};
        System.out.println(awesomeVariableArguments.sayCongratulation("Ucup", rata));
        // panjangnya tidak terbatas, tida perlu deklarasi array terlebih dahulu, langsung saja masukan nilai rata-ratanya
        System.out.println(awesomeVariableArguments.sayCongratulationValArgs("Ucup", 80, 80, 80, 80));
    }

    // tanpa variable arguments
    public String sayCongratulation(String name, int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }

        int finalValue = total / values.length;
        if (finalValue >= 75) {
            return "Selamat " + name + ", anda lulus";
        } else {
            return "Maaf " + name + ", anda masih bodoh";
        }
    }

    // Dengan variable arguments, tapi harus ditoro dipaling akhir
    public String sayCongratulationValArgs(String name, int... values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }

        int finalValue = total / values.length;
        if (finalValue >= 75) {
            return "Selamat " + name + ", anda lulus";
        } else {
            return "Maaf " + name + ", anda masih bodoh";
        }
    }
}
