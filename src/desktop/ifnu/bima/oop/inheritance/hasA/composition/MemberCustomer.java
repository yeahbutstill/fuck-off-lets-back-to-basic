package desktop.ifnu.bima.oop.inheritance.hasA.composition;

/**
 * Class MemberCustomer dalam hal ini mempunyai hubungan IS-A dengan class Customer. Kalimat
 * lengkapnya adalah “MemberCustomer IS-A Customer”. Hal ini dikarenakan MemberCustomer adalah
 * turunan Customer, analoginya kita bisa menggunakan kucing dan hewan. Kucing adalah turunan dari
 * hewan, maka kucing adalah hewan. Sama juga seperti MemberCustomer adalah turunan dari Customer,
 * maka MemberCustomer adalah Customer. Apa tujuan dari inheritance dilihat dari sisi kode? Yang
 * pertama adalah mempromosikan code reuse, yaitu penggunaan kembali kode yang sudah ditulis. Hal
 * ini dikarenakan, sebagai turunan dari Customer, MemberCustomer akan mempunyai semua sifat-sifat
 * (kode) dari class Customer. Misalnya kita ubah sedikit kode di atas, kita tambahkan property dan
 * method di dalam class Customer :
 */
public class MemberCustomer extends Customer {
}
