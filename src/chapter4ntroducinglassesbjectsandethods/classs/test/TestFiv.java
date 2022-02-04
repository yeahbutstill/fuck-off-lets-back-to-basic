package chapter4ntroducinglassesbjectsandethods.classs.test;

import java.util.HashMap;

public class TestFiv {
  public static void main(String[] args) {
    HashMap<String, Integer> pantry = new HashMap<>();

    pantry.put("Ap", 3);
    pantry.put("Or", 2);

    int curAp = pantry.get("Ap");
    pantry.put("Ap", curAp + 4);

    System.out.println(pantry.get("Ap"));
  }
}
