package chapter4ntroducinglassesbjectsandethods.classs;

public class Vehicle {
    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel cnsumption in miles per gallon

    // Return the range.
    int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance.
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

class CompFuel {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle(); // Remember, minivan and sportcar refer to sparate objects.
        double gallons;
        int dist = 252;

        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16; // notice the use of the dot aperator to access a member.
        minivan.mpg = 21;

        // assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14; // notice the use of the dot aperator to access a member.
        sportscar.mpg = 12;

        gallons = minivan.fuelneeded(dist);
        System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel");

        gallons = sportscar.fuelneeded(dist);
        System.out.println("To go " + dist + " miles sportscar needs " + gallons + " gallons of fuel");
    }
}
