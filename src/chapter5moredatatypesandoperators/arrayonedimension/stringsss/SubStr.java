package chapter5moredatatypesandoperators.arrayonedimension.stringsss;

// Use substring().
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java makes the Web move.";

        // constructor a substring
        String substr = orgstr.substring(5, 18); // This creates a new string that contains the desired substring

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
