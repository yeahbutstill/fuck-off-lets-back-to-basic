package chapter5moredatatypesandoperators.arrayonedimension.typeinference;

// A simple demonstrate of local variable type inference
public class VarDemo {
    public static void main(String[] args) {
        // use type inference to determine the type of the variable named avg.
        // in this case, double is inferred.
        var avg = 10.0; // use var to infer type of avg
        System.out.println("Value of avg: " + avg);

        // in the following context, var is not a predefined identifier.
        // it is simply a user-defined variable name.
        int var = 1;
        System.out.println("Value of var: " + var);

        // Interestingly, in the following sequence, var is used
        // as both the type of the declaration and as a variable name
        // in the initializer.
        var k = -var;
        System.out.println("Value of k: " + k);

    }
}
