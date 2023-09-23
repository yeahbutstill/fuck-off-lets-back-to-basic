package desktop.ifnu.bima.feel.of.java.oop.classcollectionsdanclassarrays;

import java.util.Arrays;
import java.util.List;

public class CopyArrayTest {
  public static void main(String[] args) {
    String[] namaBuah = {"Semangkan", "jeruk", "Appel", "Melon"};
    List<String> namaBuahList = Arrays.asList(namaBuah);
    System.out.println(namaBuahList);
    for (int i = 0; i < namaBuahList.size(); i++) {
      System.out.println("nama buah: " + namaBuahList.get(i));
    }
  }
}
