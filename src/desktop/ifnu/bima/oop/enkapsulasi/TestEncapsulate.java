package desktop.ifnu.bima.oop.enkapsulasi;

import java.time.LocalDate;

public class TestEncapsulate {

    public static void main(String[] args) {

        Encapsulate obj = new Encapsulate();
        Istri objIstri = new Istri();

        obj.setName("Maya");
        obj.setRollId(1);
        obj.setAge(27);

        objIstri.setName("Maya");
        objIstri.setBirthDay(LocalDate.parse("1994-05-15"));

        System.out.println("{Name: " + obj.getName() + "}");
        System.out.println("{Roll: " + obj.getRollId() + "}");
        System.out.println("{Age: " + obj.getAge() + "}");

        System.out.println(objIstri.getName());
        System.out.println(objIstri.getBirthDay());

    }

}
