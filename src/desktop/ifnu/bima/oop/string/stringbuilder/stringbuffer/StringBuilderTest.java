package desktop.ifnu.bima.oop.string.stringbuilder.stringbuffer;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder("ini StringBuilder tidak immutable");
        System.out.println("sebelum operasi concat nilai s : " + s);

        //append merubah variable s, setelah proses append nilai variable s akan berubah
        s.append("concat");
        System.out.println("setelah operasi concat niali s : " + s);

    }

}
