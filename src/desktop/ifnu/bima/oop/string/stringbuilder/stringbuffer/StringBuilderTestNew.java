package desktop.ifnu.bima.oop.string.stringbuilder.stringbuffer;

/**
 * Jadi kalau sudah menggunakan JDK 6 tidak perlu khawatir melakukan penggabungan string
 * menggunakan class String dan operator +, tetapi memang sebaiknya selalu gunakanStringBuilder.append untuk menekankan disiplin penggabungan string yang baik.
 */

public class StringBuilderTestNew {

    public static void main(String[] args) {

        String s = "ini string immutable ";
        StringBuilder builder = new StringBuilder();
        String concat = builder.append(s).append(s.concat("concat")).append(" object baru").toString();
        System.out.println(concat);

    }

}
