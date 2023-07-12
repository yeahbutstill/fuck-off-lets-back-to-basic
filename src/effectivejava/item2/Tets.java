package effectivejava.item2;

public class Tets {
  public static void main(String[] args) {
//    var p1 = new PointBuilder().x(2.1).y(3.5).build(); // very expensive
//    System.out.println(p1);

    var p2 = new PointBuilder.Cartesian().x(2.1).y(3.5).build();
    System.out.println(p2);

    var p3 = new PointBuilder.Polar().rho(2.1).phiRad(3.5).build();
    System.out.println(p3);

    var p4 = new Point.Builder.Cartesian().x(2.3).y(3.5).build();
    System.out.println(p4);
  }
}
