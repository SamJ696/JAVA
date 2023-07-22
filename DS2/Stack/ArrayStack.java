package com.DS2.Stack;

public class ArrayStack {

    private int[] data;
    private int top;


    // Create a Stack with default size of 10;
    public ArrayStack(){
        data = new int[10];
        top = -1;
    }

    // Create a Stack with desired size.
    public ArrayStack(int length){
        data = new int[length];
        top = -1;
    }

    // Add an element into the Stack.
    public void push(int value) throws Exception {
        if (top < data.length - 1){
            data[++top] = value;
        }

        else {
            throw new Exception("Stack Overflow");
        }
    }

    // Number of elements present in the Stack
    public int size(){
        return top + 1;
    }

    // Maximum elements that you can inset into the Stack.
    public int capacity(){
        return data.length;
    }

    // Check whether the Stack is empty or not.
    public boolean isEmpty(){
        if (top == -1){
            return true;
        }

        return false;
    }

    // Returns the top element of the Stack.
    public int top() throws Exception {
        if (top == -1){
            throw new Exception("Stack Empty");
        }
        return data[top];
    }

    // Removes the top element of the Stack.
    public int pop() throws Exception {
        if (top == -1){
            throw new Exception("Stack Underflow");
        }

        int temp = data[top];
        top--;
        return temp;
    }
}
