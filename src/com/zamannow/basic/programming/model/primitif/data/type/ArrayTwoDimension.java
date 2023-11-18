package com.zamannow.basic.programming.model.primitif.data.type;

import java.util.Arrays;
import java.util.random.RandomGenerator;

public class ArrayTwoDimension {
    public static void main(String[] args) {
        double[][] twoDimension = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                twoDimension[i][j] = RandomGenerator.getDefault().nextDouble();
                System.out.println(Arrays.deepToString(twoDimension));
            }
        }
    }
}
