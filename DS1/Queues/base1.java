package com.DS1.Queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class base1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        // Removes the first element.
        var front = queue.remove();

        System.out.println("First Element Removed :- " + front);

        System.out.println("Printing Queue :- " + queue);

        System.out.println("Reversed Queue :- " + reverse(queue));
    }

    public static Queue reverse(Queue<Integer> queue){
        Stack<Integer> ans = new Stack<>();

        while (!queue.isEmpty()){
            ans.push(queue.remove());
        }

        while (!ans.isEmpty()){
            queue.add(ans.pop());
        }

        return queue;
    }
}
