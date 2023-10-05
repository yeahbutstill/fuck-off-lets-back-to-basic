package id.alta.coursesintroductionto.javaspringboot.percabangan;

public class Main {
  public static void main(String[] args) {

    // if then
    String userAccess = "admin";
    if (userAccess.equals("admin")) {
      Object tokenAdmin = new Object();
      Object token = tokenAdmin;
      System.out.println(token);
    }

    // if then else
    Object token;
    if (userAccess.equals("admin")) {
      Object tokenAdmin = new Object();
      token = tokenAdmin;
      System.out.println(token);
    } else if (userAccess.equals("sellerRony")) {
      Object tokenSellerRony = new Object();
      token = tokenSellerRony;
      System.out.println(token);
    } else if (userAccess.equals("sallesAgent")) {
      Object tokenSallesAgent = new Object();
      token = tokenSallesAgent;
      System.out.println(token);
    } else {
      token = "defaultToken";
      System.out.println(token);
    }

    // switch case
    switch (userAccess) {
      case "admin":
        Object tokenAdmin = new Object();
        token = tokenAdmin;
        break;
      case "sallerRony":
        Object tokenSellerRony = new Object();
        token = tokenSellerRony;
        break;
      case "sallesAgent":
        Object tokenSallesAgent = new Object();
        token = tokenSallesAgent;
        break;
      default:
        break;
    }
  }
}
