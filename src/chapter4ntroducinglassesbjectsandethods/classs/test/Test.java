package chapter4ntroducinglassesbjectsandethods.classs.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));
    for (String val : list) {
      if (val.equals("a")) {
        list.remove(val);
      }
      System.out.println(list);
    }
  }
}
