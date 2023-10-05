package com.yeahbutstill.java21.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
  public static void main(String[] args) {
    try (ExecutorService executor =
        Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())) {
      Future<?> future = executor.submit(() -> "Boom!");
      Thread.sleep(100);
      Object result =
          switch (future.state()) {
            case CANCELLED, FAILED -> throw new IllegalStateException("couldn't finish the work!");
            case SUCCESS -> future.resultNow();
            default -> null;
          };

      System.out.println(result);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
