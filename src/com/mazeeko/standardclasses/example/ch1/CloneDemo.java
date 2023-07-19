package com.mazeeko.standardclasses.example.ch1;

import java.util.Arrays;
import java.util.Random;

/**
 * R-1.2 Misalkan kita membuat array A dari objek GameEntry, yang memiliki bidang skor bilangan bulat, dan kita mengkloning A dan
 * menyimpan hasilnya dalam array B. Jika kemudian kita segera menetapkan A[4].score sama dengan 500, berapakah nilai skor dari
 * Objek GameEntry direferensikan oleh B[4]?
 */
public class CloneDemo {
    public static void main(String[] args) {
        GameEntry[] a = new GameEntry[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new GameEntry(new Random().nextInt(500) + 1);
        }

        GameEntry[] b = a.clone();
        System.out.println("A contents below");
        printScores(a);
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println("B contents below");
        printScores(b);
        System.out.println("===========================");
        System.out.println("Set A[4] to 550");
        a[4].setScore(550);
        System.out.println("print B[4]");
        System.out.println(b[4].getScore());
        System.out.println(a.equals(b)); // false
        System.out.println(Arrays.equals(a, b)); // true
        System.out.println(a[4].equals(b[4])); // true

    }

    private static void printScores(GameEntry[] a) {
        for (GameEntry gameEntry : a) {
            System.out.println(gameEntry.getScore() + " ");
        }
    }
}

class GameEntry {
    private Integer score;

    public GameEntry(Integer score) {
        this.score = score;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}