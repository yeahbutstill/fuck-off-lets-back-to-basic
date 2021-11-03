package chapter3programcontrolstatements.testjava;

public class NewTest {
  public static void main(String[] args) {
    NewTest obj = new NewTest();
    obj.tampilDenganGaya(1071, 1029);
    obj.tampilDenganGaya(5872, 120);
  }

  public void tampilDenganGaya(int a, int b) {
    int hasil = b - (a % b);
    if (hasil == 8) {
      System.out.println(hasil);
    } else if (hasil >= 8){
      System.out.println(hasil / 45);
    }
  }
}
