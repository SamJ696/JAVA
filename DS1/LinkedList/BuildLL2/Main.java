package com.DS1.LinkedList.BuildLL2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Size before adding node :- " + list.size());
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("Size after all nodes added :- " + list.size());
        System.out.println("Index of element passed :- " + list.indexOf(30));

        var arr = list.toArray();
        System.out.println("Converting to Array :- " + Arrays.toString(arr));

        list.reverse();
        var revArr = list.toArray();
        System.out.println("Reversed List :- " + Arrays.toString(revArr));

        list.addIndex(42, 2);
        var newArr = list.toArray();
        System.out.println("Adding new element :- " + Arrays.toString(newArr));

//        list.addRecursion(54,2);
//        var recArr = list.toArray();
//        System.out.println("After Recursion :- " + Arrays.toString(recArr));


    }
}
