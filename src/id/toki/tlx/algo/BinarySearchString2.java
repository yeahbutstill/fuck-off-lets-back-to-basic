package id.toki.tlx.algo;

public class BinarySearchString2 {
  public static void main(String[] args) {
    String[][] data = {
      {"andi", "TIDAK LULUS"},
      {"budi", "LULUS"},
      {"cindi", "LULUS"},
      {"joko", "LULUS"},
      {"tini", "LULUS"},
      {"tono", "TIDAK LULUS"}
    };

    String studentNameToFind = "tini"; // The student name you want to search for

    int index = binarySearch(data, studentNameToFind);

    if (index != -1) {
      System.out.println("Student '" + studentNameToFind + "' has status: " + data[index][1]);
    } else {
      System.out.println("Student '" + studentNameToFind + "' not found in the array.");
    }
  }

  // Binary search method
  public static int binarySearch(String[][] data, String studentName) {
    int left = 0;
    int right = data.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      int compareResult = studentName.compareTo(data[mid][0]);

      if (compareResult == 0) {
        return mid; // Found the student, return their index
      } else if (compareResult < 0) {
        right = mid - 1; // Student name is in the left half
      } else {
        left = mid + 1; // Student name is in the right half
      }
    }

    return -1; // Student not found in the array
  }
}
