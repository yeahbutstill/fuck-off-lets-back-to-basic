package com.tij4awesome.chapter1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicCounter {
    private AtomicLong count = new AtomicLong(0);

    public static void main(String[] args) {
        AtomicCounter atomicCounter = new AtomicCounter();
        ExecutorService fixThreadPool = Executors.newFixedThreadPool(10);

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                atomicCounter.increment();
            }
        };
        for (int i = 0; i <= 5; i++) {
            fixThreadPool.submit(runnable);
        }

        System.out.println(atomicCounter.getCounter());
        fixThreadPool.shutdown();
        fixThreadPool.close();
    }

    public void increment() {
        count.incrementAndGet();
    }

    public Long getCounter() {
        return count.get();
    }
}
