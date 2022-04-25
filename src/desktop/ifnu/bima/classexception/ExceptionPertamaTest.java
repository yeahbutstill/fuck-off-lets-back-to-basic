package desktop.ifnu.bima.classexception;

public class ExceptionPertamaTest {
    public static void main(String[] args) {
        try {
            System.out.println("eksekusi exception pertama");
            throw new ExceptionPertama("ini pesan exception pertama");
        } catch (ExceptionPertama e) {
            e.printStackTrace();
        }
    }
}
