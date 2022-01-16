package assigment;

public class OperCampur {
    public static void main(String[] args) {
        int x = 0, y = 0;
        x = x + 100;
        x = x - 1;
        y = y * 3;
        y = y / 10;

        // AKA
        x += 100;
        x -= 1;
        y *= 3;
        y /= 10;

        System.out.println(x);
        System.out.println(y);
    }
}
