package com.DS2.Queue;

public class UseLinkedQueue {
    public static void main(String[] args) throws Exception {
        QueueLinked<Integer> queue1 = new QueueLinked<>();

        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        queue1.enqueue(40);
        queue1.enqueue(50);

        System.out.println(queue1.size());
        queue1.dequeue();

        System.out.println(queue1.isEmpty());
        System.out.println(queue1.front());
    }
}
