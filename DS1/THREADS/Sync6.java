package com.DS1.THREADS;

import com.DS1.OOP.Access9.A;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sync6 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();

        // Here without sync race condition occurs as two threads are racing to modify collection.
        // So instead of creating collection like above we use Synchronised collections to create object/

        Collection<Integer> collection2 = Collections.synchronizedCollection(new ArrayList<>());
        // Now all methods like add and remove will have synchronization in their base code.

        var thread1 = new Thread(() -> {
            collection2.addAll(Arrays.asList(1, 2, 3));
        });

        var thread2 = new Thread(() -> {
            collection2.addAll(Arrays.asList(4, 5, 6));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(collection2);
    }
}
