package desktop.ifnu.bima.callstack;

/**
 * Call Stack adalah urutan pemanggilan method di dalam aplikasi java. Awal dari pemanggilan
 * method tentu saja adalah method main, kemudian di dalam method main tersebut pasti ada
 * kode untuk memanggil method lain dalam suatu class, kemudian method tersebut memanggil
 * lagi method yang lain dan seterusnya sehingga proses pemanggilan methodnya bertumpuktumpuk. Nah tumpukan pemanggilan method ini yang kita sebut dengan call stack.
 * <p>
 * Bayangkan call stack itu layaknya sebuah gedung bertingkat, fondasi gedung bertingkat
 * tersebut adalah method main. Setiap lantai di atasnya adalah method lain yang dipanggil oleh
 * method main dan seterusnya sampai ke atas. Uncaught exception menyebabkan sebuah
 * method keluar dari eksekusinya untuk dilanjutkan ke method berikutnya sambil berharap
 * bahwa ada kode untuk menangkap exception itu. Dalam ilustrasi gedung bertingkat, uncaught
 * exception adalah kejadian dimana sebuah lantai dalam gedung runtuh, runtuhan lantai
 * tersebut berharap ada yang menahan (menangkap) di lantai bawahnya, kalau tidak ada
 * satupun lantai yang menangkap runtuhan ini maka secara keseluruhan gedung akan kolaps, atau
 * aplikasi akan berhenti bekerja.
 * <p>
 * Bayangkan call stack itu layaknya sebuah gedung bertingkat, fondasi gedung bertingkat
 * tersebut adalah method main. Setiap lantai di atasnya adalah method lain yang dipanggil oleh
 * method main dan seterusnya sampai ke atas. Uncaught exception menyebabkan sebuah
 * method keluar dari eksekusinya untuk dilanjutkan ke method berikutnya sambil berharap
 * bahwa ada kode untuk menangkap exception itu. Dalam ilustrasi gedung bertingkat, uncaught
 * exception adalah kejadian dimana sebuah lantai dalam gedung runtuh, runtuhan lantai
 * tersebut berharap ada yang menahan (menangkap) di lantai bawahnya, kalau tidak ada
 * satupun lantai yang menangkap runtuhan ini maka secara keseluruhan gedung akan kolaps, atau
 * aplikasi akan berhenti bekerja.
 * <p>
 * Bayangkan call stack itu layaknya sebuah gedung bertingkat, fondasi gedung bertingkat
 * tersebut adalah method main. Setiap lantai di atasnya adalah method lain yang dipanggil oleh
 * method main dan seterusnya sampai ke atas. Uncaught exception menyebabkan sebuah
 * method keluar dari eksekusinya untuk dilanjutkan ke method berikutnya sambil berharap
 * bahwa ada kode untuk menangkap exception itu. Dalam ilustrasi gedung bertingkat, uncaught
 * exception adalah kejadian dimana sebuah lantai dalam gedung runtuh, runtuhan lantai
 * tersebut berharap ada yang menahan (menangkap) di lantai bawahnya, kalau tidak ada
 * satupun lantai yang menangkap runtuhan ini maka secara keseluruhan gedung akan kolaps, atau
 * aplikasi akan berhenti bekerja.
 */

/**
 * Bayangkan call stack itu layaknya sebuah gedung bertingkat, fondasi gedung bertingkat
 * tersebut adalah method main. Setiap lantai di atasnya adalah method lain yang dipanggil oleh
 * method main dan seterusnya sampai ke atas. Uncaught exception menyebabkan sebuah
 * method keluar dari eksekusinya untuk dilanjutkan ke method berikutnya sambil berharap
 * bahwa ada kode untuk menangkap exception itu. Dalam ilustrasi gedung bertingkat, uncaught
 * exception adalah kejadian dimana sebuah lantai dalam gedung runtuh, runtuhan lantai
 * tersebut berharap ada yang menahan (menangkap) di lantai bawahnya, kalau tidak ada
 * satupun lantai yang menangkap runtuhan ini maka secara keseluruhan gedung akan kolaps, atau
 * aplikasi akan berhenti bekerja.
 */

/**
 * Stack trace adalah rekaman jejak call stack ketika exception terjadi, kita bisa melihat urutan
 * pemanggilan method dari awal sampai akhir dimana exception terjadi. Dengan adanya stack trace
 * kita bisa menganalisis root cause (penyebab utama) terjadinya exception. Menemukan root cause
 * dari sebuah exception sangat penting dalam proses memperbaiki aplikasi, selama root cause
 * belum ditemukan, biasanya kita hanya bisa menebak-nebak apa yang terjadi dengan aplikasi
 * tetapi tidak bisa memastikan bagian mana yang bermasalah. Stack trace dengan gamblang akan
 * menunjukkan root cause terjadinya exception, penting sekali untuk melakukan log terhadap stack
 * trace ini agar mempercepat pencarian kesalahan dalam aplikasi.
 */

public class StackTraceRootCause {
    public static void main(String[] args) {
        StackTraceRootCause strc = new StackTraceRootCause();
        strc.methodPertama();
        System.out.println("kode ini tidak akan dieksekusi " +
                "karena program sudah keluar" +
                "ketika exception di methodKelima tidak ditangkap"
        );
    }

    public void methodPertama() {
        System.out.println("method pertama dipanggil");
        methodKedua();
    }

    public void methodKedua() {
        System.out.println("method kedua dipanggil");
        methoKetiga();
    }

    public void methoKetiga() {
        System.out.println("method ketiga dipanggil");
        methodKeempat();
    }

    public void methodKeempat() {
        System.out.println("method keempat dipanggil");
        methodKelima();
    }

    public void methodKelima() {
        System.out.println("method kelima dipanggil");
        String abc = null;
        abc.toString(); // kode ini akan menyebabkan NullPointerException
    }
}
