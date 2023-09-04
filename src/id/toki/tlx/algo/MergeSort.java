package id.toki.tlx.algo;

public class MergeSort {
    static int counter = 0;

    public static void main(String[] args) {
        int[] data = {6,5,12,10,9,1};
        System.out.print("Data acak: ");
        cetak(data);
        System.out.println();
        split(data);
        System.out.print("\n\nData urut: ");
        cetak(data);
    }

    public static void split(int[] data) {
        if (data.length > 1) {
            int[] kiri = new int[data.length / 2];
            System.arraycopy(data, 0, kiri, 0, data.length / 2);
            counter++;
            System.out.print("\nSplit: (" + counter + ") kiri: ");
            cetak(kiri);
            split(kiri);
            int pKanan = data.length - data.length / 2;
            int[] kanan = new int[pKanan];
            System.arraycopy(data, data.length / 2, kanan, 0, pKanan);
            counter++;
            System.out.print("\t (" + counter + ") kanan: ");
            cetak(kanan);
            split(kanan);
            int[] tmp = merge(kiri, kanan);
            System.arraycopy(tmp, 0, data, 0, tmp.length);
        }
    }

    public static int[] merge(int[] kiri, int[] kanan) {
        int[] temp = new int[kiri.length + kanan.length];
        int indexKiri = 0;
        int indexKanan = 0;
        int indexTemp = 0;
        counter++;
        while (indexKiri < kiri.length && indexKanan < kanan.length) {
            if (kiri[indexKiri] < kanan[indexKanan]) {
                temp[indexTemp++] = kiri[indexKiri++];
            } else {
                temp[indexTemp++] = kanan[indexKanan++];
            }
        }

        while (indexKiri < kiri.length) {
            temp[indexTemp++] = kiri[indexKiri++];
        }

        while (indexKanan < kanan.length) {
            temp[indexTemp++] = kanan[indexKanan++];
        }

        System.out.print("\nMerge: (" + counter + ") ");
        cetak(temp);
        return temp;
    }

    public static void cetak(int[] data) {
        for (int x = 0; x < data.length; x++) {
            System.out.print(data[x] + " ");
        }
    }
}
