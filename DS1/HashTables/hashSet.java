package com.DS1.HashTables;

import java.util.HashSet;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int[] numbers = {1,2,3,4,45,6,7,7,2,1,4};

        for (var number: numbers){
            set.add(number);
        }

        System.out.println(set);


        set.clear();
        System.out.println(set);
    }
}
