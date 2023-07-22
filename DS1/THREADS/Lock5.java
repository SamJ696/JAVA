package com.DS1.THREADS;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock5 {
    private int totalBytes;
    private Lock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementBytes(){
        lock.lock();
        try {
            totalBytes++;
        }

        finally {
            lock.unlock();
        }
    }

    public synchronized void incrementSync(){
        // In synchronised argument passing this for referencing current object is bad practice.
        // Because suppose we have another field namely totalFiles.
        // And in increment file we pass this then.
        // If one thread calls the incrementByte any other thread cannot call the incrementFile.
        // Because this will refer to the same object at that time.

//        synchronized () {
//            totalBytes++;
//        }


        // Another method is specifying the method as synchronised.
        // Which is equivalent to passing this as argument in synchronised block.
        // Synchronizing is bad because then the code runs sequentially instead of concurrently.
        totalBytes++;
    }
}
