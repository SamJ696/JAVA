package com.DS2.Stack;

import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(20);
        st.push(30);
        st.push(60);

        System.out.println(st.pop());
        System.out.println(st.peek());

        st.push(30);
        st.push(50);
        st.push(90);

        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
