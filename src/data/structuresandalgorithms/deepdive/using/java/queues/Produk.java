package data.structuresandalgorithms.deepdive.using.java.queues;

import java.util.Objects;

public class Produk {

    private Integer id;
    private Integer quantity;
    private String name;

    public Produk(Integer id, Integer quantity, String name) {
        this.id = id;
        this.quantity = quantity;
        this.name = name;
    }

    public Produk() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produk produk = (Produk) o;

        if (!Objects.equals(id, produk.id)) return false;
        if (!Objects.equals(quantity, produk.quantity)) return false;
        return Objects.equals(name, produk.name);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Produk{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                '}';
    }
}
