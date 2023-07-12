package effectivejava.item2;

public class PointBuilder {
  public PointBuilder() {}

  // static inner classes
  // can be directly accessed new PointBuilder().CertainMethod();
  public static class Cartesian {
    // 1st quadrant: x > 0 and y > 0
    // 2nd quadrant: x > 0 and y < 0
    private double x;
    private double y;

    public Cartesian() {}

    // fluent interface
    public Cartesian x(double x) {
//      this.x = x;
      this.x = x > 0 ? x : -x;
      return this; // return a reference to current builder object
    }

    public Cartesian y(double y) {
      this.y = y;
      return this;
    }

    // build method (follow this convention)
    public Point build() {
      return new Point(x, y);
    }
  }

  public static class Polar {
    private double rho;
    private double phiRad;

    public Polar() {}

    // fluent interface
    public Polar rho(double rho) {
      this.rho = rho;
      return this; // return a reference to current builder object
    }

    public Polar phiRad(double phiRad) {
      this.phiRad = phiRad;
      return this;
    }

    public Polar phiDegree(double phiDegree) {
      this.phiRad = phiDegree * Math.PI / 180;
      return this;
    }

    // build method (follow this convention)
    public Point build() {
      return new Point(rho, phiRad, "rad");
    }
  }
}
