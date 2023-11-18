package id.toki.tlx.algo;

class Luar {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int nilai) {
        a = nilai;
    }

    public void showData() {
        // Baris di bawah ini SALAH, karena x tidak dikenal di sini
        // System.out.println("Nilai x dari kelas Dalam : " + x);
        Dalam obj = new Dalam();
        obj.showData();
    }

    // Mendefinisikan inner class
    class Dalam {
        private final int x = 10; // hanya dikenali oleh kelas Dalam

        public void showData() {
            System.out.println("Nilai a dari kelas Luar : " + a);
            System.out.println("Nilai x dari kelas Dalam : " + x);
        }
    }
}
