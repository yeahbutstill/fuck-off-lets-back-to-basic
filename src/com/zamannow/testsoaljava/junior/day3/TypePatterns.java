package com.zamannow.testsoaljava.junior.day3;

import com.zamannow.basic.programming.model.primitif.data.type.Array;

import java.io.*;
import java.util.Arrays;

public class TypePatterns {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        run(bytes, bytes);
        bytes = new ByteArrayOutputStream();
        run(new DataOutputStream(bytes), bytes);
        bytes = new ByteArrayOutputStream();
        run(new ObjectOutputStream(bytes), bytes);
        run(System.out, null);
    }

    private static void run(OutputStream out, ByteArrayOutputStream bytes) throws IOException {
        System.out.printf("%n=== %s ===%n", out.getClass().getName());
        String str = "Yo dawg\n";

        // A switch statement with no fall through, type patterns
//        switch (out) {
//            case ByteArrayOutputStream bout -> bout.writeBytes(str.getBytes());
//            case DataOutputStream dout -> dout.writeUTF(str);
//            case ObjectOutputStream oout -> oout.writeObject(str);
//            case OutputStream __ -> out.write(str.getBytes());
//        };

        // Guards
        switch (out) {
            case ByteArrayOutputStream bout -> bout.writeBytes(str.getBytes());
            case DataOutputStream dout -> dout.writeUTF(str);
            case ObjectOutputStream oout when str.length() > 0 -> oout.writeObject(str);
            default -> out.write(str.getBytes());
        }

        if (bytes != null) {
            bytes.close();
            System.out.println(Arrays.toString(bytes.toByteArray()));
        }
    }
}
