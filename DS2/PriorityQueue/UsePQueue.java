package com.DS2.PriorityQueue;

public class UsePQueue {
    public static void main(String[] args) throws Exception {
        PQueue<String> pq = new PQueue<>();
        pq.insert("Hello", 50);
        pq.insert("Random", 25);
        pq.insert("Sam", 100);
        pq.insert("World", 75);
        pq.insert("Check", 0);

        while (!pq.isEmpty()){
            System.out.println(pq.getMin());
            pq.removeMin();
        }
    }
}
