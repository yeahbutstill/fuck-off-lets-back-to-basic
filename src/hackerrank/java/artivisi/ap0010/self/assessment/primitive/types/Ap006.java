package hackerrank.java.artivisi.ap0010.self.assessment.primitive.types;

public class Ap006 {
    public static void main(
            String args[]) {
        new Worker().printBoolean();
    }//end main()
}//end class definition

class Worker {
    public void printBoolean() {
        boolean myVar = true;
        myVar = false;
        System.out.println(myVar);
    }//end printBoolean()
}//end class definition
