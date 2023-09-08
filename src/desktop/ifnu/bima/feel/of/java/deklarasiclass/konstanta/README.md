Java mempunyai keyword const yang bisa digunakan untuk mendeklarasikan konstanta. Tetapi
dalam prakteknya, dan ini adalah praktek yang disarankan oleh Sun Microsystem, konstanta
sebaiknya dideklarasikan menggunakan gabungan keyword static dan fnal. Lebih baik lagi,
kalau konstanta diletakkan di dalam interface, karena semua property dalam interface secara
default akan bersifat public static fnal, walaupun dideklarasikan tanpa ketiga keyword
tersebut.