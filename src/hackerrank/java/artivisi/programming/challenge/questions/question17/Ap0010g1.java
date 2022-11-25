package hackerrank.java.artivisi.programming.challenge.questions.question17;

public class Ap0010g1 {
    public static void main(String[] args) {
        new Worker().doIt(16384);
    }
}

class Worker {
    public void doIt(int val) {
        int val1 = val / 6 - 682;
        System.out.println(val1);

    }
}
