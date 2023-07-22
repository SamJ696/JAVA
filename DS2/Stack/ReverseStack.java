package com.DS2.Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        for (int i=0; i<st.size(); i++){
            System.out.print(st.get(i) + " ");
        }

        System.out.println();

        Stack<Integer> newStack = new Stack<>();
        while (!st.isEmpty()){
            newStack.push(st.pop());
        }

        for (int i=0; i<newStack.size(); i++){
            System.out.print(newStack.get(i) + " ");
        }
    }
}
