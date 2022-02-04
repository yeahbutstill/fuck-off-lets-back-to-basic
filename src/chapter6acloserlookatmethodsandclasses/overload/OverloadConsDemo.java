package chapter6acloserlookatmethodsandclasses.overload;

// Demonstrate an overloaded constructor.
class MyClass {
  int x;

  MyClass() { // Construct object in a variety of ways.
    System.out.println("Inside MyClass().");
    x = 0;
  }

  MyClass(int i) { // Construct object in a variety of ways.
    System.out.println("Inside MyClass(int).");
    x = i;
  }

  MyClass(double d) { // Construct object in a variety of ways.
    System.out.println("Inside MyClass(double).");
    x = (int) d;
  }

  MyClass(int i, int j) { // Construct object in a variety of ways.
    System.out.println("Inside MyClass(int, int).");
    x = i * j;
  }
}

public class OverloadConsDemo {
  public static void main(String[] args) {
    MyClass t1 = new MyClass();
    MyClass t2 = new MyClass(88);
    MyClass t3 = new MyClass(17.23);
    MyClass t4 = new MyClass(2, 4);

    System.out.println("t1.x: " + t1.x);
    System.out.println("t2.x: " + t2.x);
    System.out.println("t3.x: " + t3.x);
    System.out.println("t4.x: " + t4.x);
  }
}
