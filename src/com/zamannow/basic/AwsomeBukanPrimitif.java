package com.zamannow.basic;

public class AwsomeBukanPrimitif {
    private String name;
    private Long age;
    private Boolean areuOke;
    private Short iniShort;
    private Character iniChar;
    private Integer iniInt;

    public static void main(String[] args) {
        AwsomeBukanPrimitif awsomeBukanPrimitif = new AwsomeBukanPrimitif();
        awsomeBukanPrimitif.name = "hell ";
        awsomeBukanPrimitif.age = 29L;
        awsomeBukanPrimitif.areuOke = true;
        awsomeBukanPrimitif.iniShort = 1;
        awsomeBukanPrimitif.iniChar = 'C';

        System.out.println(awsomeBukanPrimitif.name.concat("DNL"));
        System.out.println(awsomeBukanPrimitif.age);
        System.out.println(awsomeBukanPrimitif.areuOke);
        System.out.println(awsomeBukanPrimitif.iniShort);
        System.out.println(awsomeBukanPrimitif.iniChar);
        System.out.println(awsomeBukanPrimitif.iniInt);
        System.out.println();

        System.out.println("Konversi Dari Tipe Primitif");
        int umur = 29;
        Integer umurObject = umur;
        System.out.println(umurObject);
        System.out.println("Balik lagi ke primitif");
        int umurLagi = umur;
        System.out.println(umurLagi);
        System.out.println();

        // konversi
        short shortAge = umurObject.shortValue();
        System.out.println(shortAge);
        byte byteAge = umurObject.byteValue();
        System.out.println(byteAge);
    }
}
