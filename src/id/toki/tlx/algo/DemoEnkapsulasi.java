package id.toki.tlx.algo;

public class DemoEnkapsulasi {
    public static void main(String[] args) {
        // melakukan instansiasi terhadap kelas musikJPop
        MusikJPop obj = new MusikJPop("I Feel My Soul", 2008);
        obj.showData();
        obj.setJudulLagu("Separuh Aku");
        System.out.println("Judul lagu : " + obj.getJudulLagu());
    }
}
