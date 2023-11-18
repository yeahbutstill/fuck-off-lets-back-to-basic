package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.Deque;
import java.util.LinkedList;

public class MainExampleDeque {
    public static void main(String[] args) {
        Deque<String> bulan = new LinkedList<>();
        bulan.offerLast("1");
        bulan.offerLast("2");
        bulan.offerLast("3");
        System.out.println(bulan.pollLast());
    }
}
