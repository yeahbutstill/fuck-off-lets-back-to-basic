package desktop.ifnu.bima.feel.of.java.oop.feelofjava;

public class EnumTest {
  public static void main(String[] args) {
    JenisKlamin jk = JenisKlamin.LAKI_LAKI;
    switch (jk) {
      case LAKI_LAKI -> {
        System.out.println("Suara Laki");
        break;
      }
      case PEREMPUAN -> {
        System.out.println("Suara Perempuan");
        break;
      }
    }

    System.out.println(jk);
    System.out.println();

    JenisKlamin[] jks = JenisKlamin.values();
    for (JenisKlamin jk1 : jks) {
      System.out.println(jk1);
    }
  }
}
