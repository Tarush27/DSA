package com.company.aic;

public class MyThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("child thread is running"));
        t.start();
        System.out.println("Parent thread");
        Runnable r = () -> System.out.println("child thread");
        Thread t1 = new Thread(r);
        t1.start();
        System.out.println("Main thread");
        Thread t2 = new Thread(() -> {
            System.out.println("home thread");
        });
        t2.start();
        System.out.println("Mains thread");
    }
}
