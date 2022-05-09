package desktop.ifnu.bima.oop.bigdecimal.dan.currency;


import java.text.NumberFormat;
import java.util.Locale;

/**
 * Mari kita lihat contoh perhitungan bilangan pecahan menggunakan double yang bisa
 * menyebabkan kesalahan angka dibelakang koma. Misalnya kita menjual barang dengan harga Rp.
 * 1.000.000,05 kemudian ada diskon 10%, baru setelah itu dihitung PPN 5%. Untuk melihat
 * hasilnya digunakan class NumberFormat agar tampilan diformat menggunakan format uang
 * Rupiah yang benar.
 */
public class SaleDecimalTest {

    public static void main(String[] args) {

        Double amount = 1000000.05;
        Double discount = amount * 0.10;
        Double total = amount - discount;
        Double tax = total * 0.05;
        Double taxedTotal = tax + total;
        NumberFormat money = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));

        System.out.println("Subtotal : " + money.format(amount));
        System.out.println("Discount : " + money.format(discount));
        System.out.println("Total : " + money.format(total));
        System.out.println("Tax : " + money.format(tax));
        System.out.println("Tax + Total : " + money.format(taxedTotal));

        /**
         * nilai total bukanya Rp 900.000,05 tetapi malah Rp 900.000,04
         * ternyata terjadi kesalahan pembualatan uang pada NumberFormat.
         */

    }

}
