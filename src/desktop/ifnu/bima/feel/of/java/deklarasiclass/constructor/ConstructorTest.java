package desktop.ifnu.bima.feel.of.java.deklarasiclass.constructor;

/**
 * memperlihatkan bahwa class ConstructorTest tidak mendefnisikan constructor sama
 * sekali, tetapi constructor new ConstructorTest() dapat dipanggil tanpa menyebabkan adanya
 * error. Hal ini disebabkan karena Java akan membuatkan default constructor kalau class tidak
 * mendefnisikan cosnstructor sama sekali.
 */
public class ConstructorTest {
    public static void main(String[] args) {
        ConstructorTest test = new ConstructorTest();
        test.methodSederhana();
    }

    public void methodSederhana() {
        System.out.println("method sederhana dipanggil");
    }
}
