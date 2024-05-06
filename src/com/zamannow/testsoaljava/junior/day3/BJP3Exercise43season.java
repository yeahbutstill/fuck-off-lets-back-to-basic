package com.zamannow.testsoaljava.junior.day3;

public class BJP3Exercise43season {
    public static void main(String[] args) {
        System.out.println(season(3, 16));
        System.out.println(season(1, 21));
        System.out.println(season(6, 16));
        System.out.println(season(9, 16));
        System.out.println();
        System.out.println(3 <= 6);
    }

    /**
     * Tulis method bernama season
     * yang menggunakan dua bilangan bulat sebagai parameter yang mewakili bulan dan hari
     * dan mengembalikan sebuah String yang menunjukkan musim untuk bulan dan hari tersebut.
     * Asumsikan bulan ditentukan sebagai bilangan bulat antara 1 dan 12 (1 untuk bulan Januari, 2 untuk bulan Februari, dan seterusnya)
     * dan hari dalam bulan tersebut adalah angka antara 1 dan 31.
     * <p>
     * Jika tanggalnya jatuh antara 16/12 dan 15/3, Anda harus mengembalikan 'Musim Dingin'.
     * Jika tanggalnya jatuh antara 16/3 dan 15/6, Anda harus mengembalikan 'Musim Semi'.
     * Jika tanggalnya jatuh antara 16/6 dan 15/9, Anda harus mengembalikan 'Musim Panas'.
     * Dan jika tanggalnya jatuh antara 16/9 dan 15/12, Anda harus mengembalikan 'Musim Gugur'.
     *
     * @param m month number
     * @param d day number
     * @return string
     */
    public static String season(int m, int d) {
        if ((m >= 3 && d >= 16 && m < 6) || (m <= 6 && d <= 15 && m > 3)) {
            return "Musim Semi";
        } else if ((m >= 6 && d >= 16 && m < 9) || (m <= 9 && d <= 15 && m > 6)) {
            return "Musim Panas";
        } else if ((m >= 9 && d >= 16 && m < 12) || (m <= 12 && d <= 15 && m > 9)) {
            return "Musim Gugur";
        }
        return "Musim Dingin";
    }
}
