package desktop.ifnu.bima.oop.polimorfisme;

import desktop.ifnu.bima.oop.inheritance.hasA.composition.Customer;
import desktop.ifnu.bima.oop.inheritance.hasA.composition.MemberCustomer;

public class Test {
    private static final String ACTION_1 = "tipenya Object";

    public static void main(String[] args) {
        Object o = new MemberCustomer();
        Customer c = new MemberCustomer();
        MemberCustomer mc = new MemberCustomer();
        Object object = mc;
        Customer cust = mc;

        if (o instanceof Object) {
            System.out.println(ACTION_1);
        } else if (c instanceof Customer) {
            System.out.println(ACTION_1);
        } else if (mc instanceof Customer) {
            System.out.println(ACTION_1);
        } else if (object instanceof MemberCustomer) {
            System.out.println(ACTION_1);
        } else if (cust instanceof Object) {
            System.out.println(ACTION_1);
        } else {
            System.out.println("bukan object yang sama");
        }
    }
}
