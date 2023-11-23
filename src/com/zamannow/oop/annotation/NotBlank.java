package com.zamannow.oop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation
 * Adalah menambahkan metadata ke kode program yang kita buat.
 * Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat library / framework.
 * Annotation sediri bisa diakses menggunakan Reflection.
 * Untuk membuat annotation, kita bisa menggunakan kata kunci @interface
 * Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value
 *
 *
 * Attribute Annotation
 * @Target memberitahu annotation bisa digunakan di mana? Class, method, field dan lain-lain
 * @Retention memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection?
 */
@Target(value = {ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface NotBlank {
}
