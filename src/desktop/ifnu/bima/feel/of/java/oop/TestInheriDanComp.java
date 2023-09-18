package desktop.ifnu.bima.feel.of.java.oop;

import java.io.Serializable;
import java.util.UUID;

public class TestInheriDanComp {
  public static void main(String[] args) {
    Jawa jawa = new Jawa();
    jawa.setId(UUID.randomUUID());
    jawa.setNamaIbuKandung("yun");
    jawa.setNamaAyahKandung("sae");
    jawa.setUmur(60);
    Alamat alamat = new Alamat();
    alamat.setId(UUID.randomUUID());
    alamat.setJalan("Komp.Depag");
    alamat.setRt("RT/01");
    alamat.setRw("RW/015");
    alamat.setKec("Pabuaran");
    alamat.setKab("Bojong Gede");
    jawa.setAlamat(alamat);
    jawa.setNamaSuami("dan");
    jawa.setNamaIstri("may");
    jawa.setPunyaAnak(3);
    System.out.println(jawa);

    System.out.println("==============================");

    /**
     * Polimorfisme (Polymorphism)
     * Arti polimorfsme secara harfah (makna kata) adalah banyak bentuk. Sebuah object bisa diassign
     * ke dalam tipe yang berbeda-beda. Contohnya class Betawi IS-A
     * Object, karena semua class pasti extends Object
     * Keluarga, karena Class Betawi extends Class Keluarga
     * Betawi
     */
    Object betawiObject = new Betawi();
    System.out.println(betawiObject.getClass());

    Keluarga betawiKel = new Betawi();
    betawiKel.setNamaIbuKandung("sakura");
    betawiKel.setId(UUID.randomUUID());
    betawiKel.setUmur(50);
    System.out.println(betawiKel);

    Betawi betawi = new Betawi();
    betawi.setId(UUID.randomUUID());
    betawi.setNamaIstri("sakura");
    betawi.setNamaSuami("sasuke");
    betawi.setPunyaAnak(2);
    betawi.setNamaAyahKandung("kakashi");
    betawi.setNamaIbuKandung("sunade");
    System.out.println(betawi);

    Object object = betawi;
    System.out.println(object.getClass());

    Keluarga kelua = betawi;
    kelua.setId(UUID.randomUUID());
    System.out.println(kelua);
    System.out.println();

    /**
     * Sekarang kita bisa mendeklarasikan variabel dengan tipe Serializable dan mengassign
     * instance dari MemberCustomer ke dalam variabel tersebut. Atau dengan kata lain
     * MemberCustomer IS-A Serialiable, seperti contoh di bawah ini :
     */
    Serializable betawiSerialize = new Betawi();
    System.out.println(betawiSerialize);
  }
}

/**
 * Jadi Class Betawi mempunyai banyak bentuk (polimorfsme). Kita akan sering melihat
 * kode dengan pola seperti ini, variabel akan dideklarasikan dengan tipe interface tetapi
 * diinstansiasi dengan class yang mengimplementasikan interface tersebut. Praktek seperti ini
 * dikategorikan sebagai praktek yang baik sehingga banyak diikuti oleh developer Java.
 */
