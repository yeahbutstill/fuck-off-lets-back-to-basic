package hackerrank.java.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoops1 {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("input = ");
            int N = Integer.parseInt(bufferedReader.readLine().trim());
            int i;
            for(i = 1; i < 11; i++) {
                System.out.println(+ N + " x " + i + " = " + N*i);
            }

            bufferedReader.close();
        }
}
