package effectivejava.item2;

public class Point {
  double x;
  double y;

  // Cartesian cordinates
  Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  // Polar cordinates
  // String unit = "degree" or "rad";
  Point(double rho, double phi, String unit) {
    double phiRad;
    if (unit.equals("rad")) {
      phiRad = phi * Math.PI / 180;
    } else {
      phiRad = phi;
    }
    this.x = rho * Math.cos(phiRad);
    this.y = rho * Math.sin(phiRad);
  }

  public static class Builder {
    // static inner classes
    // can be directly accessed new PointBuilder().CertainMethod();
    public static class Cartesian {
      private double x;
      private double y;

      public Cartesian() {}

      // fluent interface
      public Cartesian x(double x) {
        this.x = x;
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

  @Override
  public String toString() {
    return "Point{" + "x=" + x + ", y=" + y + '}';
  }
}
