package gc.expre;

import java.util.Date;

public class ExperimentalGarbageCollector {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("jumlah memory awal : " + runtime.totalMemory());
        for (int i = 0; i < 10000000; i++) {
            Date date = new Date();
            date = null;
        }

        System.out.println("jml mem tersedia before GC : " + runtime.freeMemory());
        System.gc();
        System.out.println("jml mem tersedia after GC : " + runtime.freeMemory());
    }
}
