package com.DS2.Queue;

import java.util.Queue;

public class UseArrayQueue {
    public static void main(String[] args) throws Exception {
        QueueArray queue = new QueueArray();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.dequeue();

        System.out.println(queue.size());
        System.out.println(queue.capacity());
        System.out.println(queue.front());

    }
}
