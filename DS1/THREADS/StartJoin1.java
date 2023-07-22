package com.DS1.THREADS;

public class StartJoin1 {
    public static void main(String[] args) throws InterruptedException {

        // Returns the current thread name.
        System.out.println(Thread.currentThread().getName());

        // Creating a new thread to perform a specific task.
        Thread thread = new Thread(new Task1());
        thread.start();

        // Join the current thread with the download thread.
        // Make current thread wait for completion of thread assigned for download.
        // Once this method returns then the below statement will be executed.
        // If a thread is joined with any other thread then till waiting is completed.
        // It won't respond to any other events.
        thread.join();

        System.out.println("File is ready to be Scanned.");

//        for (int i=0; i<10; i++){
//            Thread thread = new Thread(new DownloadTask());
//            thread.start();
//        }

        // For total threads running.
        // System.out.println(Thread.activeCount());

        // For total number of available threads.
        // System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
