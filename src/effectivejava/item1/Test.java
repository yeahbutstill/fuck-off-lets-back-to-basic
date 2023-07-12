package effectivejava.item1;

public class Test {
  public static void main(String[] args) {
    var p1 = Point.fromCartesian(3.0, 4.0); // true meaning of Item 1
    System.out.println(p1);

    //    var p2 = new Point(5.0, Math.atan2(4.0, 3.0), -1);
    //    System.out.println(p2);

    //    var p3 = new Point(5.0, Math.atan2(4.0, 3.0), Point.Angel.RAD);
    //    System.out.println(p3);
    var p3 = Point.fromPolar(5.0, Math.atan2(4.0, 3.0), Point.Angel.RAD);
    System.out.println(p3);

    System.out.println(Math.atan2(4.0, 3.0)*180/Math.PI);
  }
}
