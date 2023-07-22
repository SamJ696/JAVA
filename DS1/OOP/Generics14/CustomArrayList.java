package com.DS1.OOP.Generics14;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // Also working as index value.

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length*2];

        // Copy the previous elements.
        for (int i=0; i<data.length; i++){
            temp[i] = data[i];
        }

        // NOW ORIGINAL ARRAY WILL POINT TO THE NEW DOUBLE SIZED ARRAY.
        // ELEMENTS INSERTED WILL BE IN THE DOUBLE SIZED ONE.
        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1,667);
//        list.size();
//        list.isEmpty();

        CustomArrayList list = new CustomArrayList();
//        list.add(7);
//        list.add(2);
//        list.add(4);

        System.out.println(list);


        for (int i=0; i<14; i++){
            list.add(2*i);
        }

        System.out.println(list.size());
    }
}
