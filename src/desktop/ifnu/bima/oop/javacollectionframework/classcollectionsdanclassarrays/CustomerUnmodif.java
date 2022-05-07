package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CustomerUnmodif {

    private Long id;
    private List<String> emails;

    public CustomerUnmodif() {
    }

    public CustomerUnmodif(Long id, List<String> emails) {
        this.id = id;
        this.emails = emails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * read only dari emails
     * Dengan begitu, emails hanya bisa dimodifkasi dari dalam
     * class Customer dengan memanggil method addEmai
     */
    public List<String> getEmails() {
        return Collections.unmodifiableList(emails);
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public void addEmail(String email) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        emails.add(email);
    }

    public int compareTo(CustomerUnmodif c) {
        return getId().compareTo(c.getId());
    }

    /**
     * Method equals digunakan untuk menentukan apakah dua buah array isinya sama persis atau
     * tidak, method ini sangat praktis digunakan daripada melakukan iterasi satu per satu isi dari array
     * dan membandingkanya dengan isi array lain.
     * Method toString bisa digunakan untuk membuat sebuah string representasi dari array, string ini
     * sudah diformat sekian rupa sehingga kalau diprint di dalam console akan terlihat bagus. Tanpa
     * menggunakan method toString ini biasanya kita melakukan iterasi untuk mencetak satu persatu
     * isi dari array, dengan adanya method ini tidak perlu lagi melakukan iterasi hanya untuk
     * menampilkan array ke dalam console.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerUnmodif that = (CustomerUnmodif) o;
        return Objects.equals(id, that.id) && Objects.equals(emails, that.emails);
    }

    @Override
    public String toString() {
        return "CustomerUnmodif{" +
                "id=" + id +
                ", emails=" + emails +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emails);
    }
}
