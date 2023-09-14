package desktop.ifnu.bima.feel.of.java.operator.logika;

public class LogicalOperatorDanDan {
  public static void main(String[] args) {
    /**
     * Berbeda dengan operator &&, dimana operator && tidak akan mengeksekusi operand di sebelah
     * kanan kalau sudah tahu bahwa operand sebelah kiri bernilai false. Hal inilah alasan kenapa
     * operator && dinamakan operator singkat dan. Perilaku operator && ini penting kalau kita ingin
     * memastikan bahwa suatu variabel object tidak bernilai null sebelum memanggil method dari
     * object tersebut, perhatikan contoh kode di bawah ini:
     */
    String nama = null;
    boolean z = (nama != null) && nama.equals("dani");
    System.out.println(z);
  }
}
