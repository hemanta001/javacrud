package com.javacrud.multithreading.synchronizationinthreads;

public class SynchronizationExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
                //1+1
                //99+1=100
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
                //1+2=3
                //1+1=2
                //99+1=100
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final Count: " + counter.getCount());
    }
}
