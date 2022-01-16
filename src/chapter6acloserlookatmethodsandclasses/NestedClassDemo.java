package chapter6acloserlookatmethodsandclasses;

// Use an inner class.
class Outer {

    int nums[];

    Outer(int n[]) {
        nums = n;
    }

    void analyze() {
        Inner inOb = new Inner();

        System.out.println("Minimum: " + inOb.min());
        System.out.println("Maximum: " + inOb.max());
        System.out.println("Avarage: " + inOb.avg());
    }

    // This is an inner class.
    class Inner { // An inner class

        int min() {
            int m = nums[0];

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < m) m = nums[i];
            }
            return m;
        }

        int max() {
            int m = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > m) {
                    m = nums[i];
                }
            }
            return m;
        }

        int avg() {
            int a = 0;
            for (int i = 0; i < nums.length; i++) {
                a += nums[i];
            }
            return a / nums.length;
        }
    }

}

public class NestedClassDemo {
    public static void main(String[] args) {
        int x[] = {3, 2, 1, 5, 6, 9, 7, 8};
        Outer outer = new Outer(x);

        outer.analyze();
    }
}
