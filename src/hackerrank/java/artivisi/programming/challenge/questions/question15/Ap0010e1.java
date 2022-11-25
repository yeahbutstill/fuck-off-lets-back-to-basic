package hackerrank.java.artivisi.programming.challenge.questions.question15;

import java.util.Date;
import java.util.Random;

public class Ap0010e1 {
    public static void main(String[] args) {
        Random random = new Random(new Date().getTime());
        double doubleVar = random.nextInt() / 1.0;

        System.out.println(doubleVar);
        new Worker().doIt(doubleVar);
    }
}

class Worker {
    public void doIt(double val) {
        double var = val;
        System.out.println(var);
    }
}
