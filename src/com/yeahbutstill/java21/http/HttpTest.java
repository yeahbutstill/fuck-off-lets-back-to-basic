package com.yeahbutstill.java21.http;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpTest {
    @Test
    void http() throws IOException, InterruptedException {
        try (HttpClient httpClient = HttpClient.newHttpClient()) {
            HttpRequest httpRequest =
                    HttpRequest.newBuilder(URI.create("https://openjdk.org/jeps/409")).GET().build();
            HttpResponse<String> response =
                    httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            Assertions.assertEquals(response.statusCode(), 200);
            System.out.println(response.body());
        }
    }
}
