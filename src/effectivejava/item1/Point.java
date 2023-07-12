package effectivejava.item1;

/*
Consider static factory methods instead of constructors
Java allows constructor overloading based on the type of the parameters.
Limitation of constructor: you cannot overload based on the name of the parameters.
Static factory methods can help by providing purposeful naming
*/
public class Point {

  double x, y;

  // recommended in this case
  enum Angel {
    RAD,
    DEG
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  /**
   * not recommended in this case
   *
   * @param rho
   * @param phi
   * @param dummy not used
   */
  public Point(double rho, double phi, int dummy) {
    this.x = rho * Math.cos(phi);
    this.y = rho * Math.sin(phi);
  }

  /**
   * @param rho
   * @param phi
   * @param unit enum "RAD" or "DEG"
   */
  public Point(double rho, double phi, Angel unit) {
    switch (unit) {
      case RAD -> {
        this.x = rho * Math.cos(phi);
        this.y = rho * Math.sin(phi);
      }
      case DEG -> {
        double phi1 = phi * Math.PI / 180;
        this.x = rho * Math.cos(phi1);
        this.y = rho * Math.sin(phi1);
      }
    }
  }

  @Override
  public String toString() {
    return "Point{" + "x=" + x + ", y=" + y + '}';
  }

  public static void main(String[] args) {
    var p1 = new Point(3.0, 4.0);
    System.out.println(p1);

    var p2 = new Point(5.0, Math.atan2(4.0, 3.0), -1);
    System.out.println(p2);

    var p3 = new Point(5.0, Math.atan2(4.0, 3.0), Angel.RAD);
    System.out.println(p3);

    var p4 = new Point(3.0, 4.0, Angel.DEG);
    System.out.println(p4);
  }
}
