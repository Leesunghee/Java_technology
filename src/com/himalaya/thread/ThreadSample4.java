package com.himalaya.thread;

public class ThreadSample4 {

    public static void main(String[] args) {

        Thread t = new Thread(new Mythread());
        t.start();
        System.out.println("MainThread terminated");
    }
}

