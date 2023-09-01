package id.toki.tlx.algo;

public class PerulanganWhileDua {
    public static void main(String[] args) {
        int i = 1;
        int j;
        int k;
        int l;
        while (i <= 9) {
            j = 9-1;
            while (j >= i) {
                System.out.print("  ");
                j--;
            }

            k = 1;
            while (k <= i) {
                System.out.print("* ");
                k++;
            }

            l = 1;
            while (l <= i-1) {
                System.out.print("* ");
                l++;
            }

            i++;
            System.out.println();
        }
        System.out.print("");
    }
}
