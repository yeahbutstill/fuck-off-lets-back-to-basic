package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class DemoNoSuchElementException {

    public static void main(String[] args) {

        try {

            // create link list object
            List<Integer> list = new ArrayList<>();
            System.out.println("List: " + list);

            // getting minimum value
            // using min() method
            System.out.println("Trying to get the minimum value with empty list");
            int min = Collections.min(list);
            System.out.println("Min value is: " + min);

        } catch (NoSuchElementException e) {
            System.out.println("Exception thrown : " + e);
        }

    }

}
