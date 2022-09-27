package data.structuresandalgorithms.deepdive.using.java.hashtables;

public class Main {
    public static void main(String[] args) {
        Binatang jerapa = new Binatang(123, "Jerapa", "1 Tahun");
        Binatang harimau = new Binatang(4567, "Harimau", "2 Tahun");
        Binatang buaya = new Binatang(22, "Buaya", "3 Tahun");
        Binatang kucing = new Binatang(3245, "Kucing", "7 Bulan");
        Binatang elang = new Binatang(70, "Elang", "1 Tahun");

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Jones", jerapa);
        ht.put("Doe", harimau);
        ht.put("Wilson", kucing);
        ht.put("Smith", buaya);
        ht.put("Marryss", elang);

        ht.printHashTable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashTable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

    }
}
