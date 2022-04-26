package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Mengacak daftar yang diberikan menggunakan sumber keacakan yang telah ditentukan sebelumnya.
 */

public class MethodShuffle {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        myList.add("code");
        myList.add("quiz");
        myList.add("geeksforgeeks");
        myList.add("quiz");
        myList.add("practice");
        myList.add("qa");

        System.out.println("Original List : \n" + myList);

        Collections.shuffle(myList);

        System.out.println("\nShuffled List : \n" + myList);

    }

}
