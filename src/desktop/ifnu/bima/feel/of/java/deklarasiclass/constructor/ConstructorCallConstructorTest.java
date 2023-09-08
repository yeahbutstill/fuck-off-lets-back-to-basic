package desktop.ifnu.bima.feel.of.java.deklarasiclass.constructor;

/**
 * Constructor dapat memanggil constructor lain dalam class yang sama menggunakan keyword
 * this. Kode untuk memanggil constructor lain ini harus berada di baris pertama dari constructor,
 * kalau tidak maka akan ada error pada waktu kompilasi
 */
public class ConstructorCallConstructorTest {
    public ConstructorCallConstructorTest() {
        this("constructor memanggil constructor");
        // kode lain disini, tidak bisa diletakan diatas keword this
    }

    public ConstructorCallConstructorTest(String text) {
        methodSederhana(text);
    }

    private void methodSederhana(String text) {
        System.out.println("method sederhana dipanggil dengan text: " + text);
    }

    public static void main(String[] args) {
        // Constructor mana yang dipanggil pada waktu menggunakan keyword this ditentukan dari parameternya.
        ConstructorCallConstructorTest test = new ConstructorCallConstructorTest();

        ConstructorCallConstructorTest test1 = new ConstructorCallConstructorTest();
        test1.methodSederhana("ini test");
    }
}
