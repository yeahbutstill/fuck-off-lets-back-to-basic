package desktop.ifnu.bima.feel.of.java.oop;

import java.io.Serializable;

/**
 * Implementasi inheritance dalam kode menggunakan keyword extends. Kalau kita ingin
 * membuat sebuah class turunan dari class yang lain, kita gunakan keyword extends setelah
 * deklarasi nama class diikuti dengan class yang ingin digunakan sebagai orang tua dari class
 * tersebut. Misalnya kita ingin akan membuat dua buah class, class pertama adalah Customer
 * sedangkan class kedua adalah MemberCustomer, dimana class MemberCustomer adalah
 * turunan dari class Customer.
 *
 * Class MemberCustomer dalam hal ini mempunyai hubungan IS-A dengan class Customer.
 * Kalimat lengkapnya adalah “MemberCustomer IS-A Customer”. Hal ini dikarenakan
 * MemberCustomer adalah turunan Customer, analoginya kita bisa menggunakan kucing dan
 * hewan. Kucing adalah turunan dari hewan, maka kucing adalah hewan. Sama juga seperti
 * MemberCustomer adalah turunan dari Customer, maka MemberCustomer adalah Customer.
 */
public class MemberCustomer extends Customer implements Serializable {}
