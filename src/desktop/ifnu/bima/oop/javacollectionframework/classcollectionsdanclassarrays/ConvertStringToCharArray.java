package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

// Java program to Reverse a String  by
// converting string to characters  one
// by one
public class ConvertStringToCharArray {

    public static void main(String[] args) {

        String input = "GeekForGeeks";

        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--) {
            System.out.print(try1[i]);
        }

    }

}
