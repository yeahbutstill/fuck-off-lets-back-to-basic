String adalah class yang bersifat immutable, artinya sekali diset nilainya maka tidak bisa lagi
diubah. String yang bersifat immutable juga berarti bahwa kalau kita melakukan modifkasi
terhadap object String, pada dasarnya hasil modifkasi ini adalah object baru. Hal ini yang
membuat String ini menjadi tidak efsien digunakan pada saat diperlukan manipulasi String
dalam skala yang cukup besar. Mari kita lihat contoh kode yang menunjukkan class String
immutable :