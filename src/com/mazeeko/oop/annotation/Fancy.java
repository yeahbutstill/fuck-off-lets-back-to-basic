package com.mazeeko.oop.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation sendiri bisa diakses menggunakan reflection
 * Untuk membuat annotation sendiri bisa menggunakan kata kunci @interface
 * Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value
 * Inti dari annotation itu sendiri adalah menambahkan informasi tambahan like meta data
 *
 * @Target Memeberitahu annotation bisa digunakan dimana? Class, Method, Field dan lain-lain
 * @Retention Memeberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Fancy {
    String name();
    String[] tags() default {}; // tidak wajib memasukan value karena mempunyai default value
}

/** Java juga sudah memiliki annotation bawaan, seperti:
 * @Override untuk menandai bahwa method yang meng-override method parent class nya
 * @Deprecated untuk menandai bahwa method tersebut sudah tidak direkomendasikan lagi untuk digunakan
 * @FunctionalInterface untuk menandai bahwa class tersebut bisa dibuat sebagai lambda expression
 *
 * dan masih banyak lagi
 */