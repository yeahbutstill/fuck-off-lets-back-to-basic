package hackerrank.java.artivisi.programming.challenge.questions.q13a;

public class Ap022 {
    public static void main(String[] args) {
        new Worker().doMod();
    }
}

class Worker {
    public void doMod() {
        double myVar = 15.5;
        double myVar1 = 1.55;
        System.out.println(myVar % myVar1);
    }
}