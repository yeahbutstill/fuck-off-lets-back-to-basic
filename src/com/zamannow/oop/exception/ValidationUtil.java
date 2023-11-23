package com.zamannow.oop.exception;

import com.zamannow.oop.annotation.NotBlank;
import com.zamannow.oop.data.LoginReq;

import java.lang.reflect.Field;

/**
 * Membuat Exception
 * Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method tersebut harus ditandai
 * dengan kata kunci throws diikuti dengan class exception nya. (buat ngasih tau ke orang yang akan menggunakan method tersbut, kalau method tersebut bisa menyebabkan error)
 * Jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambahkan lebih dari satu class exception
 * Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw, diikuti dengan object exception nya
 */
public class ValidationUtil {
    public static void validateChecked(LoginReq loginReq)
            throws ValidationException, NullPointerException {
        if (loginReq.username() == null) throw new NullPointerException("Username tidak boleh null");
        if (loginReq.username().isBlank())
            throw new ValidationException("Username tidak boleh ada spasi");
        if (loginReq.username().isEmpty()) throw new ValidationException("Username tidak boleh kosong");

        if (loginReq.password() == null) throw new NullPointerException("Password tidak boleh null");
        if (loginReq.password().isBlank())
            throw new ValidationException("Password tidak boleh ada spasi");
        if (loginReq.password().isEmpty()) throw new ValidationException("Password tidak boleh kosong");
    }

    public static void validateRuntime(LoginReq loginReq) {
        if (loginReq.username() == null) throw new BlankException("username tidak boleh null");
        if (loginReq.username().isEmpty()) throw new BlankException("username tidak boleh kosong");
        if (loginReq.username().isBlank()) throw new BlankException("username tidak boleh ada spasi");

        if (loginReq.password() == null) throw new BlankException("password tidak boleh null");
        if (loginReq.password().isBlank()) throw new BlankException("password tidak boleh ada spasi");
        if (loginReq.password().isEmpty()) throw new BlankException("password tidak boleh kosong");
    }

    public static void connectedDatabase(String username, String password) {
        if (username == null || password == null)
            throw new DatabaseError("Tidak bisa konek ke database");
    }

    /**
     * Reflection adalah kemampuan melihat struktur aplikasi kita dapat saat berjalan
     * Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga bisa meng-otomatiskan pekerjaan
     * Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan method getClass() ini bawaan dari Class object atau NamaClass.class
     *
     * @param object
     */
    public static void validationReflection(Object object) {
        Class<?> aClass = object.getClass(); // untuk mendapatkan classnya
        Field[] declaredField = aClass.getDeclaredFields(); // untuk mendapatkan propertiesnya
        // kalau ada annotation @NotBlank kita akan validasi, propertiesnya engga boleh blank
        for (Field field : declaredField) {
            field.setAccessible(true);
            if (field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(object);
                    if (value == null || value.isBlank()) {
                        try {
                            throw new ValidationException("Field " + field.getName() + " is Blank");
                        } catch (ValidationException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("tidak bisa mengakses properties " + e.getMessage());
                }
            }
        }
    }
}
