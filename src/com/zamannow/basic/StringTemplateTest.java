package com.zamannow.basic;

//import com.sun.net.httpserver.HttpServer;

//import java.net.http.HttpClient;
//import java.net.http.HttpResponse;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

//import static java.lang.StringTemplate.STR;

//public class StringTemplateTest {
//  public static void main(String[] args) {
//    int a = 10;
//    int b = 10;
//    var interpolated1 = STR."\{a} times \{b} = \{a + b}";
//    System.out.println(interpolated1);
//    var interpolated2 = STR."\{a} times \{b} = \{Math.multiplyExact(a, b)}";
//    System.out.println(interpolated2);
//
//    String dateMessage = STR."Today's date: \{
//            LocalDateTime.now().format(
//                    // bisa juga pake di ISO_DATE
//                    DateTimeFormatter.ofPattern("yyyy-MM-dd")
//            )}";
//    System.out.println(dateMessage);
//
//    int httpStatus = 404;
//    String errorMessage = "Kage ada bos";
//    String json = STR."""
//    {
//      "httpStatus": \{httpStatus},
//      "errorMessage: "\{errorMessage}"
//    }
//    """;
//    System.out.println(json);
//  }
//}
