package com.DS2.Stack;

import com.DS2.LinkedList.Node;

import java.util.LinkedList;

public class LinkedStack<T> {

    private Node<T> head;
    private int size;


    public LinkedStack(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(T element){
        Node<T> newNode = new Node<T>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T top() throws Exception {
        if (size == 0){
            throw new Exception("Stack Underflow");
        }
        return head.data;
    }

    public T pop() throws Exception {
        if (size == 0){
            throw new Exception("Stack Underflow");
        }
        Node<T> temp = head;
        head = head.next;
        size--;
        return temp.data;
    }
}
