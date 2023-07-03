package com.dicoding.javafundamental.basic.strukturdasar;

import com.dicoding.javafundamental.basic.strukturdasar.kendaraan.Kereta;
import com.dicoding.javafundamental.basic.strukturdasar.kendaraan.Mobil;
import com.dicoding.javafundamental.basic.strukturdasar.kendaraan.Motor;
import com.dicoding.javafundamental.basic.strukturdasar.musik.Gitar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Gitar.bunyi();

        Mobil.jumlahBan();
        Motor.jumlahBan();
        Kereta.jumlahBan();

        Date today = new Date();
        System.out.println("Hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today, 1);
        System.out.println("Besok = " + tomorrow);

    }
}
