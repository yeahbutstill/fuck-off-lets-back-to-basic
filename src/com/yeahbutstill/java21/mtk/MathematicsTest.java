package com.yeahbutstill.java21.mtk;

import java.math.BigInteger;

public class MathematicsTest {
  public static void main(String[] args) {
    // multiplication
    BigInteger start = BigInteger.valueOf(10);
    BigInteger result = start.parallelMultiply(BigInteger.TWO);
    System.out.println(BigInteger.valueOf(10 * 2).equals(result));
    System.out.println();

    // divisions
    int five = Math.divideExact(10, 2);
    System.out.println(five == 5);
  }
}
