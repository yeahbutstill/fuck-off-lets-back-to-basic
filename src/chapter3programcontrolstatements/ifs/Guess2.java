package chapter3programcontrolstatements.ifs;

import java.io.IOException;

public class Guess2 {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guees it: ");

        ch = (char) System.in.read(); // get a char

        if (ch == answer) {
            System.out.println("** RIGHT **");
        } else {
            System.out.println("...Sorry, you're wrong.");
        }
    }
}
