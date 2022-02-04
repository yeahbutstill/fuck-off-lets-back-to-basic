package chapter3programcontrolstatements.ifs;

public class NestedIfs {

  public static void main(String[] args) {

    int i = 0;
    Object a;
    Object d = new Object();
    if (i == 10) {
      int j = 0;
      Object b = new Object();
      if (j < 20) a = b;
      int k = 0;
      Object c = new Object();
      if (k > 100) c = d;
      else a = c; // this else refers to if(k > 100)
    } else a = d; // this else refers to if(i == 10)
  }
}
