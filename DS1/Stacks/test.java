package com.DS1.Stacks;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,3);
        map.put(0,4);

        map.remove(1);

        System.out.println(map);
    }
}

