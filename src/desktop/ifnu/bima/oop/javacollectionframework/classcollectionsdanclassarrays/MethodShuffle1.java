package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Mengacak daftar yang diberikan menggunakan sumber keacakan yang disediakan pengguna.
 * <p>
 * Di sini parameter tambahan yang disediakan yang di atas ditentukan "rndm" adalah sumber keacakan untuk mengacak daftar.
 */

public class MethodShuffle1 {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("code");
        myList.add("quiz");
        myList.add("geeksforgeeks");
        myList.add("quiz");
        myList.add("practice");
        myList.add("qa");

        System.out.println("Original List : \n" + myList);

        // Shuffling the given list
        // using Random() method
        Collections.shuffle(myList, new Random());

        System.out.println("\nShuffled List with Random() : \n" + myList);

        // Shuffling list by using Random(3)
        Collections.shuffle(myList, new Random(3));

        System.out.println("\nShuffled List with Random(3) : \n" + myList);

        // Again shuffling list by using Random(3)
        Collections.shuffle(myList, new Random(5));

        System.out.println("\nShuffled List with Random(5) : \n" + myList);

    }

}
