package desktop.ifnu.bima.classexception;

/**
 * Exception bisa berasal dari dua tempat: JVM dan Aplikasi. Exception yang berasal dari JVM
 * bersifat umum dan bisa terjadi di semua aplikasi, seperti di contoh sebelumnya kita
 * mendemonstrasikan terjadinya NullPointerException, ClassNotFoundException dan
 * IndexOutOfBounException. Kita juga bisa membuat class exception sendiri yang spesifk
 * terhadap aplikasi.
 * Membuat class exception yang spesifk terhadap aplikasi kita sangat disarankan, dan
 * merupakan best practice yang sering disarankan. Mari kita lihat bagaimana caranya membuat
 * class exception untuk aplikasi kita sendiri :
 */

public class ExceptionPertama extends Exception {
    public ExceptionPertama() {
    }

    public ExceptionPertama(String pesan) {
        super(pesan);
    }
}