package id.alta.coursesintroductionto.javaspringboot.looping;

public class Perulangan {
    public static void main(String[] args) {
        // for
        String nohp = "087832081093";
        int nilai;
        for (nilai = 1; nilai <= 10; nilai++) {
            System.out.println(nohp + nilai);
        }

        System.out.println("======================");

        // while
        String nohp1 = "087832081093";
        int nilai1 = 1;
        while (nilai1 < 10) {
            System.out.println(nohp1 + nilai1);
            nilai1++;
        }

        System.out.println("=========================");

        // do while
        String nohp2 = "087832081093";
        int nilai2 = 1;
        do {
            System.out.println(nohp2 + nilai2);
            nilai2++;
        } while (nilai2 < 10);

        System.out.println("=========================");

        // foreach
        int[] dataAngka = {1, 2, 3, 4, 5};
        for (var value : dataAngka) {
            System.out.println(value);
        }

        System.out.println("===================================");

        // break dan continue
        String nohp3 = "08111111000";
        int nilai3;
        for (nilai3 = 1; nilai3 <= 10; nilai3++) {
            if (nilai3 == 3) {
                continue;
            }
            if (nilai3 == 5) {
                break;
            }
            System.out.println(nohp + nilai3);
        }

    }
}
