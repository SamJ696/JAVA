package com.DS2.BinaryTree;

import java.util.Scanner;

public class UseBTNode {
    public static void main(String[] args) {
        BTNode<Integer> root = inputBTree();
        int ans = heightTree(root);
        System.out.println(ans);
    }

    private static BTNode<Integer> inputBTree(){
        System.out.print("Enter Root Data : ");
        Scanner in = new Scanner(System.in);
        int rootData = in.nextInt();

        if (rootData == -1){
            return null;
        }

        BTNode<Integer> root = new BTNode<>(rootData);
        BTNode<Integer> leftChild = inputBTree();
        BTNode<Integer> rightChild = inputBTree();
        root.left = leftChild;
        root.right = rightChild;

        return root;
    }

    private static int nodesBTree(BTNode<Integer> root) {
        if (root == null){
            return 0;
        }

        int leftCount = nodesBTree(root.left);
        int rightCount = nodesBTree(root.right);

        return 1 + leftCount + rightCount;
    }

    private static int sumNodes(BTNode<Integer> root){
        if (root == null){
            return 0;
        }

        int leftSum = sumNodes(root.left);
        int rightSum = sumNodes(root.right);

        return root.data + leftSum + rightSum;
    }

    private static void preOrder(BTNode<Integer> btree) {
        if (btree == null){
            return;
        }

        System.out.println(btree.data);
        preOrder(btree.left);
        preOrder(btree.right);
    }

    private static void postOrder(BTNode<Integer> root){
        if (root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    private static void inOrder(BTNode<Integer> root){
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    private static int maxNode(BTNode<Integer> root){
        if (root == null){
            return -1;
        }

        int left = maxNode(root.left);
        int right = maxNode(root.right);

        return Math.max(root.data, Math.max(left, right));
    }

    private static int greaterNodes(BTNode<Integer> root, int value){
        if (root == null){
            return 0;
        }

        int count = root.data > value ? 1 : 0;

        if (root.left != null){
            count += greaterNodes(root.left, value);
        }

        if (root.right != null) {
             count += greaterNodes(root.right, value);
        }

        return count;
    }

    private static int heightTree(BTNode<Integer> root){
        if (root == null){
            return 0;
        }

        return 1 + Math.max(heightTree(root.left), heightTree(root.right));
    }

    private static int leafNodes(BTNode<Integer> root){
        if (root == null){
            return 0;
        }

        if (root.left == null && root.right == null){
            return 1;
        }

        return leafNodes(root.left) + leafNodes(root.right);
    }

    private static void depthPrint(BTNode<Integer> root, int distance){
        if (root == null){
            return;
        }

        if (distance == 0){
            System.out.println(root.data);
            return;
        }

        depthPrint(root.left, distance - 1);
        depthPrint(root.right, distance - 1);
    }

    private static BTNode<Integer> replaceDepth(BTNode<Integer> root, int distance){
        if (root == null){
            return null;
        }

        root.data = distance;

        replaceDepth(root.left, distance + 1);
        replaceDepth(root.right, distance + 1);

        return root;

    }

    private static boolean isPresent(BTNode<Integer> root, int value){
        if (root == null){
            return false;
        }

        if (root.data == value){
            return true;
        }

        return isPresent(root.left, value) || isPresent(root.right, value);
    }

    private static void noSiblings(BTNode<Integer> root)    {
        if (root == null){
            return;
        }

        if (root.left == null && root.right == null){
            return;
        }

        if (root.left == null || root.right == null){
            if (root.left == null){
                System.out.println(root.right.data);
            }

            else {
                System.out.println(root.left.data);
            }
        }

        noSiblings(root.left);
        noSiblings(root.right);
    }

    private static BTNode<Integer> removeLeaf(BTNode<Integer> root){
        if (root == null){
            return null;
        }

        if (root.left == null && root.right == null){
            return null;
        }

        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);

        return root;
    }

    private static void mirrorTree(BTNode<Integer> root){
        if (root == null){
            return;
        }

        mirrorTree(root.left);
        mirrorTree(root.right);

        BTNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    private static void levelOrder(BTNode<Integer> root){
        for (int i=0; i<heightTree(root); i++){
            depthPrint(root, i);
        }

        return;
    }
}
