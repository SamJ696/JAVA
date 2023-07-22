package com.DS1.Stacks;

import java.util.Stack;

public class base1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());

        System.out.println(stack.contains(40));

        // Removes last element.
        var last = stack.pop();

        // Returns a boolean value for empty or not.
        var bool = stack.empty();

        // Gives the top element.
        var top = stack.peek();

        // Pass an object as an argument in the method.
        var bool2 = stack.search(10);

        Stack<Character> stack2 = new Stack<>();
        boolean ans = stack.equals(stack2);
        System.out.println(ans);
        System.out.println(bool2);
    }
}
