package id.alta.coursesintroductionto.javaspringboot.latihan.day3.basicjava;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input: ");
        String kataKata = input.nextLine();
        System.out.println("output: " + xDanO(kataKata));
        input.close();
    }

    private static boolean xDanO(String kataKata) {

        return kataKata.equals("xoxoxo");
    }
}
