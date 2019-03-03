package com.himalaya.thread;

public class DaemonThread implements Runnable {

    public static void main(String[] args) {
        Thread th = new Thread(new DaemonThread());

        th.setDaemon(true);
        th.start();

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread terminated...");
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("is running....");

            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
