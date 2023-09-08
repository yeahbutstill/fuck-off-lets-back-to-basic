package desktop.ifnu.bima.feel.of.java.deklarasiclass.property;

/**
 * Property adalah variabel yang dideklarasikan di dalam class sejajar dengan method. Variabel
 * yang berada di dalam method bukan merupakan property, tetapi disebut sebagai local variabel.
 * Layaknya variabel yang lain, property mempunyai tipe data dan nama. Berdasarkan aturan
 * java bean, property akan dibuatkan method getter dan setter untuk membungkus property.
 * Secara umum, disarankan untuk memberikan access modifer private kepada semua property,
 * kalau ingin mengakses property tersebut maka buatlah method getter dan setter.
 * Deklarasi property diawali dengan access modifer kemudian diikuti dengan tipe data dan
 * akhirnya adalah nama dari property. Property bisa langsung diinisialisasi nilainya atau tidak,
 * kalau tidak diberi nilai, maka nilai default yang akan diset sebagai nilai awal property.
 * private String stringProperty;
 */
public class PropertyStaticTest {
    /**
     * Beberapa keyword lain juga bisa digunakan untuk mendeklarasikan property. Keyword static
     * bisa digunakan untuk mendeklarasikan property, static akan membuat property menjadi milik
     * class bukan milik object. Property static bisa diakses dari nama classnya dan tidak perlu ada
     * object yang diinstansiasi. Karena property static menjadi milik class, maka kalau property
     * static ini diganti isinya maka semua kode yang mengakses property static ini akan melihat nilai
     * yang sama. Contohnya seperti di bawah ini :
     */
    public static String nilaiStatic;

    public static void main(String[] args) {
        // property static dipanggil menggunakan nama class
        PropertyStaticTest.nilaiStatic = "nilai dari main";
        // property static juga bisa dipanggil tanpa nama class dari class yang sama
        System.out.println(nilaiStatic);
        // method main adalah static, hanya bisa memanggil method static juga
        methodUbahPropertyStatic();
        // nilai property berubah setelah methodubahPropertyStatic dipanggil
        System.out.println(nilaiStatic);
    }

    private static void methodUbahPropertyStatic() {
        PropertyStaticTest.nilaiStatic = "nilai dari methodUbahPropertyStatic";
    }

}
/**
 * variabel static bisa sangat berguna untuk memudahkan mengakses suatu variabel karena
 * tinggal menggunakan nama class saja, jadi tidak perlu membawa-bawa nilai variabel ke dalam
 * object yang memerlukanya. Tetapi pada skenario berbeda property static ini malah
 * merepotkan, terutama di lingkungan aplikasi web yang berjalan dalam cluster. Antara satu
 * cluster satu dan cluster yang lain nilai static ini bisa berbeda dan menyebabkan aplikasimenjadi tidak konsisten
 */
