package com.himalaya.thread;

public class ThreadSample2 extends Thread {

    public static void main(String[] args) {
        ThreadSample2 sample2 = new ThreadSample2();
        sample2.run();
    }

    @Override
    public void run() {
        System.out.println("New flow, new thread is runninRg");
    }
}
