package id.toki.tlx.algo;

public class DemoOverloading {
    public static void main(String[] args) {
        System.out.println(" ");
        Phone p1 = new Phone();
        Phone p2 = new Phone("Nokia");
        Phone p3 = new Phone("Sony Ericsoon", 700);
        System.out.println("Perbedaan Output dari masing-masing konstructor");
        p1.lihatPhone();
        p2.lihatPhone();
        p3.lihatPhone();

        Phone p4 = new Phone();
        p4.isiPhone("Samsung");
        Phone p5 = new Phone();
        p5.isiPhone("Samsung", 5000);
        System.out.println("Perbedaan Output dari masing-masing method");
        p4.lihatPhone();
        p5.lihatPhone();
    }
}
