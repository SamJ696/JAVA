package com.DS2.Tries;

public class Trie {
    private TrieNode root;

    public Trie(){
        root = new TrieNode('\0');
    }

    public void add(String word){
        add(word, root);
    }

    private void add(String word, TrieNode root){
        if (word.length() == 0){
            root.isTerminate = true;
            return;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];

        if (child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
        }

        add(word.substring(1), child);
    }

    public boolean search(String word){
        return search(word, root);
    }

    private boolean search(String word, TrieNode root){
        if (word.length() == 0){
            return root.isTerminate;
        }

        int index = word.charAt(0) - 'a';
        TrieNode child = root.children[index];

        if (child == null){
            return false;
        }

        return search(word.substring(1), child);
    }
}
