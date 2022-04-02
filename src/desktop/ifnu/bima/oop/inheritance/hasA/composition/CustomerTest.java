package desktop.ifnu.bima.oop.inheritance.hasA.composition;

public class CustomerTest {
    public static void main(String[] args) {
        MemberCustomer member = new MemberCustomer();
        member.setId(100L);
        System.out.println("id customer : " + member.getId());
    }
}

/**
 * Terlihat bahwa tidak ada error dalam proses kompilasi, padahal class MemberCustomer tidak
 * mendefnisikan apapun, tetapi method setId dan getId dapat digunakan. Hal ini dikarenakan
 * MemberCustomer mengextends Customer, sehingga method setId dan getId diturunkan. Catat juga bahwa
 * property id sendiri tidak diturunkan ke dalam MemberCustomer, karena property id menggunakan
 * private sebagai access modifer.
 */
