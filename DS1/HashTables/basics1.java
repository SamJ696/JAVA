package com.DS1.HashTables;

import java.util.HashMap;
import java.util.Map;

public class basics1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap();

        map.put(1, "Sam");
        map.put(2, "Sam");
        map.put(3, null);
        map.put(null, "John");

//        map.

        // Will update the value if the key has already been inserted before.
        map.put(2, "Hisoka");

        // Here key is passed as parameter.
        // It will remove the key value pair from the map.
        map.remove(null);

        // Here also key is passed as an argument.
        // In this case it will return a String as the values mapped with integers are string here.
        // Value mapped with key 2 will be returned.
        var ans = map.get(2);
        System.out.println("Get Function Output :- " + ans);

        // These both functions returns a boolean value.
        map.containsKey(3);  // O(1) -> Time Complexity.
        map.containsValue("Sam");   // O(N) -> Time Complexity.

        System.out.println("Map Output :- " + map);

        // We cannot iterate over the map directly.
        // Two methods are available.
        // One is entrySet() which has key value pairs.
        // And the other one is keySet() which has all the keys. Not their values.
        for (var item: map.keySet()){
            System.out.println(item);
        }
        // entrySet provides with some methods for the iterator.
        // item.getValue and item.hashCode are some of them. We can print them.
        for (var item: map.entrySet()){
            System.out.println(item);
        }
    }
}
