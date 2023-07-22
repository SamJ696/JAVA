package com.DS2.Queue;

import com.DS2.LinkedList.Node;

public class QueueLinked<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;
    

    QueueLinked(){
        front = null;
        rear = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(T value){
        Node<T> temp = new Node<>(value);
        if (size == 0){
            front = rear = temp;
        }

        else{
            rear.next = temp;
            rear = rear.next;
        }

        size++;
    }

    public T front() throws Exception {
        if (size == 0){
            throw new Exception("Empty Queue");
        }

        return front.data;
    }

    public T dequeue() throws Exception {
        if (size == 0){
            throw new Exception("Empty Queue");
        }

        T temp = front.data;
        front = front.next;
        size--;
        return temp;
    }
}
