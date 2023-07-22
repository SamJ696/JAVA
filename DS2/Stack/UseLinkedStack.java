package com.DS2.Stack;

public class UseLinkedStack {
    public static void main(String[] args) throws Exception {
        LinkedStack<Integer> st = new LinkedStack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.top());
        st.push(10);

        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
}
