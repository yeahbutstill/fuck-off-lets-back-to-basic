package id.alta.coursesintroductionto.javaspringboot.method;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        methodDenganVoid();
        methodDenganParameter(3, 3);
        System.out.println(methodDenganReturn(1, 2));
        System.out.println(methodDenganArgumentParameterTidakTerbatas(1, 2));
        tambah();
        System.out.println("======================");
        System.out.println(tambah(1, 2));
    }

    // method overloading
    private static int tambah(int... values) {
        int sum = 0;
        for (var v : values) {
            sum = +v;
        }
        return sum;
    }

    private static void tambah() {
        System.out.println(1 + 2);
    }

    private static int methodDenganArgumentParameterTidakTerbatas(int... values) {
        int sum = 1;
        for (var v : values) {
            sum += v;
        }

        return sum;
    }

    private static int methodDenganReturn(int a, int b) {
        return a + b;
    }

    private static void methodDenganParameter(int a, int b) {
        System.out.println(a + b);
    }

    private static void methodDenganVoid() {
        System.out.println(1 + 2);
    }
}
