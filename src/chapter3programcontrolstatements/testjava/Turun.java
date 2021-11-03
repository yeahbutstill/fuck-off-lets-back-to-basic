package chapter3programcontrolstatements.testjava;

public class Turun {
    public static void main(String[] args) {
        algo(10);
        algo(9);
    }

    public static void algo(int param) {

        int i;
        int count = 0;
        for (i = param; i >= 5; i--) {
            System.out.print(count + "+" + i + " ");
            count++;
        }
        System.out.println();
    }
}
