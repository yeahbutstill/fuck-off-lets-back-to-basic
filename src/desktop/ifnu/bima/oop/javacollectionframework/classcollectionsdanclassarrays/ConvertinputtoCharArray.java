package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;


// Java program to Reverse a String using swapping
// of variables
public class ConvertinputtoCharArray {

    public static void main(String[] args) {

        String input = "Geeks For Geeks";
        char[] tempArray = input.toCharArray();
        int left, right = 0;
        right = tempArray.length - 1;

        for (left = 0; left < right; left++, right--) {
            // Swap values of left and right
            char temp = tempArray[left];
            tempArray[left] = tempArray[right];
            tempArray[right] = temp;
        }

        for (char c : tempArray) {
            System.out.print(c);
        }
        System.out.println();

    }

}
