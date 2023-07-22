package com.DS2.Trees;

import java.util.ArrayList;

public class TreeNodes<T> {
    public T data;
    public ArrayList<TreeNodes<T>> children;

    public TreeNodes(T data) {
        this.data = data;
        children = new ArrayList<>();
    }
}
