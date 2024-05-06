package ptakhdanirekasolusi;

import java.util.Random;

public class RandomNuberBesarKecil {
    public static void main(String[] args) {
        Random rn = new Random();
        for (int i = 1; i <= 20; i++) {
            int answer = rn.nextInt(20) + 1;
            if (i == 1) System.out.println("PERTAMA " + i);
            if (i == answer) System.out.println("SAMA " + i + " = " + answer);
            if (i > answer) System.out.println("BESAR " + i + " > " + answer);
            if (i < answer) System.out.println("KECIL " + i + " < " + answer);
        }
    }
}
