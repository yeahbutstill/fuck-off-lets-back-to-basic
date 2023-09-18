package desktop.ifnu.bima.feel.of.java.flow.exception;

public class ExceptionPertamaTest {
  public static void main(String[] args) {
    try {
      /**
       * Kode di dalam try{} adalah kode yang melempar exception (throw), kalau kode di dalamnya
       * berjalan normal dan tidak ada exception yang terjadi, eksekusi akan sampai ke baris
       * terakhir. Sebaliknya, kalau ada exception dengan tipe ClassException maka eksekusi akan
       * loncat dalam blok catch pertama, kalau ada exception dengan tipe ExceptionLain maka
       * eksekusi akan loncat ke dalam blok catch kedua.
       */
      System.out.println("eksekusi exception pertama");
      throw new ExceptionPertama("eksekusi exception pertama");
    } catch (ExceptionPertama e) {
      e.printStackTrace();
    }
  }
}
