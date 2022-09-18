package data.structuresandalgorithms.deepdive.using.java.linkedlist;

public class Main {

    public static void main(String[] args) {

        Employee dani = new Employee("dani", "setiawan", 123);
        Employee maya = new Employee("maya", "triyanti", 124);
        Employee winda = new Employee("winda", "lestari", 125);
        Employee yuni = new Employee("yuni", "setyawati", 126);
        Employee sehu = new Employee("sae", "hudin", 127);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(dani);
        list.addToFront(maya);
        list.addToFront(winda);
        list.addToFront(yuni);
        list.addToFront(sehu);

        System.out.println(list.isEmpty());

        System.out.println(list.getSize());

        list.printList();

        System.out.println(list.isEmpty());

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();

    }
}
