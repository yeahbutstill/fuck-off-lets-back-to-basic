package com.zamannow.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestTwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Soulution soulution = new Soulution();
        System.out.println(Arrays.toString(soulution.twoSum(nums, target)));
    }

    /**
     * Pendekatan 3: Tabel Hash Sekali Jalan
     * <p>
     * Algoritma
     * Ternyata kita bisa melakukannya dalam sekali jalan.
     * Saat kami mengulangi dan memasukkan elemen ke dalam tabel hash,
     * kami juga melihat kembali untuk memeriksa apakah pelengkap elemen saat ini sudah ada di tabel hash.
     * Jika ada, kami telah menemukan solusi dan segera mengembalikan indeks.
     * <p>
     * Analisis Kompleksitas
     * Kompleksitas waktu: O(n).
     * Kami melintasi daftar yang berisi elemen n hanya sekali.
     * Setiap pencarian di tabel hanya memerlukan waktu O(1).
     * <p>
     * Kompleksitas ruang: O(n).
     * Ruang tambahan yang dibutuhkan bergantung pada jumlah item yang disimpan dalam tabel hash,
     * yang menyimpan paling banyak elemen n.
     */
    static class Soulution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> prevMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if (prevMap.containsKey(diff)) {
                    return new int[]{
                            prevMap.get(diff), i
                    };
                }
                prevMap.put(nums[i], i);
            }
            return null;
        }
    }
}
