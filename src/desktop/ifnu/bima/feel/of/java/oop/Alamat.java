package desktop.ifnu.bima.feel.of.java.oop;

import java.util.UUID;

public class Alamat {
    private UUID id;
    private String jalan;
    private String rt;
    private String rw;
    private String kab;
    private String kec;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRw() {
        return rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    public String getKab() {
        return kab;
    }

    public void setKab(String kab) {
        this.kab = kab;
    }

    public String getKec() {
        return kec;
    }

    public void setKec(String kec) {
        this.kec = kec;
    }

    @Override
    public String toString() {
        return "Alamat{" +
                "id=" + id +
                ", jalan='" + jalan + '\'' +
                ", rt='" + rt + '\'' +
                ", rw='" + rw + '\'' +
                ", kab='" + kab + '\'' +
                ", kec='" + kec + '\'' +
                '}';
    }
}
