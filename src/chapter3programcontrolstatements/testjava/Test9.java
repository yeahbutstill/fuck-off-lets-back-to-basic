package chapter3programcontrolstatements.testjava;

/* Use a for loop to generate the progression

  1 2 4 8 16, ...
*/
class Test9 {
    public static void main(String args[]) {
        for(int i = 1; i < 100; i += i)
            System.out.print(i + " ");
    }
}
