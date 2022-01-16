package gc;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date d = new Date();
        d = null;
        System.out.println(d);

        Date da = new Date();
        d = new Date();
        System.out.println(d);


        Date d2 = getDate();
        // lakukan sesuati disini
        System.out.println(d2);
    }

    public static Date getDate() {
        StringBuffer buffer = new StringBuffer("garbage collectable");
        Date date = new Date();
        return date;
    }
}
