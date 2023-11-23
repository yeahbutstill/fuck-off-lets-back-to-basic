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
@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface Fancy {
    String name();

    String[] tags() default {};
}

/**
 * Predefined Annotation
 * Java juga sudah memiliki annotation bawaan, seperti:
 * @Override untuk menandai bahwa method yang meng-override method parent class nya
 * @Deprecated untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan
 * @FunctionalInterface untuk menandai bahawa class tersebut bisa dibuat sebagai lambda expression
 * dan lain-lain
 */