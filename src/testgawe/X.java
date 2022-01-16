package testgawe;

public class X {
    public static void main(String[] args) {
        String names[] = new String[5];
        for (int a = 0; a < args.length; a++) {
            names[a] = args[a];
            System.out.println(names[2]);
        }
    }
}
