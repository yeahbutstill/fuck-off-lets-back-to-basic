package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillMethodForStringValue {

    public static void main(String[] args) {

        // creating object of List<Integer>
        List<String> arrList = new ArrayList<>();

        // Adding element to srclst
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");

        System.out.println("List elements before fill: " + arrList);

        // fill the list
        Collections.fill(arrList, "TAJMAHAL");

        System.out.println("\nList elements after fill: " + arrList);

    }

}
