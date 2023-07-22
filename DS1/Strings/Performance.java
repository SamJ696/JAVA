package com.DS1.Strings;

public class Performance {
    public static void main(String[] args) {
        String s = "";

        for (int i=0; i<26; i++){
            char ch = (char)('a' + i);
            s += ch;
            //System.out.print(ch + " ");
        }

        System.out.println(s);
        // + Operator copies and creates new object every time it is used.
        // So here a,ab,abc,abcd -- abc--y remain unpointed and there is wastage of space.
        // And Time complexity is 1+2+3+4+--n == n(n+1)/2 == O(n^2);
        // To avoid this we use String Builders..



        StringBuilder builder = new StringBuilder();
        for (int i=0; i<26; i++){
            char c = (char)('a' + i);
            builder.append(c);
        }


        System.out.println(builder);
        // Using StringBuilder helps to make changes in same object only and noy copying and creating new one.

        String str = "Samj";
        System.out.println(str);
        str = "";
        System.out.println(str);

    }
}
