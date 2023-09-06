package id.toki.tlx.algo;

class Luar {
    private int a;

    public void setA(int nilai) {
        a = nilai;
    }

    public int getA() {
        return a;
    }

    // Mendefinisikan inner class
    class Dalam {
        private int x = 10; // hanya dikenali oleh kelas Dalam

        public void showData() {
            System.out.println("Nilai a dari kelas Luar : " + a);
            System.out.println("Nilai x dari kelas Dalam : " + x);
        }
    }

    public void showData() {
        // Baris di bawah ini SALAH, karena x tidak dikenal di sini
        //System.out.println("Nilai x dari kelas Dalam : " + x);
        Dalam obj = new Dalam();
        obj.showData();
    }
}
