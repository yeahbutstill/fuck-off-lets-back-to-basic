package data.structuresandalgorithms.deepdive.using.java.doublelinkedlist;

public class Main {

    public static void main(String[] args) {

        Employee dani = new Employee("dani", "setiawan", 123);
        Employee maya = new Employee("maya", "triyanti", 124);
        Employee winda = new Employee("winda", "lestari", 125);
        Employee yuni = new Employee("yuni", "setyawati", 126);
        Employee sehu = new Employee("sae", "hudin", 127);

        EmployeeDoubleLinkedList list = new EmployeeDoubleLinkedList();
        list.addToFront(dani);
        list.addToFront(maya);
        list.addToFront(winda);
        list.addToFront(yuni);
        list.addToFront(sehu);

        list.printList();
        System.out.println(list.getSize());

        Employee kismanEnd = new Employee("kisman", "supriatna", 128);
        list.addToEnd(kismanEnd);
        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

    }
}
