package com.DS1.HashTables;

public class concept {
    public static void main(String[] args) {

        // Hash Function
        // Suppose we want to make a key value pair with key value a very big number.
        // So in that case we are not required to create an array of such a big size.
        // In that case hash function is used.
        // Suppose the length of the array we have used is 100.
        // So if the key inputted hsa a value greater than 100 then we will take remainder of it by 100.
        // For example :- 123456 % 100 = 56;
        // So we would store it on 56 index.
        // We do not directly store it. This is known as chaining.


        // Chaining Strategy.
        // In the above we managed to get the index for a very large key input.
        // But what if another key is given as an input with same value (here 56).
        // So the value we get from hash function is not directly stored to the key.
        // Instead, we create a node and point that to the node.
        // Now if another value is given with same key/index then another would be created and prev will point to this newly created.


        // Probing Strategy.
        // Storing the key value pair directly.
        // And then if same key is found again with another value then storing it in the next index.
        // This is open addressing-linear probing.
        // Formula :- hash(key) + i;

        // Open addressing-quadratic probing.
        // We might get into infinite loop in quadratic probing.
        // So we use Double Hashing.
        // Formula :- hash(key) + i^2;



        // Double Hashing.
        // Here instead of i and i^2 we use another hash.
        // Formula :- (hash(key) + i*(hash2(key)) % table_size;



    }
}
