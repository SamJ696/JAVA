package com.DS1.OOP.Generics14;

import java.util.Arrays;

public class WildCardExample<T> {

        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0; // Also working as index value.

        public WildCardExample(){
            this.data = new Object[DEFAULT_SIZE];
        }

        public void add(T num){
            if (isFull()){
                resize();
            }
            data[size++] = num;
        }

        private void resize() {
            Object[] temp = new Object[data.length*2];

            // Copy the previous elements.
            for (int i=0; i<data.length; i++){
                temp[i] = data[i];
            }

            // NOW ORIGINAL ARRAY WILL POINT TO THE NEW DOUBLE SIZED ARRAY.
            // ELEMENTS INSERTED WILL BE IN THE DOUBLE SIZED ONE.
            data = temp;
        }

        public T remove(){
            T removed = (T)(data[--size]);
            return removed;
        }

        public T get(int index){
            return (T)data[index];
        }

        public int size(){
            return size;
        }

        public void set(int index, T value){
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
//        list.add(7);
//        list.add(2);
//        list.add(4);

            WildCardExample<Integer> list = new WildCardExample<>();
            for (int i=0; i< 14; i++){
                list.add(2*i);
            }

            System.out.println(list);
        }
    }


