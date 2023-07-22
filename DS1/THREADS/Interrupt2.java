package com.DS1.THREADS;

public class Interrupt2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Task2());

        Thread.sleep(1000);

        // This is used to send interruption request.
        // If the interruption is handled in the process then it will get interrupted.
        // Otherwise, it will continue running even after calling interrupt method.
        thread.interrupt();

        // Here as interrupt request is send and in the task2 it is handled.
        // So after 1 second the thread will get stop.


        // If a thread is sleeping, and we send an interrupt request.
        // Then Interrupted Exception occurs.

        System.out.println("Completed Successfully.");
    }
}
