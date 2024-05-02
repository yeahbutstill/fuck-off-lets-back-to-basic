package com.artivisi.training.bestpractices.serializable;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/*
Serializable adalah mengkonversi sebuah object, object itu adalah variable
yang ada di memory, misalnya kita bikin class Product, kita bikin object p1 lalu isi datanya.
nah disini sebetulnya setelah kita isi, akan tersimpan di memory.

Tapi terkadang ada kebutuhan untuk mengeluarkan object itu dari memory.
contoh kebutuhannya:
kita mau simpan ke disk,
kita mau kirim melalu network,

kita bikin applikasi web, lalu dia menyimpan session variable. Kalau kita gunakan HttpSession yang asli bukan
dari framework. Kalau kita masukin object itu ke situ nanti dia akan komplain ini harus Serializable.
Kenapa? karena session itu didesain untuk tetap ada walaupun Applikasi Servernya di Restart.
misalnya ada orang sudah ada session di Tomcat, dia menambahkan shoping cart, naro variable disitu atau sudah login
terus kita restart tomcatnya, maka setelah Tomcatnya Up lagi itu tetap ada.

gimana kerjanya tomcat mengimplementasikannya?
dia ambil semua object yang ada di HttpSession kemudian dia tulis ke disk. nah jadi cara nulisnya ini adalah
Serialized, dia serialized ke disk.

jadi waktu dia restart, dia tulis dulu ke disk, kemudian mati, setelah hidup lagi dia baca lagi dari disk,
masukin lagi ke memory. sehingga si orang ini tetap ada variablenya.
 */

// pada implements Serializable, ini sebetulnya tidak ada method apa-apa yang harus diimplement
// biasanya kalau interface kan kadang suruh implement tapi kalau ini tidak ada.
// Jadi ini cuman menyatakan bahwa, class kita ini aman untuk di Serialized.
// Nah bisanya yang aman itu class-class yang hanya value atau value object,
// jadi class yang hanya berisi data saja. Jangan gunakan Serializable di class DAO
// karena DAO memegang object Databse Connection, maka dari itu tidak bisa diserialized
//
// Faktor pertamanya, karena misalnya disini konek ke localhost di kirim kesana, dia ingin konek ke localhost
// ya sudah langsung error, karena beda cluster atau contoh lain, dia si class ini nulis ke folder local, misal C:/test
// begitu copy kesana dia akan mencoba nulis ke C:/test belum tentu ada foldernya.
// Jadi yang seperti itu tidak serializable yang punya variable databse connection, buka file.
public class Product implements Serializable {
    // jadi apa itu serialVersionUID, contoh dasarnya adalah user sudah simpen variable
    // product di dalam session kemudian restart, ternyata restartnya ini kita deploy applikasi baru
    // dan disni kita tambahkan category atau kita hapus price atau kita rename, waktu dia nyimpen data product tadi
    // kan ada field price, tapi waktu dia Deserialization atau mau balikin lagi ke memory itu data itu tidak ada.
    // maka akan error.
    // Jadi gimana supaya tomcatnya tau bahwa waktu dia mau balikin lagi dari yang di save balik lagi ke memory
    // serialversionUID lah penolong tomcat jadi bisa tau kalau versinya sudah berbeda, jadi yang lama jangan dimasukin lagi
    // ke class yang sama.
    //
    // sebenarnya baca memory itu, baca datanya, diinstankan classnya, lalu dimasukin datanya kesitu
    // 
    @Serial
    private static final long serialVersionUID = 498006567634945276L;

    // kalau yang ini dia akan dikirim apa adanya ke tempat lain
    private String code;
    private String name;

    // transient ini menyatakan bahwa ini jangan diserialized
    // jadi begitu diinstankan di tempat lain, dia akan dihitung ulang lagi
    private transient BigDecimal price;

    private Category category;

    public Product() {
    }

    public Product(String code, String name, BigDecimal price, Category category) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(code, product.code) && Objects.equals(name, product.name) && Objects.equals(price, product.price) && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, price, category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
