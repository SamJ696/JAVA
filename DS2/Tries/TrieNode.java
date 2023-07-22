package com.DS2.Tries;

public class TrieNode {
    char data;
    boolean isTerminate;
    TrieNode[] children;

    public TrieNode(char data){
        this.data = data;
        isTerminate = false;
        children = new TrieNode[26];
    }
}
