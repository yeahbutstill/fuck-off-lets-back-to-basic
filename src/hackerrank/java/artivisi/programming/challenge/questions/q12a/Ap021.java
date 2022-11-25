package hackerrank.java.artivisi.programming.challenge.questions.q12a;

public class Ap021 {
    public static void main(String[] args) {
        new Worker().doMod();
    }
}

class Worker {
    public void doMod() {
        double myVar = -0.11;
        double myVar1 = 0.033;
        System.out.println(myVar % myVar1);
    }
}