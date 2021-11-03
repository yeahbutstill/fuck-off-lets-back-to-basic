package chapter3programcontrolstatements.switchs;

import java.io.IOException;

public class Help {
    public static void main(String[] args) throws IOException {

        System.out.println("Help on: ");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Choose one: ");

        char choice = (char) System.in.read();
        System.out.println("");

        switch (choice) {
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression) {");
                System.out.println(" case constant:");
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("    // ...");
                System.out.println("}");
                break;
            default:
                System.out.print("Selection not found.");
        }
    }
}
