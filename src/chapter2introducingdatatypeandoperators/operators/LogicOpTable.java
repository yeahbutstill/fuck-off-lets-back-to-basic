package chapter2introducingdatatypeandoperators.operators;

public class LogicOpTable {
    public static void main(String[] args) {
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT(p)");

        printTable(true, true);
        printTable(true, false);
        printTable(false, true);
        printTable(false, false);
    }

    private static void printTable(final boolean p, final boolean q) {
        System.out.printf("%s\t\t", p ? "1" : "0");
        System.out.printf("%s\t\t", q ? "1" : "0");
        System.out.printf("%s\t\t", p && q ? "1" : "0");
        System.out.printf("%s\t\t", p || q ? "1" : "0");
        System.out.printf("%s\t\t", p ^ q ? "1" : "0");
        System.out.printf("%s\t\t", !p ? "1" : "0");
        System.out.printf("\n");
    }
}
