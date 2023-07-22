package com.DS1.THREADS;

public class Task2 implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<Integer.MAX_VALUE; i++){

            // CHECKING IF ANY INTERRUPTION REQUEST IS THERE OR NOT.
            if (Thread.currentThread().isInterrupted()){
                break;
            }
            System.out.println("Downloading byte : " + Thread.currentThread().getName());
        }
    }
}
