Constructor adalah method yang spesial, karena mempunyai aturan-aturan sebagai berikut:
- mempunyai nama yang sama persis dengan nama class
- tidak mempunyai tipe return
- digunakan untuk menginstansiasi object
- hanya mempunyai access modifer, tidak ada keyword lain yang diletakkan sebelum nama
method pada deklarasi constructor.

Seperti halnya method pada umumnya, constructor bisa mempunyai parameter serta
melempar (throws) exception. Constructor yang tidak mempunyai parameter disebut dengan
default constructor. Setiap class pasti mempunyai setidaknya satu constructor, kalau dalam
deklarasi class tidak ada constructor sama sekali, Java secara default akan mempunyai default
constructor ini. Kalau ada satu saja constructor dengan parameter, maka default constructor
tidak akan dibuat, kalau masih mau ada default constructor maka harus dideklarasikan secaraeksplisit