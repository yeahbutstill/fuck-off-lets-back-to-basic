package id.toki.tlx.problem;

import java.util.*;

public class Coba01ASO {
    public static void main(String[] args) {
        // input jumlah sesi
        Scanner scanner = new Scanner(System.in);
        int jumlahSesi = scanner.nextInt();
        scanner.nextLine();

        // array result
        List<String> result = new ArrayList<>();

        // loop jumlah sesi
        for (int sesi = 0; sesi < jumlahSesi; sesi++) {
            // handle data peserta pada 1 sesi
            int totalSeluruhPeserta = scanner.nextInt();
            int totalPesertaLulus = scanner.nextInt();
            scanner.nextLine();
            String pesertaToCheck = scanner.nextLine();
            Peserta scorePesertaToCheck = new Peserta();
            scorePesertaToCheck.setSecore1(0);
            scorePesertaToCheck.setSecore2(0);
            scorePesertaToCheck.setSecore3(0);

            Map<String, Peserta> listofPairPeserta = new HashMap<>();

            for (int nPeserta = 0; nPeserta < totalSeluruhPeserta; nPeserta++) {
                String inputLine = scanner.nextLine();
                List<String> inputLinePeserta = Arrays.asList(inputLine.split(" ", 4));

                listofPairPeserta.put(
                        inputLinePeserta.get(0),
                        new Peserta(
                                Integer.parseInt(inputLinePeserta.get(1)),
                                Integer.parseInt(inputLinePeserta.get(2)),
                                Integer.parseInt(inputLinePeserta.get(3))));

                if (inputLinePeserta.get(0).equals(pesertaToCheck)) {
                    scorePesertaToCheck =
                            new Peserta(
                                    Integer.parseInt(inputLinePeserta.get(1)),
                                    Integer.parseInt(inputLinePeserta.get(2)),
                                    Integer.parseInt(inputLinePeserta.get(3)));
                }
            }

            int pesertaToCHeckRanking = 1;
            // mencari ranking dari pesertaToCheck
            for (Map.Entry<String, Peserta> peserta : listofPairPeserta.entrySet()) {
                // kalau dirinya sendiri, gausah dicheck
                if (peserta.getKey().equals(pesertaToCheck)) continue;
                // kalau secore peserta lain lebih tinggi, rangking++
                if (isGreaterThan(peserta.getValue(), scorePesertaToCheck)) pesertaToCHeckRanking++;
            }

            if (pesertaToCHeckRanking <= totalPesertaLulus) result.add("YA");
            else result.add("TIDAK");
        }

        for (String res : result) System.out.println(res);
    }

    public static boolean isGreaterThan(Peserta value, Peserta scorePesertaToCheck) {
        if (value.getSecore3() > scorePesertaToCheck.getSecore3()) return true;
        if (value.getSecore3() < scorePesertaToCheck.getSecore3()) return false;
        if (value.getSecore2() > scorePesertaToCheck.getSecore2()) return true;
        if (value.getSecore2() < scorePesertaToCheck.getSecore2()) return false;
        return value.getSecore1() > scorePesertaToCheck.getSecore1();
    }
}

class Peserta {
    public int secore1;
    public int secore2;
    public int secore3;

    public Peserta() {
    }

    public Peserta(int secore1, int secore2, int secore3) {
        this.secore1 = secore1;
        this.secore2 = secore2;
        this.secore3 = secore3;
    }

    public int getSecore1() {
        return secore1;
    }

    public void setSecore1(int secore1) {
        this.secore1 = secore1;
    }

    public int getSecore2() {
        return secore2;
    }

    public void setSecore2(int secore2) {
        this.secore2 = secore2;
    }

    public int getSecore3() {
        return secore3;
    }

    public void setSecore3(int secore3) {
        this.secore3 = secore3;
    }
}
