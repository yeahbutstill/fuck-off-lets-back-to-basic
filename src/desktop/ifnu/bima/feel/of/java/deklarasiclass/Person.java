package desktop.ifnu.bima.feel.of.java.deklarasiclass;

public class Person {
    private Long id;
    private String nama;

    public Person() {}

    public Person(Long id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
