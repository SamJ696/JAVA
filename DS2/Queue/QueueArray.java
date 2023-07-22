package com.DS2.Queue;

public class QueueArray {

    private int[] data;
    private int rear;
    private int front;
    private int size;

    // Create Queue with default size 5.
    public QueueArray(){
        data = new int[5];
        front = -1;
        rear = -1;
    }

    // Create queue with given size.
    public QueueArray(int size){
        data = new int[size];
        front = -1;
        rear = -1;
    }

    // Returns number of elements present in the queue.
    public int size(){
        return size;
    }

    // Returns total number of elements you can store into the queue.
    public int capacity(){
        return data.length;
    }

    // Returns whether the queue is empty or not.
    public boolean isEmpty(){
        return size == 0;
    }

    // Add an element into the queue.
    public void enqueue(int value) throws Exception {
        if (size == data.length){
            throw new Exception("Insufficient Space");
        }

        if (rear == -1){
            front = 0;
        }

        rear++;
        if (rear == data.length){
            rear = 0;
        }
        data[rear] = value;
        size++;
    }

    // Returns the front element of the queue.
    public int front() throws Exception {
        if (size == 0){
            throw new Exception("No element in Queue");
        }
        return data[front];
    }

    // Removes the first added element in the queue.
    public int dequeue() throws Exception {
        if (size == 0){
            throw new Exception("Empty Queue");
        }

        int temp = data[front];
        front++;

        if (front == data.length){
            front = 0;
        }

        size--;

        if (size == 0){
            front = rear = -1;
        }
        return temp;
    }
}
