package id.alta.coursesintroductionto.javaspringboot.collections.iterable;

import java.util.Stack;

public class MainExampleStack {
  public static void main(String[] args) {
    Stack<Integer> umur = new Stack<>();
    umur.push(7);
    umur.push(10);
    umur.push(5);
    System.out.println(umur.pop());
    System.out.println(umur.pop());
    System.out.println(umur.peek());
  }
}
