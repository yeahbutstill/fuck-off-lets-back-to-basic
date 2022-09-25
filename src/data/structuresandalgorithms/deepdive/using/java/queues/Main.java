package data.structuresandalgorithms.deepdive.using.java.queues;

public class Main {

    public static void main(String[] args) {

        Produk jeruk = new Produk(1, 10000, "Jeruk");
        Produk mangga = new Produk(2, 2000, "Mangga");
        Produk salak = new Produk(3, 100, "Salak");
        Produk jambu = new Produk(4, 101, "Jambu");
        Produk pisang = new Produk(5, 70, "Pisang");

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(jeruk);
        queue.add(mangga);
        queue.add(salak);
        queue.add(jambu);
        queue.add(pisang);
        queue.printQueue();
        System.out.println("===========================================");
        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println("==========================================");
        System.out.println(queue.peek());
        System.out.println("==========================================");
        queue.remove();
        queue.remove();
        queue.remove();
        queue.printQueue();
        System.out.println("Data kosong");
        System.out.println("===============Mari Masukan Data===========================");
        queue.add(pisang);
        queue.printQueue();
        System.out.println();
        System.out.println();

        ArrayQueue queue1 = new ArrayQueue(5);
        queue1.add(mangga);
        queue1.add(jeruk);
        queue1.remove();
        queue1.add(pisang);
        queue1.remove();
        queue1.add(jambu);
        queue1.remove();
        queue1.add(salak);
        queue1.remove();
        queue1.add(mangga);

        queue1.printQueue();

    }

}
