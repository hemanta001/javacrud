package com.javacrud.multithreading.usingthread;

import java.util.Date;

public class ThreadExample {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        System.out.println(new Date());
        t1.start();
        System.out.println(new Date());
        t2.start();
        System.out.println(new Date());
    }
}
