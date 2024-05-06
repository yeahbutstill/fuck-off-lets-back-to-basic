package ptakhdanirekasolusi;

public class HitungTagihanListrik {
    public static void main(String[] args) {
        HitungTagihanListrik hitungTagihanListrik = new HitungTagihanListrik();
        hitungTagihanListrik.pascaBayar(1000, 1125);
    }

    public void pascaBayar(int bl, int bs) {
        int totalTagihan = (bl + bs) + 50000;
        System.out.println(totalTagihan);

    }
}
