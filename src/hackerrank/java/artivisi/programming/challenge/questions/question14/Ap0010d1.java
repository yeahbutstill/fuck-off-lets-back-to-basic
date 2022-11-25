package hackerrank.java.artivisi.programming.challenge.questions.question14;

import java.util.Date;
import java.util.Random;

public class Ap0010d1 {
    public static void main(String[] args) {
        Random random = new Random(new Date().getTime());
        int intVar = random.nextInt();
        double var = intVar / 1.1;

        System.out.println(var);
        System.out.println(new Worker().doIt(var));

    }
}

class Worker {
    public int doIt(double var) {
        return (int) var;
    }
}
