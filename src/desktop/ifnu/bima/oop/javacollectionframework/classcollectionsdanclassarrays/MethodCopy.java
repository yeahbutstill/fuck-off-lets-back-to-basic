package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodCopy {

    public static void main(String[] args) {

        try {

            // creating object of source list and destination List
            List<String> srclst = new ArrayList<>(4);
            List<String> destlst = new ArrayList<>(4);

            // Adding element to srclst
            srclst.add("Dani");
            srclst.add("Maya");
            srclst.add("Winda");
            srclst.add("Yasmin");

            // Adding element to deslst
            destlst.add("1");
            destlst.add("2");
            destlst.add("3");
            destlst.add("4");

            System.out.println("Value of source list: " + srclst);
            System.out.println("Value of destination list: " + destlst);
            System.out.println("\nAfter copying:\n");

            // copy element into dest
            Collections.copy(destlst, srclst);
            System.out.println("Value of source list: " + srclst);
            System.out.println("Value of destination list: " + destlst);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }

    }

}
