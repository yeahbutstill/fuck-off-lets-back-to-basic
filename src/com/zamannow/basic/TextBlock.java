package com.zamannow.basic;

public class TextBlock {
    public static void main(String[] args) {
        var html =
                """
                               <!DOCTYPE html>
                               <html>
                                <head>
                                  <title>Page Title</title>
                                </head>
                                <body>
                                  <h1>This is a Heading</h1>
                                  <p>This is a paragraph.</p>
                                </body>
                                </html>
                        """;
        System.out.println(html);
    }
}
