package com.himalaya.thread;

public class ThreadSample3 implements Runnable {

    public static void main(String[] args) {

        Runnable r = new ThreadSample3();
        Thread t = new Thread(r);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("New flow, new thread is running.");
    }
}
