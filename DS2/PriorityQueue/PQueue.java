package com.DS2.PriorityQueue;

import java.util.ArrayList;

public class PQueue<T> {
    private ArrayList<Element<T>> heap;

    public PQueue(){
        heap = new ArrayList<>();
    }

    public void insert(T value, int priority){
        Element<T> e = new Element<>(value, priority);
        heap.add(e);
        int child = heap.size() - 1;
        int parent = (child - 1) / 2;

        while(child > 0){         // If child = 0 that means we are at the top.
            if (heap.get(child).priority < heap.get(parent).priority){
                // SWAPPING THE ELEMENTS.
                Element temp = heap.get(child);
                heap.set(child, heap.get(parent));
                heap.set(parent, temp);

                // UPDATING INDEXES.
                child = parent;
                parent = (child - 1) / 2;
            }

            else {
                return;
            }
        }
    }

    public T getMin() throws Exception {
        if (isEmpty()){
            throw new Exception("Empty Priority Queue");
        }
        return heap.get(0).value;
    }

    public T removeMin() throws Exception {
        if (isEmpty()){
            throw new Exception("Empty Priority Queue");
        }

        Element<T> remove = heap.get(0);
        T ans = remove.value;

        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int parent = 0;
        int leftChild = (2 * parent) + 1;
        int rightChild = (2 * parent) + 2;

        while(leftChild < heap.size()){
            int minIndex = parent;
            if (heap.get(leftChild).priority < heap.get(minIndex).priority){
                minIndex = leftChild;
            }

            if (rightChild < heap.size() && heap.get(rightChild).priority < heap.get(minIndex).priority){
                minIndex = rightChild;
            }

            if (minIndex == parent){
                break;
            }

            Element<T> temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(parent));
            heap.set(parent, temp);

            parent = minIndex;
            leftChild = (2 * parent) + 1;
            rightChild = (2 * parent) + 2;
        }

        return ans;
    }

    public int size(){
        return heap.size();
    }

    public boolean isEmpty(){
        return heap.size() == 0;
    }
}
