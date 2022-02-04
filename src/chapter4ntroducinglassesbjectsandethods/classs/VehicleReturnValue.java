package chapter4ntroducinglassesbjectsandethods.classs;

public class VehicleReturnValue {

  int passengers; // number of passengers
  int fuelcap; // fuel capacity in gallons
  int mpg; // fuel consumption in miles per gallon

  // Return the range.
  int range() {
    return mpg * fuelcap; // return the range for a given vehicle.
  }
}

class RetMeth {
  public static void main(String[] args) {
    VehicleReturnValue minivan = new VehicleReturnValue();
    VehicleReturnValue sportscar = new VehicleReturnValue();

    // assign values to fields in minivan
    minivan.passengers = 7;
    minivan.fuelcap = 16;
    minivan.mpg = 21;

    // assign values to fields in sportscar
    sportscar.passengers = 2;
    sportscar.fuelcap = 14;
    sportscar.mpg = 12;

    // get the ranges
    int range1 = minivan.range(); // assign the value returned to a variable
    int range2 = sportscar.range();

    System.out.println(
        "Minivan can carry " + minivan.passengers + " with range of " + range1 + " Miles");
    System.out.println(
        "Sportscar can carry " + minivan.passengers + " with range of " + range2 + " Miles");
  }
}
