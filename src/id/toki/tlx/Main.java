package id.toki.tlx;

import id.toki.tlx.interfaces.impl.LightImpl;

public class Main {
  public static void main(String[] args) {
    System.out.println("Halo, dunia!");
    System.out.print("*1*\n");
    System.out.print("2*3*4\n");
    System.out.print("*1*\n2*3*4\n");
    System.out.print("*1*\n2");
    System.out.print("*3*4\n");
    System.out.println("=================");

    int b1, b2, jml;
    b1 = 2000000000;
    b2 = 2000000000;
    jml = (b1 + b2) % 123;
    System.out.println(jml);

    b1 = b2;
    b2 = b1;
    System.out.println(b1 + " " + b2);

    boolean a1 = true;
    boolean b3 = false;
    boolean c1 = true;
    System.out.println((a1 || b3) && c1);
    System.out.println(a1 || (b3 && c1));
    System.out.println((a1 ^ b3) && c1);
    System.out.println((a1 ^ c1) || b3);
    System.out.println((a1 && c1) || b3);
    System.out.println("==================================== TEST");

    boolean a1x = true;
    boolean b3x = false;
    boolean c1x = true;
    boolean d1x = true;
    System.out.println(a1x && !b3x || c1x && d1x);
    System.out.println((a1x || !b3x) && c1x || !d1x);
    System.out.println(a1x || b3x && !c1x && d1x);
    System.out.println(a1x && d1x || !c1x || a1x && b3x);
    System.out.println("=====================================");

    long pembilangan1, penyebut1, pembilang2, penyebut2;
    pembilangan1 = 999L;
    penyebut1 = 999L;
    pembilang2 = 999L;
    penyebut2 = 999L;

    System.out.println("=================COBA===================");
    System.out.println((pembilangan1 / penyebut1) == (pembilang2 / penyebut2));
    System.out.println((pembilangan1 % penyebut1) == (pembilang2 % penyebut2));
    System.out.println(pembilangan1 * penyebut2 == pembilang2 * penyebut1);
    System.out.println(pembilangan1 * pembilang2 == penyebut1 * penyebut2);
    System.out.println("==============================");

    int bb1, bb2;
    bb1 = 1;
    bb2 = 3;

    bb1 = bb2;
    bb2 = bb1;
    System.out.println((bb1) + " " + (bb2));
    System.out.println("==========================================");

    short a = (short) 250;
    System.out.println(a);
    a = (byte) (a + 10);
    System.out.println(a);
    System.out.println("=================================================");

    int aaa, bbb, ccc, eee, fff, ggg;
    aaa = 10;
    bbb = 10;
    ccc = 10;
    eee = 10;
    fff = 10;
    ggg = 10;

    double ddd;
    ddd = 10.10;
    System.out.println(((aaa + bbb) % ccc) * ddd / eee * (fff / ggg));
    System.out.println("==========================================");

    LightImpl lt = new LightImpl();
    System.out.println(lt.on());
  }
}
