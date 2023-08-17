package id.toki.tlx.kuis.subprogram;

public class Test2 {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        System.out.println(test2.sungai(test2.sungai(2, 3), test2.sungai(5, 1)));
    }

    int sungai(int a, int b) {
        int ret = 0;
        int i = 0;
        while (i < b) {
            ret += a;
            i++;
        }
        return ret;
    }
}
