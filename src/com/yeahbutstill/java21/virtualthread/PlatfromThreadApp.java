package com.yeahbutstill.java21.virtualthread;

import java.time.Duration;

public class PlatfromThreadApp {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // Thread.ofPlatform itu thread biasa, dia akan dijalankan di dalam sistem operasi dibuatkan per 1 threadnya
            Thread unstarted = Thread.ofPlatform().name("duke" + i).daemon(false).unstarted(() -> {
                try {
                    Thread.sleep(Duration.ofSeconds(2));
                    System.out.println("Boom " + Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            });

            unstarted.start();
        }
    }
}
