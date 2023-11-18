package com.yeahbutstill.java21.virtualthread;

import java.io.IOException;
import java.time.Duration;

public class VirtualThreadApp {
    public static void main(String[] args) {
        // by default kalau virtual thread itu deamon true
        for (int i = 0; i < 10_000; i++) {
            Thread unstarted =
                    Thread.ofVirtual()
                            .name("duke-" + i)
                            .unstarted(
                                    () -> {
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

        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
