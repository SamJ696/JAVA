package com.DS2.Trees;

import javax.swing.tree.TreeNode;
import java.util.Scanner;

public class UseTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeNodes<Integer> root = takeInput(in);
//        TreeNodes<Integer> root = new TreeNodes<>(4);
//        TreeNodes<Integer> node1 = new TreeNodes<>(2);
//        TreeNodes<Integer> node2 = new TreeNodes<>(3);
//        TreeNodes<Integer> node3 = new TreeNodes<>(5);
//        TreeNodes<Integer> node4 = new TreeNodes<>(6);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        node2.children.add(node4);
    }

    public static TreeNodes<Integer> takeInput(Scanner in) {
        int n;
        System.out.print("Enter next node data : ");
        n = in.nextInt();
        TreeNodes<Integer> root = new TreeNodes<Integer>(n);
        System.out.print("Enter number of children for " + n + " : ");
        int childCount = in.nextInt();

        for (int i=0; i<childCount; i++){
            TreeNodes<Integer> child = takeInput(in);
            root.children.add(child);
        }

        return root;
    }

    public static void print(TreeNodes<Integer> root){
        String s = root.data + " : ";

        for (int i=0; i<root.children.size(); i++){
            s = s + root.children.get(i).data + " ";
        }

        System.out.println(s);

        for (int i=0; i<root.children.size(); i++){
            print(root.children.get(i));
        }
    }

    public static int numberOfNodes(TreeNodes<Integer> root){
        int count = 1;

        if (root == null){
            return 0;
        }

        for (int i=0; i<root.children.size(); i++){
            count += numberOfNodes(root.children.get(i));
        }

        return count;
    }

    public static int maxNode(TreeNodes<Integer> root){

        if (root == null){
            return Integer.MIN_VALUE;
        }

        int ans = root.data;
        for (int i=0; i<root.children.size(); i++){
            int temp = maxNode(root.children.get(i));
            ans = Math.max(ans, temp);
        }

        return ans;
    }
}
