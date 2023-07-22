package com.DS1.MathsBit.Maths;

public class Prime {
    public static void main(String[] args) {

        // Prime Numbers
        // Number that is divisible by 1 and itself only.
        // Instead of running loop from 2 to number itself.
        // Run it from 2 to square root of that number.

        // Q.  Find all the numbers from 1 to n that are prime.
        // Bruteforce :- Run for loop and check each number.

        // SIEVE METHOD FOR PRIME.

        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);
    }

    // False in array means number is prime bcoz by default all wil be false in boolean.
    // Every multiple of prime will be changed to true.
    static void sieve(int n, boolean[] primes){
        for (int i=2; i*i <= n; i++){
            if (!primes[i]){
                for (int j=i*2; j<=n; j+=i){
                    primes[j] = true;
                }
            }
        }

        for (int i=2; i<=n; i++){
            if (!primes[i]){
                System.out.print(i + " ");
            }
        }
    }
}
