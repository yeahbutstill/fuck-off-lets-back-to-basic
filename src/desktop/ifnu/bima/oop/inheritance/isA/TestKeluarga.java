package desktop.ifnu.bima.oop.inheritance.isA;

public class TestKeluarga {

    public static void main(String[] args) {
        TasikMalaya keluargaTasik = new TasikMalaya();
        keluargaTasik.setKake("a");
        keluargaTasik.setNenek("b");
        keluargaTasik.setUwa("c");
        keluargaTasik.setBibi("d");
        keluargaTasik.setMamang("e");

        System.out.println("keluarga tasik: " +
                keluargaTasik.getKake() +
                keluargaTasik.getNenek() +
                keluargaTasik.getBibi() +
                keluargaTasik.getUwa() +
                keluargaTasik.getMamang()
        );
    }

}
