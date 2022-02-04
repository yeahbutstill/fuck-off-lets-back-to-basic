package chapter6acloserlookatmethodsandclasses.accessmodifier;

/*
This is class implements a "fail-soft" array which prevents
runtime errors.
 */
public class FailSoftArray {
  public int length; // length is public
  private int a[]; // reference to array
  private int errval; // value to return if ge() fails

  /*
  Construct array given its size and the value to return if ge() fails.
   */
  public FailSoftArray(int size, int errv) {
    a = new int[size];
    errval = errv;
    length = size;
  }

  // return value at given index.
  public int get(int index) {
    if (indexOK(index)) return a[index]; // trap on out-of-bounds index.
    return errval;
  }

  // put a value at an index, return false on failure.
  public boolean put(int index, int val) {
    if (indexOK(index)) { // trap on out-of-bounds index
      a[index] = val;
      return true;
    }
    return false;
  }

  // return true if index is within bounds.
  private boolean indexOK(int index) {
    if (index >= 0 & index < length) return true;
    return false;
  }
}

// Demonstrate the fail-soft-array
class FSDemo {
  public static void main(String[] args) {
    FailSoftArray fs = new FailSoftArray(5, -1);
    int x;

    // show quiet failures
    System.out.println("Fail quietly");
    for (int i = 0; i < (fs.length * 2); i++) {
      fs.put(i, i * 10); // Access to array must be through its accessor methods
    }

    for (int i = 0; i < (fs.length * 2); i++) {
      x = fs.get(i); // Access to array must be through its accessor methods
      if (x != -1) System.out.print(x + " ");
    }
    System.out.println("");

    // now, handle failures
    System.out.println("\nFail with error reports.");
    for (int i = 0; i < (fs.length * 2); i++) {
      if (!fs.put(i, i * 10)) {
        System.out.println("Index " + i + " out-of-bounds");
      }
    }

    for (int i = 0; i < (fs.length * 2); i++) {
      x = fs.get(i);
      if (x != -1) System.out.print(x + " ");
      else System.out.println("Index " + i + " out-of-bounds");
    }
  }
}
