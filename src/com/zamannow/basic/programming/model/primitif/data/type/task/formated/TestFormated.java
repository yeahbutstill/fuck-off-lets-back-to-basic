package com.zamannow.basic.programming.model.primitif.data.type.task.formated;

import edu.princeton.cs.algs4.StdOut;

public class TestFormated {
    public static void main(String[] args) {
        StdOut.printf("PI is approximately %.2f\n", Math.PI);
        StdOut.printf("%14d", 512);
        System.out.println();
        StdOut.printf("%-14d", 512);
        System.out.println("\n");
        System.out.println("KEEP ASIK");
        System.out.printf("%14.2f \n", 1595.1680010754388);
        System.out.printf("%.7f \n", 1595.1680010754388);
        System.out.printf("\n %14.4e", 1595.1680010754388);
        System.out.println("KEEP ACIK");
        System.out.printf("%20s", "HAHA HELLO\n");
        System.out.printf("%-20s", "HAHA HELLO\n");
        System.out.printf("%-20.3s", "HAHA HELLO");
    }
}
