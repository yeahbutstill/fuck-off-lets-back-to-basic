package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MethodMin {

    public static void main(String[] args) {

        try {

            // create link list object
            List<Integer> list = new ArrayList<>();

            // populate the list
            list.add(20);
            list.add(10);
            list.add(30);
            list.add(40);

            System.out.println("List: " + list);

            // getting minimum value
            // using min() method
            int min = Collections.min(list);

            System.out.println("Minimum value is: " + min);
        } catch (NoSuchElementException e) {
            System.out.println("Exception thrown : " + e);
        }

    }

}
