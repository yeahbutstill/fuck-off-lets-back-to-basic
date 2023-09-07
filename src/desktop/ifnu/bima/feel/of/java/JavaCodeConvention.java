package desktop.ifnu.bima.feel.of.java;

/**
 * Class dan Interface selalu diawali dengan huruf besar. Setiap kata selalu diawali dengan huruf
 * besar untuk memudahkan pembacaan. Gaya ini biasa disebut dengan "Camel Case".
 * Contohnya: Runnable, HashMap, ArrayList dan seterusnya. Selain itu, class haruslah
 * merupakan kata benda, bukan kata sifat atau kata kerja.
 * • Method selalu diawali dengan huruf kecil. Setiap kata setelah huruf pertama diawali dengan
 * huruf besar. Method haruslah kata kerja untuk menandakan bahwa method ini melakukan
 * suatu kegiatan / aksi. Contohnya : getIndex, setIndex, println, paint, dan seterusnya.
 * • Variabel menggunakan camel case yang diawali dengan huruf kecil, seperti method.
 * Variabelsebaiknya pendek, jelas, terdengar enak dan kata benda. Contohnya : index, panjang, lebar,
 * indexPertama dan seterusnya.
 * • Konstanta di java dibuat dengan mendeklarasikan sebuah variabel sebagai statif dan fnal,
 * semua hurufnya adalah huruf besar yang antar kata dipisahkan oleh simbol underscore (_).
 * Contohnya : FRAME_WIDTH, ERROR_MESSAGE dan seterusnya.
 */
public class JavaCodeConvention {
    // Untuk memahami konsep JavaBean, ada satu istilah yang disebut dengan Properties. Pada
    //dasarnya properties adalah sebuah instance variabel, yaitu variabel yang berada tepat di
    //bawah class, yang access modifer-nya private. Karena bersifat private maka harus dibuat
    //method untuk mengakses properties dari luar class tersebut. Method untuk mengakses
    //properties biasa disebut sebagai getter dan method untuk mengubah nilai properties disebut
    //sebagaui setter.
    private String name;
    private Integer age;
    private Boolean active;

    // JavaBean harus mempunyai default constructor, yaitu constructor yang tidak mempunyai
    //parameter sama sekali.
    public JavaCodeConvention() {
    }

    public JavaCodeConvention(String name, Integer age, Boolean active) {
        this.name = name;
        this.age = age;
        this.active = active;
    }

    // Kalau tipe data properties bukan boolean maka method untuk mengakses properties
    //diawali dengan get. misalnya getWidth, getSize, getIndex dan seterusnya.
    // Nama method diturunkan dari nama variabel yang diberi awalan get, set atau is. Aturan
    //penulisan camel case berlaku untuk method getter dan setter.
    public String getName() {
        return name;
    }

    // Semua method setter harus diawali dengan set. Misalnya setSize, setIndex, setWidth dan
    //seterusnya
    // Method setter harus public, return void dengan satu parameter yang tipe datanya sama
    //persis dengan tipe data variabel.
    public void setName(String name) {
        this.name = name;
    }

    // Method getter harus public, return tipe data yang sama dengan tipe data variabel, dan
    //tanpa parameter.
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // Kalau tipe data properties adalah boolean maka method untuk mengakses properties
    //diawali dengan is. Misalnya isEmpty, isRunning dan seterusnya.
    public Boolean isActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
