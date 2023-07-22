package com.DS1.THREADS;

public class Task1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a file : " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Download Complete : " + Thread.currentThread().getName());
    }

}
 