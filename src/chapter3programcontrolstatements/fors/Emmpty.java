package chapter3programcontrolstatements.fors;

// Parts of the for can be empty
public class Emmpty {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; ) { // the iteration expression is missing
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}
