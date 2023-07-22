package com.DS1.MathsBit.Bitwise;

public class Base {
    public static void main(String[] args) {
        // For AND Operator
        // All elements involved should be true for the expression to be true.
        // & with all 1 will never change the original number.
        // xyz && 111 == xyz. It will not change.


        // For OR Operator
        // If anyone element is true then the expression stands true.


        // For XOR Operator
        // It means if and only if. Exclusive OR.
        // Only one should be true in order for expression to be true.
        // If both are true then expression is false.


        // IMP OBSERVATIONS.
        // 1. XOR any number with 1 --> We'll get complement i.e. 0-->1 & 1-->0.
        // 2. XOR any number with 0 --> We'll get same number.
        // 3. XOR the number with itself --> Answer is zero as nothing changes.
        // 4. Complement -->  10110-->01001.


        // Left Shift Operator
        // 1010<<1 == 10100. Every bit shifts to left and 0 is added.
        // a<<1 == 2a. It doubles the number.
        // a<<b == a*2^b.


        // Right Shift Operator
        // 0011001>>1 == 001100. Every bit is shifted to right.
        // a>>1 == a/2. It halves the number.
        // a>>b == a/2^b.


        // Range Formula for N bits
        // -2^(n-1) to (2^(n-1))-1.
        // Because -0 == 0.



    }
}
