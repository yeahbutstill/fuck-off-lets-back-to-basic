package chapter4ntroducinglassesbjectsandethods.classs.test;

public class TestTre {
    public static void main(String[] args) {
        int[][] array = new int[3][];
        array[0] = new int[]{1, 2, 3};
        array[1] = new int[]{4, 5, 6};
        array[2] = new int[]{7, 8, 9};
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i][1]);
        }
    }
}
