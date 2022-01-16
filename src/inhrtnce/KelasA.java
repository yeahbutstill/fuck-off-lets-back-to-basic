package inhrtnce;

import cls.Segitiga;

public class KelasA extends Segitiga {
    private String atributA;

    public KelasA(int panjang, int tinggi, int lebar) {
        super(panjang, tinggi, lebar);
    }

    public static void main(String[] args) {
        KelasB kelasB = new KelasB(10, 20, 30);
        kelasB.getAtributA();
        kelasB.getAtributB();
        System.out.println(kelasB.getAtributA());
        System.out.println(kelasB.getAtributB());

        KelasA kelasA = new KelasA(10, 20, 30);
        int volume = kelasA.volume(10, 20, 30);
        System.out.println(volume);
    }

    public int getAtributA() {
        return getPanjang();
    }

    public void setAtributA(String atributA) {
        this.atributA = atributA;
    }
}

class KelasB extends KelasA {
    private String atributB;

    public KelasB(int panjang, int tinggi, int lebar) {
        super(panjang, tinggi, lebar);
    }

    public int getAtributB() {
        return getPanjang();
    }

    public void setAtributB(String atributB) {
        this.setAtributA(atributB);
    }
}
