package hackerrank.java.artivisi.programming.challenge.questions.question2;

public class Ap011 {
    public static void main(String[] args) {
        new Worker().doAsg();
    }
}

class Worker {
    public void doAsg() {
        double myDoubleVar;
        int myIntVar = Integer.MAX_VALUE;
        myDoubleVar = myIntVar;
        System.out.println(myDoubleVar);
    }
}