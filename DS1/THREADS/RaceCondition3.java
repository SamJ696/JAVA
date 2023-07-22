package com.DS1.THREADS;

public class RaceCondition3 {
    // When multiple threads try to modify same data at same time.
    // This can lead to application crash.
    // This is known as Race Condition.
    // Multiple threads are racing or competing to modify some data.


    // When one thread changes the data and the change is not feasible to other thread.
    // Different thread will have different use of shared data.
    // This is called Visibility Problem.


    // If we want to create a multi-threaded application then we should know about these problems
    // And write a code that can safely execute without errors.
    // This is known as Thread Safe Code.
    // Classes that are thread safe can be safely used across many parallel threads.


    // Updating downloaded bytes by multiple threads is example for Race Condition.

    // Non-Atomic Operations are those which can be divided further into atoms.
    // For eg:- x++ -> Here code is of 1 line but 3 things are happening.
    // 1st value of x is read, 2nd x is incremented and 3rd updated value of x is stored.
    // This type of operation is Non-Atomic operation.
}
