package com.zamannow.testsoaljava.junior.day3;

import java.io.*;

public class BJP3Exercise44daysInMonth {

    public static void main(String[] args) {
        // JEP 378: Text Blocks
        var html = """
                <html>
                    <body>
                        <p>Hello</p>
                    </body>
                </html>
                """;
        System.out.println(html);


        System.out.println(daysInMonthSwitchLambda(1));
        System.out.println(daysInMonthSwitchLambda(2));
        System.out.println(daysInMonthSwitchLambda(3));
        System.out.println(daysInMonthSwitchLambda(4));
        System.out.println(daysInMonthSwitchLambda(5));
        System.out.println(daysInMonthSwitchLambda(6));
        System.out.println(daysInMonth(7));
        System.out.println(daysInMonth(8));
        System.out.println(daysInMonth(9));
        System.out.println(daysInMonth(10));
        System.out.println(daysInMonth(11));
        System.out.println(daysInMonth(12));

        System.out.println(getRomanNumber(12));
        System.out.println("--------------------------------");
        System.out.println(getRomanNumberExp(1));
        System.out.println("--------------------------------");
        writeToFile();
        readFromFile();
    }

    private static int daysInMonth(int m) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            return 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            return 30;
        }
        return 28;
    }

    // JEP 400 UTF-8 by default
    // write this on linux
    private static void writeToFile() {
        try (FileWriter fileWriter = new FileWriter("Jep400-example.txt");
             BufferedWriter buffWriter = new BufferedWriter(fileWriter)) {
            buffWriter.write("こんにちは");
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    // this problem when you read it on windows os
    private static void readFromFile() {
        try (FileReader fileReader = new FileReader("Jep400-example.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    // JEP 362 new switch statement
    public static String getRomanNumber(int value) {
        String romanValue = "";
        switch (value) {
            case 0 -> romanValue = "nulla";
            case 1 -> romanValue = "I";
            case 2 -> romanValue = "II";
            case 3 -> romanValue = "III";
            case 4 -> romanValue = "IV";
            case 5 -> romanValue = "V";
            case 6 -> romanValue = "VI";
            case 7 -> romanValue = "VII";
            case 8 -> romanValue = "VIII";
            case 9 -> romanValue = "IX";
            case 10 -> romanValue = "X";
            case 11 -> romanValue = "XI";
            case 12 -> romanValue = "XII";
            default -> {
                System.out.println("Out of range value: %d %n" + value);
                romanValue = "N/A";
            }
        }
        return romanValue;
    }

    // The new way for multiple comma-separated labels in a single switch case
    public static String getOddOrEven(int value) throws Exception {
        var kind = switch (value) {
            case 0 -> "Zero";
            case 1, 3, 5, 7, 9 -> "Odd";
            case 2, 4, 6, 8, 19 -> "Even";
            default -> throw new Exception("Out of range: " + value);
        };
        return kind;
    }

    public static String getOddOrEvenYield(int value) throws Exception {
        var kind = switch (value) {
            case 0:
                yield "Zero";
            case 1, 3, 5, 7, 9:
                yield "Odd";
            case 2, 4, 6, 8, 19:
                yield "Even";
            default:
                throw new Exception("Out of range: " + value);
        };
        return kind;
    }

    // JEP 362 new switch expression
    public static String getRomanNumberExp(int value) {
        return switch (value) {
            case 0 -> "nulla";
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            case 10 -> "X";
            case 11 -> "XI";
            case 12 -> "XII";
            default -> throw new IllegalStateException("Out of range value: " + value);
        };
    }

    private static int daysInMonthSwitchLambda(int m) {
        int days = 0;
        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 2 -> days = 28;
            case 4, 6, 9, 11 -> days = 30;
            default -> {
                System.out.println("Out of range value: " + m);
            }
        }
        return days;
    }

}