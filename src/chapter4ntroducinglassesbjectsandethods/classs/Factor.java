package chapter4ntroducinglassesbjectsandethods.classs;

public class Factor {

    boolean isFactor(int a, int b) { // This method has two parameters
        if ((b % a) == 0) return true;
        else return false;
    }
}

class isFact {

    public static void main(String[] args) {
        Factor x = new Factor();

        // Pass two arguments to isFactor()
        if (x.isFactor(2, 20)) System.out.println("2 is factor");
        if (x.isFactor(3, 20)) System.out.println("this won't be displayed");
    }
}
