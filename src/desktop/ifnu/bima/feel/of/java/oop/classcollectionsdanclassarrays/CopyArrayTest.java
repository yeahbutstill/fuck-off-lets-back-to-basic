package desktop.ifnu.bima.feel.of.java.oop.classcollectionsdanclassarrays;

import java.util.Arrays;
import java.util.List;

public class CopyArrayTest {
  public static void main(String[] args) {
    String[] namaBuah1 = {"Semangkan", "jeruk", "Appel", "Melon"};
    String[] namaBuah2 = {"Semangkan", "jeruk", "Appel", "Melon"};
    List<String> namaBuahList1 = Arrays.asList(namaBuah1);
    List<String> namaBuahList2 = Arrays.asList(namaBuah2);

    String[] namaBuah3 = {"Semangkan", "jeruk", "Appel", "Melon"};
    System.out.println(namaBuah3.equals(namaBuah1));

    // this false because this array compare list, beware don't forget always overide equal and hashcode
    System.out.println(namaBuahList1.equals(namaBuahList2));

    for (int i = 0; i < namaBuahList1.size(); i++) {
      System.out.println("nama buah: " + namaBuahList1.get(i));
    }
  }
}
