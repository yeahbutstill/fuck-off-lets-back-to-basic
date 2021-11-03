package chapter3programcontrolstatements.whiles;

import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("I'm thinking of a letter between A and Z");
            System.out.print("Can you guess it: ");

            // read character
            ch = (char) System.in.read();

            // discard any other character in the input buffer
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) System.out.println("** Right **");
            else {
                System.out.println("...Sorry, you're ");
                if (ch < answer) System.out.println("too low");
                else System.out.println("to high");
                System.out.println("Try again!\n");
            }
        }while (answer != ch);
    }
}
