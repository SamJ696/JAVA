package com.DS2.Stack;

import java.sql.Array;

public class UseArrayStack {
    public static void main(String[] args) throws Exception {
        ArrayStack st = new ArrayStack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.pop();
        st.push(50);
        System.out.println(st.top());
        System.out.println(st.size());
        System.out.println(st.capacity());
        System.out.println(st.isEmpty());

        int[] arr = {1,2,3,4,5,6};
        ArrayStack stack2 = new ArrayStack(6);

        for (int num : arr){
            stack2.push(num);
        }

        while (!stack2.isEmpty()){
            System.out.print(stack2.pop() + " ");
        }
    }
}
