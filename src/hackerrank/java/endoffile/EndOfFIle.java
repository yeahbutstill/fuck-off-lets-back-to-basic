package hackerrank.java.endoffile;

import java.util.Scanner;

public class EndOfFIle {
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        int i=0;
        while(io.hasNextLine())
        {
            String s = io.nextLine();
            if (s.contains("end-of-file"))
            {
                i++;
                System.out.println(i+" "+s);
                break;
            }
            else
            {
                i++;
                System.out.println(i+" " +s);
            }
        }
    }
}
