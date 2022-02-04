package chapter4ntroducinglassesbjectsandethods.classs.constructors;

// A simple constructor.

public class MyClass {
  int x;

  MyClass() { // This is the constructor for MyClass
    x = 10;
  }
}

class ConsDemo {
  public static void main(String[] args) {
    MyClass t1 = new MyClass();
    MyClass t2 = new MyClass();

    System.out.println(t1.x + " " + t2.x);
  }
}
