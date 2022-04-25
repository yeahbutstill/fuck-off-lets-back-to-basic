package chapter3programcontrolstatements.bab3tesdiri;

public class BreakValid {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int i;
        for (i = 0; i < 10; i++) {
            boolean running = false;
            while (running) {
                if (x < y) break;
            }
            System.out.println("after while");
        }
        System.out.println("after for");
    }
}
