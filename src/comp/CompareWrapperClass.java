package comp;

public class CompareWrapperClass {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer x = new Integer(10);
        System.out.println("new Integer(10) == new Integer(10)?" + (i==x));

        Integer ii = 10;
        Integer xx = 10;
        System.out.println("10 == 10?" + (ii==xx));
    }
}
