package id.toki.tlx.perkenalan.pemrograman.kompetitif.A;

import java.util.Scanner;

public class SeleksiOlimpiade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        for (int h = 0; h < i; h++) {
            int n = input.nextInt();
            int m = input.nextInt();
            input.nextLine();
            String  nama = input.nextLine();
            int[] n1 = new int[100];
            int[] n2 = new int[100];
            int[] n3 = new int[100];
            int id = -1;

            for (int j = 0; j < n; j++) {
                String temp = input.next();
                n1[j] = input.nextInt();
                n2[j] = input.nextInt();
                n3[j] = input.nextInt();

                if (temp.equals(nama)) id = j;
            }

            int nilai1 = n1[id];
            int nilai2 = n2[id];
            int nilai3 = n3[id];

            for (int k = 0; k < n; k++) {
                if (k == id) continue;
                if (nilai3 < n3[k]) {
                    m--;
                } else if (nilai3 == n3[k]) {
                    if (nilai2 < n2[k]) {
                        m--;
                    } else if (nilai2 == n2[k]) {
                        if (nilai1 < n1[k]) {
                            m--;
                        }
                    }
                }
            }

            if (m > 0) System.out.println("YA");
            else System.out.println("TIDAK");
        }
    }
}
