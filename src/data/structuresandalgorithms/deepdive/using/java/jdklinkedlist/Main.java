package data.structuresandalgorithms.deepdive.using.java.jdklinkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Employee dani = new Employee("Dani", "dani@yeahbutstill.com", 28);
        Employee maya = new Employee("Maya", "maya@yeahbutstill.com", 27);
        Employee sehu = new Employee("Sehu", "sehu@yeahbutstill.com", 55);
        Employee yuni = new Employee("Yuni", "yuni@yeahbutstill.com", 50);
        Employee billEnd = new Employee("Bill", "bill@yeahbutstill.com", 17);

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(dani);
        list.addFirst(maya);
        list.addFirst(sehu);
        list.addFirst(yuni);

        Iterator iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.addLast(billEnd);
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeFirst();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

        list.removeLast();
        iter = list.iterator();
        System.out.print("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.print("<=>");
        }
        System.out.println("null");

    }

}
