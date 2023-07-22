package com.DS1.Build;

public class Main {
    public static void main(String[] args) {
        CustomTree tree = new CustomTree();

        tree.insert(7);
        tree.insert(9);
        tree.insert(4);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);

        System.out.println(tree.isBST());

        tree.printAtDist(3);


//        System.out.println(tree.find(10));
    }
}



