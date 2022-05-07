package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Method asList digunakan untuk mengubah array menjadi List dengan cepat
 * Tanpa menggunakan method asList mengcopy array ke dalam List kodenya seperti di bawah ini :
 */

public class CopyArrayManualTest {

    public static void main(String[] args) {

        String[] names = {"me", "and", "you", "hardcore", "forever"};
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            nameList.add(names[i]);
            System.out.println("name: " + names[i]);
        }

    }

}
