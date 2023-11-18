package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainExampleQueue {
    public static void main(String[] args) {
        Queue<Integer> umur = new PriorityQueue<>();
        umur.add(7);
        umur.add(10);
        umur.add(5);
        System.out.println(umur.poll());
    }
}
