package testgawe;

public class StringRef {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s2;
        s2 = "ghi";
        System.out.println(s1 + s2 + s3);
        System.out.println("----------------");


        String x = "xyz";
        x.toUpperCase();
        String y = x.replace('Y', 'y');
        y = y + "abc";
        System.out.println(y);

    }
}
