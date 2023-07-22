package com.DS2.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseK {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        Queue<Integer> queue2 = reverseK(queue, 4);

        while (!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }
    }

    private static Queue<Integer> reverseK(Queue<Integer> queue, int k) {
        if (queue.size() == 0 || k > queue.size()){
            return queue;
        }

        if (k <= 0){
            return queue;
        }

        Stack<Integer> st = new Stack<>();
        for (int i=0; i<k; i++){
            st.push(queue.poll());
        }

        while (!st.empty()){
            queue.add(st.pop());
        }

        for (int i = 0; i < queue.size() - k; i++){
            queue.add(queue.poll());
        }

        return queue;
    }
}
