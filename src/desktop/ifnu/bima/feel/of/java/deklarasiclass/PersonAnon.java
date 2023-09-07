package desktop.ifnu.bima.feel.of.java.deklarasiclass;

public class PersonAnon {
    private Runnable thread = new Runnable() {
        @Override
        public void run() {
            System.out.println("HelloWorld from Thread");
        }
    };
}
