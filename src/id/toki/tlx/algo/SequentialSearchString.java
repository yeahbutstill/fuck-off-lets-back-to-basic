package id.toki.tlx.algo;

public class SequentialSearchString {
    public static void main(String[] args) {
        String[][] data = {
                {"budi", "LULUS"},
                {"andi", "TIDAK LULUS"},
                {"tini", "LULUS"},
                {"tono", "TIDAK LULUS"},
                {"joko", "LULUS"},
                {"cindi", "LULUS"}
        };
        String studentNameToFind = "joko"; // The student name you want to search for
        String status = sequentialSearch(data, studentNameToFind);

        if (status != null) {
            System.out.println("Student '" + studentNameToFind + "' has status: " + status);
        } else {
            System.out.println("Student '" + studentNameToFind + "' not found in the array.");
        }
    }

    // Sequential search method
    public static String sequentialSearch(String[][] data, String studentName) {
        for (String[] datum : data) {
            if (datum[0].equals(studentName)) {
                return datum[1]; // Found the student, return their status
            }
        }
        return null; // Student not found in the array
    }
}
