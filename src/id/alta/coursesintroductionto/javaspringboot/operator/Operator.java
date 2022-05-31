package id.alta.coursesintroductionto.javaspringboot.operator;

public class Operator {
    public static void main(String[] args) {
        int[] arrInt = new int[]{100, 2, 4, 10, 20};
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }

        boolean a = false;
        boolean b = false;

        if (a == false && b != true) {
            System.out.println("Right Condition");
        } else if (a != false && b == false) {
            System.out.println("Wrong");
        } else {
            System.out.println("Yuk bisa");
        }
    }
}
