package com.himalaya.thread;

public class Mythread implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("is running..");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
