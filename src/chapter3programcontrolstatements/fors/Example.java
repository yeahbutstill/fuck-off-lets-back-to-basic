package chapter3programcontrolstatements.fors;

public class Example {
    public static void main(String[] args) {
        int count;
        for (count = 10; count < 5; count++) {
            int x = count; // this statement will not execute
        }
    }
}
