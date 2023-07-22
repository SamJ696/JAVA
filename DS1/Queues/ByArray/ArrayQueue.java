package com.DS1.Queues.ByArray;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items = new int[5];
    private int rear;
    private int front;
    private int count;


    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    public void enqueue (int item){
        if (count == items.length){
            throw new IllegalStateException();
        }

        items[rear++] = item;
        count++;
    }

    public int dequeue(){
        if (count == 0){
            throw new IllegalStateException();
        }

        var item = items[front];
        items[front] = 0;
        front++;
        count--;
        return item;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
