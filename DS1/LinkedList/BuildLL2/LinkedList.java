package com.DS1.LinkedList.BuildLL2;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        // Assigning the value to the node.
        public Node(int value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;


    // addLast
    public void addLast(int item) {
        var node = new Node(item);

        // Checking if the list is empty. If yes then head and tail both equal to provided one.
        if (head == null){
            head = tail = node;
        }
        // Else assigning the last(current) to the node passed and shifting last to node passed.
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // addFirst
    public void addFirst(int item){
        var node = new Node(item);

        // Same as above.
        if (head == null) {
            head = tail = node;
        }
        // Assigning node passed next to first node and changing first to node passed.
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    // addBetween
    public void addIndex(int item, int index) {
        if (index > size){
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
            addFirst(item);
            return;
        }

        if (index == size){
            addLast(item);
            return;
        }

        var node = new Node(item);
        var current = head;
        var next = head.next;

        for (int i=1; i<=index; i++){
            if (i == index){
                current.next = node;
                node.next = next;
                break;

            }
            current = current.next;
            next = next.next;
            size++;
        }
    }

    // addRecursion
    public void addRecursion(int val, int index) {
        head = addRecursion(index, val, head);
    }

    private Node addRecursion(int index, int item, Node node) {
        if (index == 0){
            node.value = item;
            size++;
            return node;
        }

        addRecursion(index--, item, node.next);
        return node;
    }

    // indexOf
    public int indexOf(int item){
        int index = 0;
        var current = head;

        while (current != null) {
            if (current.value == item){
                return index;
            }
            else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    // contains
    public boolean contains(int item) {
        // If value is true then we have that item in the list.
        return indexOf(item) != -1;
    }

    // deleteFirst
    public void removeFirst() {
        // [10 -> 20 -> 30]  First -> 10
        // We want first -> 20

        // Checking for an empty list.
        if (head == null) {
            throw new NoSuchElementException();
        }

        // Checking if list has only one node.
        if (head == tail){
            head = tail = null;
            return;
        }

        // If it has two nodes or more.
        else {
        var second = head.next;  // second is pointing to 20.
        head.next = null; // Removing the link between the first and the second.
        head = second;
        }

        size--;
    }

    // deleteLast
    public void removeLast() {
        // Checking if list is empty.
        if (head == null){
            throw new NoSuchElementException();
        }

        // Checking if list has only one element.
        if (head == tail){
            head = tail = null;
        }

        // If list has two or more nodes.
        var current = head;
        // Running the loop till we get the last second node of the list.
        while (current != null){
            if (current.next == null){
                break;
            }
            current = current.next;
        }
        tail = current;
        current.next = null;

        size--;
    }

    // size
    public int size() {
        return size;
    }

    // Converting to Array.
    public int[] toArray() {
        int[] array = new int[size];
        var current = head;
        var index = 0;

        while (current != null){
            array[index] = current.value;
            index++;
            current = current.next;
        }

        return array;
    }

    // Reversing
    public void reverse() {
        if (head == null){
            return;
        }

        var previous = head;
        var current = head.next;


        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        tail = head;
        tail.next = null;
        head = previous;
    }

}
