package desktop.ifnu.bima.feel.of.java.oop.classpenting.bigdecimaldancurrency;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DoubleProblemTest {
  public static void main(String[] args) {
    double dd = .35;
    BigDecimal d = new BigDecimal(dd);
    System.out.println(".35 = " + d); // hasilnya berantakan karena dari double

    d = d.setScale(2, RoundingMode.HALF_UP);
    System.out.println(".35 = " + d); // hasilnya bagus setelah pembulatan

    BigDecimal bigDecimal = new BigDecimal("0.35");
    System.out.println(".35 = " + bigDecimal); // hasilnya bagus
    /**
     * BigDicimal yang dibuat dari double mempunyai nilai sama persis dengan double, makanya lebih
     * baik kalau nilainya berasal dari String sehingga bisa sesuai yang kita harapkan.
     */
  }
}
