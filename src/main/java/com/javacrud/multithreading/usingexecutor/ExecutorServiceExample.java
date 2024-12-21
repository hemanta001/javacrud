package com.javacrud.multithreading.usingexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        //CPU CoRE 8
        ExecutorService smallExecutor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 1000; i++) {
            smallExecutor.execute(new MyTask("Task " + i));
        }
        smallExecutor.shutdown();
    }
}
