package id.toki.tlx.algo;

public class PersegiPanjang {
    // method prosedur
    static void hitungLuas() {
        int pan = 10;
        int leb = 4;
        int lua = pan * leb;
        System.out.println("Luas persegi panjang = " + lua);
    }

    // method fungsi
    static int hitungLuas1() {
        int pan = 10;
        int leb = 4;
        int lua = pan * leb;
        return lua;
    }

    static int hitungLuas2() {
        int pan = 10;
        int leb = 4;
        return pan * leb;
    }

    public static void main(String[] args) {
        hitungLuas();
        System.out.println("return lua; " + hitungLuas1());
        System.out.println("return pan * leb; " + hitungLuas2());
    }
}
