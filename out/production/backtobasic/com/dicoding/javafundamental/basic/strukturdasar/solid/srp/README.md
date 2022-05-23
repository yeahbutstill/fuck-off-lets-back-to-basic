Contohnya jika ingin mendapatkan history dari order, kita hanya perlu memanggil class OrderHistory. Sehingga, kita bisa
mendapatkan daily atau monthly history. Sedangkan jika kita hanya membutuhkan viewer dari class Order, cukup panggil
class OrderViewer yang di dalamnya terdapat function printOrder() dan showOrder().

Sehingga, class Order itu sendiri hanya memiliki tanggung jawab untuk modifikasi item, yang diwakilkan pada:

- function addItem() untuk menambahkan item;
- function deleteItem() untuk menghapus item;
- function getItems() untuk mendapatkan seluruh items yang telah ditambahkan;
- function getItemCount() untuk mendapatkan jumlah item; dan
- function calculateTotalSum() untuk perhitungan penjumlahan total item.

Jika kita ingin membuat class order dan memanggil fungsi yang sudah dipisahkan, maka contoh kode programnya terlihat
seperti di bawah ini:

```java
class Main {
    public static void main(String[] args) {
        Item item = new Item();
        Order order = new Order();
        order.addItem(item);
        OrderHistory history = new OrderHistory();
        history.getDailyHistory();
        OrderViewer viewer = new OrderViewer();
        viewer.printOrder(order);
    }
}
```