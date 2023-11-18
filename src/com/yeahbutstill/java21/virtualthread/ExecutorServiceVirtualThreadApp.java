package com.yeahbutstill.java21.virtualthread;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExecutorServiceVirtualThreadApp {
    private static final Logger logger =
            Logger.getLogger(ExecutorServiceVirtualThreadApp.class.getName());

    public static void main(String[] args) {
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                executorService.execute(
                        () -> {
                            try {
                                Thread.sleep(Duration.ofSeconds(2));
                                logger.log(Level.INFO, "Boom {0}", Thread.currentThread() + "!");
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        });
            }
        }

        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
