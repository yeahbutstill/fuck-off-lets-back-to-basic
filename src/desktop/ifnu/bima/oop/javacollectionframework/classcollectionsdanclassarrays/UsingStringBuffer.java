package desktop.ifnu.bima.oop.javacollectionframework.classcollectionsdanclassarrays;

public class UsingStringBuffer {

    public static void main(String[] args) {

        String str = "Geeks";

        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.print(sbr);

    }

}
