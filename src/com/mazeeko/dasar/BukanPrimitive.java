package com.mazeeko.dasar;
public class BukanPrimitive {
    public static void main(String[] args){
        Integer iniInteger = 10;
        Long iniLong = 10L;
        Boolean iniBoolean = true;
        Character iniCharacter = 'A';
        String iniString = "A";
        Double iniDouble = 1.5;
        Float iniFloat = 1.5F;

        // konversi dari primitive ke non-primitive
        int iniInteger2 = 100; // primitive
        Integer iniInteger3 = iniInteger2; // non-primitive
        System.out.println(iniInteger3);

        // konversi dari non-primitive ke primitive
        Integer iniInteger4 = 100; // non-primitive
        int iniInteger5 = iniInteger4; // primitive
        System.out.println(iniInteger5);

        // konversi dari non-primitive ke non-primitive tapi bukan value yang compatible
        Byte shortAge = 30;
        Short byteAge = Short.valueOf(shortAge);
        System.out.println(byteAge);

        // konversi dari primitive ke primitive tapi bukan value yang compatible
        int age = 30;
        Integer ageObject = age;
        int ageAgain = ageObject;

        // panggil methodnya dengan  titik(.)
        short shortAge2 = ageObject.shortValue();
        byte byteAge2 = ageObject.byteValue();

        System.out.println(ageAgain);
        System.out.println(shortAge2);
        System.out.println(byteAge2);

    }
}
