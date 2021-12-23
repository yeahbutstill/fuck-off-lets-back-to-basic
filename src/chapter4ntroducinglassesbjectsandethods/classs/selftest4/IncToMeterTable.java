package chapter4ntroducinglassesbjectsandethods.classs.selftest4;

/**
 * This program displays a conversion
 * table of inches to meters
 * <p>
 * Call this program InchToMeterTable.java
 */
public class IncToMeterTable {
    public static void main(String[] args) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; // convert to meters
            System.out.println(inches + " inches is " + meters + " meters.");

            counter++;
            // every 12th line, print a blank line
            if (counter == 12) {
                System.out.println();
                counter = 0; // reset the line counter
            }
        }
    }
}
