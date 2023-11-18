package id.toki.tlx.algo;

public class PerulanganDoWhileDua {
    public static void main(String[] args) {
        int i = 9;
        int j;

        do {
            j = i;
            do {
                System.out.print("*" + " ");
                --j;
            } while (j >= 1);
            --i;
            System.out.println();
        } while (i >= 1);
    }
}
