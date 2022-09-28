package data.structuresandalgorithms.deepdive.using.java.hashtables;

import java.util.LinkedList;
import java.util.ListIterator;

public class Chaining {

    private LinkedList<StoredBinatang>[] hashtable;

    public Chaining() {
        hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredBinatang(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredBinatang> iterator = hashtable[hashedKey].listIterator();
        StoredBinatang binatang = null;
        while (iterator.hasNext()) {
            binatang = iterator.next();
            if (binatang.key.equals(key)) {
                return binatang.employee;
            }
        }

        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredBinatang> iterator = hashtable[hashedKey].listIterator();
        StoredBinatang binatang = null;
        int index = -1;
        while (iterator.hasNext()) {
            binatang = iterator.next();
            index++;
            if (binatang.key.equals(key)) {
                break;
            }
        }

        if (binatang == null || !binatang.key.equals(key)) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return binatang.employee;
        }
    }

    private int hashKey(String key) {
        //return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredBinatang> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().employee);
                    System.out.println("->");
                }
                System.out.println("null");
            }
        }
    }

}