package effectivejava.item1;

/*
Consider static factory methods instead of constructors
Java allows constructor overloading based on the type of the parameters.
Limitation of constructor: you cannot overload based on the name of the parameters.
Static factory methods can help by providing purposeful naming
*/
public class Point { // cannot be inherited

  double x, y;

  // recommended in this case
  enum Angel {
    RAD,
    DEG
  }

  private Point(double x, double y) {
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
  private Point(double rho, double phi, int dummy) {
    this.x = rho * Math.cos(phi);
    this.y = rho * Math.sin(phi);
  }

  /**
   * @param rho
   * @param phi
   * @param unit enum "RAD" or "DEG"
   */
  private Point(double rho, double phi, Angel unit) {
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

  // static factory method
  public static Point fromCartesian(double x, double y) {
    return new Point(x, y);
  }

  // this is the best practice in java
  public static Point fromPolar(double rho, double phi, Angel unit) {
    return new Point(rho, phi, unit);
  }

  public static Point fromPolarRadian(double rho, double phi) {
    return new Point(rho, phi, Angel.RAD);
  }

  public static Point fromPolarDegree(double rho, double phi) {
    return new Point(rho, phi, Angel.DEG);
  }

  @Override
  public String toString() {
    return "Point{" + "x=" + x + ", y=" + y + '}';
  }
}
