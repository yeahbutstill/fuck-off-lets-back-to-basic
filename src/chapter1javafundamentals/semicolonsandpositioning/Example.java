package chapter1javafundamentals.semicolonsandpositioning;

public class Example {
    public static void main(String[] args) {
        int x;
        int y = 0;

        x = y;
        y = y + 1;
        System.out.println(x + " " + y);

        // is the same as the following, to java:
        x = y; y = y + 1; System.out.println(x + " " + y);

        int z = 3;
        System.out.println("This is a long line of output " + x + y + z + " more output");
    }
}
