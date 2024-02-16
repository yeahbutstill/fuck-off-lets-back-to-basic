package com.tij4awesome.chapter1;

public class PrimitiveType {
    public static void main(String[] args) {
        // kiri primitive type, kanan wrapper type
        boolean iniBoolean = false;
        char iniChar16Bits = Character.MAX_VALUE;
        byte iniByte8Bits = Byte.MAX_VALUE;
        short iniShort16Bits = Short.MAX_VALUE;
        int iniInt32Bits = Integer.MAX_VALUE;
        long iniLong64Bits = Long.MAX_VALUE;
        float iniFloat32Bits = Float.MAX_VALUE;
        double iniDouble65Bits = Double.MAX_VALUE;
        //void iniVoid = Void.TYPE.getName();

        System.out.println(iniBoolean);
        System.out.println(iniChar16Bits);
        System.out.println(iniByte8Bits);
        System.out.println(iniShort16Bits);
        System.out.println(iniInt32Bits);
        System.out.println(iniLong64Bits);
        System.out.println(iniFloat32Bits);
        System.out.println(iniDouble65Bits);
    }
}
