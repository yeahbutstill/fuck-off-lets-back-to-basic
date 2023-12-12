package com.zamannow.testsoaljava.junior.day3;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.util.Arrays;

public class TypePatterns1 {
    public static StringBuilder print(Node node, int indent) {
        var result = new StringBuilder();
        switch (node) {
            case Text t when !t.getData().isBlank() ->
                    result.append(" ".repeat(indent))
                            .append(t.getData())
                            .append("\n");
            case Element e -> {
                result.append(" ".repeat(indent))
                        .append("<")
                        .append(e.getTagName())
                        .append(">\n");
                var children = e.getChildNodes();
                for (int i = 0; i < children.getLength(); i++)
                    result.append(print(children.item(i), indent + 2));
                result.append(" ".repeat(indent))
                        .append("</")
                        .append(e.getTagName())
                        .append(">\n");
            }
            default -> {}
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        var xml = "<div>Hello, <em>World</em></div>";
        var doc = DocumentBuilderFactory
                .newInstance()
                .newDocumentBuilder()
                .parse(new InputSource(new StringReader(xml)))
                .getDocumentElement();
        System.out.println(print(doc, 0));
    }
}
