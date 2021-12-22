package chapter5moredatatypesandoperators.arrayonedimension.foreach;

public class foreachs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        // Use for-each style for to display and sum the values.
        for (int x : nums) { // A for-each style for loop
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);

        System.out.println("=================");

        // Sum only the first 5 elements.
        for (int x : nums) {
            System.out.println("Value is: " + x);
            sum += x;
            if (x == 5) {
                break; // stop the loop when is obtained
            }
        }
    }
}
