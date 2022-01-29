package java.desktop.ifnu.bima.exception;

import java.io.IOException;

public class ExceptionKonsep {
    public static void main(String[] args) {
        try {
            // di sini adalah baris yang dilindungi oleh try
            // letakan kode yang potensial mengalami exception di sini
        } catch (ClassException variableException) {
            // kalau terjadi exception lakukan sesuatu
            // setidaknya lakukan logging
            // block catch yang kosong bisa dikategorikan sebagai kode konyol dan mengerikan
            // pastikan ada kode untuk memberi keterangan tentang exception apa yang terjadi
        } catch (ExceptionLain variableException) {
            //idem
        }

        // perempamaan, misalnya kita ingin membaca file dari hardisk, kira-kira structor code nya akan
        // seperti ini
        try {
            // bukaFileDariHardisk
            // bacaFileBarisPerbaris
            // tampilkanIsiFileKeConsole
        } catch (IOException e) {
            // tampilkanErrorDiLogDanConsole
        }


        // melepaskan resource, membersihkan variable yang sudah tidak dipake lagi
        try {
            // kode yang ada exception
        } catch (ExceptionPertama e) {
            // handle exception dengan tipe ExceptionPertama
        } catch (ExceptionKedua e) {
            // handle exception dengan tipe ExceptionKedua
        } finally {
            // bersihkan resource yang dipakai, baik terjadi exception ataupun tidak
        }

        
    }
}
