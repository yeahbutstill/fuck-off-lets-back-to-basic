package com.devoxxx.recordclass;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FuckItRecordAndIO {
  record RangeRecordBae(int begin, int end) implements Serializable {
    RangeRecordBae {
      if (end < begin) throw new IllegalArgumentException("End must be greater than begin");
    }
  }

  static class RangeClassDamnOld implements Serializable {
    private final int begin;
    private final int end;

    public RangeClassDamnOld(int begin, int end) {
      if (end < begin) throw new IllegalArgumentException("End must be greater than begin");
      this.begin = begin;
      this.end = end;
      System.out.println("Running old man class constructor");
    }

    public int getBegin() {
      return begin;
    }

    public int getEnd() {
      return end;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof RangeClassDamnOld that)) return false;

      if (begin != that.begin) return false;
      return end == that.end;
    }

    @Override
    public int hashCode() {
      int result = begin;
      result = 31 * result + end;
      return result;
    }

    @Override
    public String toString() {
      return "RangeClassDamnOld{" + "begin=" + begin + ", end=" + end + '}';
    }
  }

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    //    var range = new RangeRecordBae(10, 0);
    //    System.out.println("range = " + range);

    var path = Path.of("com/devoxxx/recordclass/test.txt");
    //    var fos = Files.newOutputStream(path.getFileName());
    //    var oos = new ObjectOutputStream(fos);
    //    oos.writeObject(range);

    var is = Files.newInputStream(path.getFileName());
    var ois = new ObjectInputStream(is);
    System.out.println("go fuck reading range");
    var rRange = ois.readObject();
    System.out.println("r/Range = " + rRange);
  }
}
