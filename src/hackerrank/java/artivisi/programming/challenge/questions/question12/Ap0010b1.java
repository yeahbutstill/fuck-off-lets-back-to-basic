package hackerrank.java.artivisi.programming.challenge.questions.question12;

import java.util.Date;
import java.util.Random;

public class Ap0010b1 {
    public static void main(String[] args) {
        Random random = new Random(new Date().getTime());
        int intVar = random.nextInt();
        int var = intVar;

        System.out.println(var);
        new Worker().doIt(var);
    }
}

class Worker {
    public void doIt(int var) {
        System.out.println(var);
    }
}