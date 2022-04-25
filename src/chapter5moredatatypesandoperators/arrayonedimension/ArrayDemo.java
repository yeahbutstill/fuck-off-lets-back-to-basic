package chapter5moredatatypesandoperators.arrayonedimension;

// Demonstrate a one-dimesional array.
public class ArrayDemo {
    public static void main(String[] args) {
        int[] sample = new int[10];
        int i;

        for (i = 0; i < 10; i++) // Arrays are index from zero.
            sample[i] = i;

        for (i = 0; i < 10; i = i + 1) // Arrays are index from zero.
            System.out.println("This is sample [" + i + "] : " + sample[i]);
    }
}
