package com.DS2.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String input = "(())()()";
        System.out.println(balanced(input));

    }

    private static boolean balanced(String input) {
        Stack<Character> st = new Stack<>();

        for (int i=0; i<input.length(); i++){
            if (input.charAt(i) == '('){
                st.push(input.charAt(i));
            }

            else if (input.charAt(i) == ')'){
                if (st.isEmpty()){
                    return false;
                }

                char top = st.pop();

                if (input.charAt(i) == ')' && top == '('){
                    continue;
                }

                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
