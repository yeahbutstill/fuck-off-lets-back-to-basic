package chapter3programcontrolstatements.selftest3;

import java.io.IOException;

// Count space.
public class Space {
    public static void main(String[] args) throws IOException {
        char ch;
        int spaces = 0;

        System.out.println("Enter a period to stop.");
        do {
            ch = (char) System.in.read();
            if (ch == ' ') spaces++;
        } while (ch != '.');

        System.out.println("Spaces: " + spaces);
    }
}