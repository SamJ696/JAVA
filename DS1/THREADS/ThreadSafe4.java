package com.DS1.THREADS;

public class ThreadSafe4 {

    // Simple solution is not to share data among multiple threads.
    // This is known as Confinement.

    // Using immutable objects is the second solution.
    // Objects that cannot be changed after they are declared and initialised.
    // For eg :- String class in Java.
    // If we convert the string into uppercase then we get a new string object.
    // Original is not changed.
    // It advantages in a way that the threads will only read these objects and not modify them.


    // Another solution is to prevent multiple threads from accessing same object concurrently.
    // This is synchronisation.
    // Because we synchronise the access of an object across different threads.
    // We do that by putting locks.
    // So we put locks in certain parts of codes.
    // Then, only one thread can access object at same time other will have to wait.

    // Deadlock can occur while implementing synchronisation.
    // In this situation, two threads wait for each other indefinitely.
    // Thread1 wait for thread2 and vice-versa and this could cause our application to crash.
    // Generally, synchronisation is bad, and we should avoid it as much as possible.


    // Another solution is using Atomic classes.
    // This allows us to achieve thread safe code without using locks.



 }
