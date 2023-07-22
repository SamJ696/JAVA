package com.DS1.Stacks;

import java.util.Stack;

public class reverseString2 {
    public static void main(String[] args) {
        String str = "abcdef";

        var result = reverse(str);
        System.out.println(result);
    }

    public static String reverse(String input){
        if (input == null){
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Or we can use for each loop, but we can't use for each loop on string.
        // We have to convert it to character array first by toCharArray method.

        String reversed = "";
        while (!stack.empty()){
            reversed += stack.pop();
        }

        return reversed;
    }
}
