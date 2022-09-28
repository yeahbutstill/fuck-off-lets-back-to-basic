package data.structuresandalgorithms.deepdive.using.java.hashtables;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee(123, "Jane", "Jones");
        Employee johnDoe = new Employee(4567, "John", "Doe");
        Employee marySmith = new Employee(22, "Mary", "Smith");
        Employee mikeWilson = new Employee(3245, "Mike", "Wilson");
        Employee daniS = new Employee(70, "Dani", "Setiawan");

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
        ht.put("Setiawan", daniS);

        ht.printHashTable();

        System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));
        System.out.println("Retrieve key Smith: " + ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        ht.printHashTable();

        System.out.println("Retrieve key Smith: " + ht.get("Smith"));
        System.out.println();
        System.out.println("========================================");

        Chaining htChaining = new Chaining();
        htChaining.put("Jones", janeJones);
        htChaining.put("Doe", johnDoe);
        htChaining.put("Wilson", mikeWilson);
        htChaining.put("Smith", marySmith);
        htChaining.printHashtable();

        System.out.println("=========================================");

        System.out.println("Retrieve key Smith: " + htChaining.get("Smith"));

        htChaining.remove("Doe");
        htChaining.remove("Jones");
        htChaining.printHashtable();

    }
}
