package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForIndexOutOfBoundsException {

    public static void main(String[] args) {

        try {

            // creating object of Source list and distination List
            List<String> srclst = new ArrayList<>(3);
            List<String> destlst = new ArrayList<>(2);

            // Adding element to srclst
            srclst.add("Maya");
            srclst.add("Dani");
            srclst.add("Anak pertama");

            // Adding element to destlst
            destlst.add("1");
            destlst.add("2");

            System.out.println("Value of source list: " + srclst);
            System.out.println("Value of destination list: " + destlst);

            System.out.println("\nAfter copying:\n");

            // copy element into destlst
            Collections.copy(destlst, srclst);

            System.out.println("Value of source list: " + srclst);
            System.out.println("Value of destination list: " + destlst);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown : " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown : " + e);
        }

    }

}
