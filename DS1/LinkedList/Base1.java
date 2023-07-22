package com.DS1.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Base1 {
    public static void main(String[] args) {
        // Linked List has two elements :- Value and Address.
        // It contains nodes / is a series of nodes.
        // First one is called head and last one is called tail.


        // TIME COMPLEXITIES OF VARIOUS OPERATIONS.
        // 1. Searching by Value :- O(n).
        // 2. Searching by Index :- O(n).

        // 3. Insertion at the end :- O(1)
        // 4. Insertion at the beginning :- O(1).
        // 5. Insertion at the middle :- O(n).

        // 6. Deletion in the end :- O(n).
        // 7. Deletion in the beginning :- O(1).
        // 8. Deletion in the middle :- O(n).

        LinkedList list = new LinkedList();
        // Adds element to the last.
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        // Adds element to the first.
        list.addFirst(5);
        list.addFirst(0);

        // This remove method takes index as an argument.
        // Other methods are also there like removeFirst and removeLast.
        list.remove(0);

        // Requires an object as an input.
        // And returns a boolean value.
        System.out.println(list.contains(10));

        // Will return in array format. Because of its default toString method.
        System.out.println(list);

        // Takes object as an input and returns an index if element is present.
        list.indexOf(20);

        // Returns the size of the list created.
        list.size();



        // Converting the list into an array.
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
