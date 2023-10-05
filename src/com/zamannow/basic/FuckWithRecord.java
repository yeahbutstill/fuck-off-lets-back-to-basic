package com.zamannow.basic;

import java.util.Iterator;

public class FuckWithRecord {
  /*
  - engga ada setter
  - ini final class A.K.A broken home... engga bisa di extends
  - properties nya juga final
  - instance properties engga bisa dibawah tekanan
  - constructor nya engga bisa no parameter
  */
  record Range(int awal, int akhir) implements Iterable<Integer> {
    // bikin constructor ada hukumnya
    // - aman untuk di copy
    // - validasi pastinya
    Range {
      if (akhir < awal) {
        throw new IllegalStateException("yakali akhirnya lebih gede");
      }
    }

    // kalau kamu suka acid
    Range(int end) {
      this(0, end);
    }

    @Override
    public Iterator<Integer> iterator() {
      return new Iterator<Integer>() {
        int indx = awal;

        @Override
        public boolean hasNext() {
          return indx < akhir;
        }

        @Override
        public Integer next() {
          return indx++;
        }
      };
    }
  }

  public static void main(String[] args) {
    var range = new Range(0, 5);
    System.out.println("range = " + range);
    System.out.println("awal = " + range.awal());
    System.out.println("akhir = " + range.akhir());

    for (Integer value : range) {
      System.out.println("value = " + value);
    }
  }
}
