package hackerrank.java.artivisi.programming.challenge.questions.question18;

public class Ap0010h1 {
    public static void main(String[] args) {
        new Worker().doIt();
        Worker refVar = new Worker();
        refVar.hello();
    }
}

class Worker {
    public void doIt() {
        boolean var = false;
        System.out.println(var);
    }

    public void hello() {
        System.out.println("Hello World");
    }
}