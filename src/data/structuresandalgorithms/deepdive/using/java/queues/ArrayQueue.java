package data.structuresandalgorithms.deepdive.using.java.queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Produk[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Produk[capacity];
    }

    public void add(Produk produk) {
        if (size() == queue.length - 1) {
            int numItems = size();
            Produk[] newArray = new Produk[2 * queue.length];

            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);

            queue = newArray;

            front = 0;
            back = numItems;

        }

        queue[back] = produk;
        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }
    }

    public Produk remove() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Produk produk = queue[front];
        queue[front] = null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }

        return produk;
    }

    public Produk peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public int size() {
        if (front <= back) {
            return back - front;
        } else {
            return back - front + queue.length;
        }
    }

    public void printQueue() {
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }

}
