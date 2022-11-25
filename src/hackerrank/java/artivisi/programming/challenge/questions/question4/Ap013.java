package hackerrank.java.artivisi.programming.challenge.questions.question4;

public class Ap013 {
    public static void main(String[] args) {
        new Worker().doAsg();
    }
}

class Worker {
    public void doAsg() {
        double myDoubleVar = Integer.MAX_VALUE;
        int myIntVar;
        myIntVar = (int) myDoubleVar;
        System.out.println(myIntVar);
    }
}
