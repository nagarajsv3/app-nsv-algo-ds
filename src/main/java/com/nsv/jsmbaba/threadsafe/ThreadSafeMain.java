package com.nsv.jsmbaba.threadsafe;

public class ThreadSafeMain {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        //Single Thread accessing the variable
        for(int i=0; i<200000 ; i++){
            counter.increment();
        }

        System.out.println(counter.count);

        //Lets introduce multiple threads
        Counter sharedCounter = new Counter();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100000 ; i++){
                    try {
                        sharedCounter.increment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<100000 ; i++){
                    try {
                        sharedCounter.increment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(sharedCounter.count);

    }
}
