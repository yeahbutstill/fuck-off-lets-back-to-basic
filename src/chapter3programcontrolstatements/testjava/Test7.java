package chapter3programcontrolstatements.testjava;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s2;
        s2 = "ghi";
        System.out.println(s1 + s2 + s3);
    }
}
