package com.DS2.Stack;

import java.util.Stack;

public class RedundantBrackets {
    public static void main(String[] args) {
        String str = "((a+b))";
        System.out.println(redundant(str));
    }

    private static boolean redundant(String str) {
        Stack<Character> st = new Stack<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch != ')'){
                st.push(ch);
            }

            else {
                if (st.peek() == '('){
                    return true;
                }

                while (st.peek() != '('){
                    st.pop();
                }
                st.pop();
            }
        }

        return false;
    }
}
