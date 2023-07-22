package com.DS1.Queues.ByArray;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("Removed Element :- " + queue.dequeue());


        System.out.println("Printed Queue :- " + queue);
    }
}
