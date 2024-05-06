package ptakhdanirekasolusi;

public class TestFungsi {
    public static void main(String[] args) {
        TestFungsi testFungsi = new TestFungsi();
        System.out.println(testFungsi.max3(10, 20, 30));
    }

    public Integer max2(int a, int b) {
        if (a > b) return a;
        return b;
    }

    public Integer max3(int a, int b, int c) {
        Integer i = max2(a, b);
        if (i > c) return i;
        return c;
    }
}
