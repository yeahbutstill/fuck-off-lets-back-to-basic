package chapter3programcontrolstatements.bab3tesdiri;

public class Given {
  public static void main(String[] args) {
    // the last else associates with if(y > 100).
    int x = 0;
    int y = 10;
    if (x < 10)
      if (y > 100) {
        boolean done = false;
        int z = 0;
        if (!done) x = z;
        else y = z;
      } else System.out.println("error");
  }
}
