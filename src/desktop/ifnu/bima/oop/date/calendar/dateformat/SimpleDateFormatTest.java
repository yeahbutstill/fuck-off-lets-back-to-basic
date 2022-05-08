package desktop.ifnu.bima.oop.date.calendar.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(now));
        String tanggal = "22/09/1993 08:09:10";
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(tanggal);
            System.out.println(new SimpleDateFormat("dd MMMM yyyy").format(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

}
