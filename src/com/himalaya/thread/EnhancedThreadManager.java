package com.himalaya.thread;

import java.util.LinkedList;

public class EnhancedThreadManager {

    public static void main(String[] args) {
        EnhancedResourceQueue queue = new EnhancedResourceQueue();
        Thread producer = new Thread(new EnhancedProducer(queue), "producer");
        Thread consumer1 = new Thread(new EnhancedConsumer(queue), "consumer1");
        Thread consumer2 = new Thread(new EnhancedConsumer(queue), "consumer2");

        producer.start();
        consumer1.start();
        consumer2.start();
    }


    static class EnhancedProducer implements Runnable {

        private EnhancedResourceQueue queue;

        public EnhancedProducer(EnhancedResourceQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10 && !Thread.interrupted(); i++) {
                queue.put((Object) i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

    static class EnhancedConsumer implements Runnable {

        private EnhancedResourceQueue queue;

        public EnhancedConsumer(EnhancedResourceQueue queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            while (!Thread.interrupted()) {
                try {
                    Integer res = (Integer) queue.pop();
                    if (res != null) {
                        System.out.println(Thread.currentThread().getName() + " pop : " + res);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

    static class EnhancedResourceQueue<T> {
        private LinkedList<T> jobs = new LinkedList<>();

        public synchronized void clear() {
            jobs.clear();
        }

        public synchronized Object pop() throws InterruptedException {
            T t = null;
            if (jobs.isEmpty()) {
                this.wait();
            }
            t = jobs.removeFirst();

            return t;
        }

        public synchronized void put(T t) {

            jobs.addLast(t);
            this.notify();
        }
    }

}
