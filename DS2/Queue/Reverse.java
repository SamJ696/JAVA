package com.DS2.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Reverse {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Take Input and pass it.

        reverseQueue(queue);
    }

    private static void reverseQueue(Queue<Integer> queue) {
        if (queue.size() <= 1){
            return;
        }

        int front = queue.poll();
        reverseQueue(queue);
        queue.add(front);
    }
}
