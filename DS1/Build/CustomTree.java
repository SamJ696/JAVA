package com.DS1.Build;

import java.util.ArrayList;

public  class CustomTree {

    private class Node {
        private int val;
        private Node leftChild;
        private Node rightChild;

        public Node(int val) {
            this.val = val;
        }

        @Override
        public String toString(){
            return "Node = " + val;
        }
    }

        private Node root;

        // Inserting in a Tree
        public void insert(int val){
                if (root == null){
                    root = new Node(val);
                    return;
                }

                var current = root;

                while (true){
                    if (val < current.val){
                        if (current.leftChild == null){
                            current.leftChild = new Node(val);
                            break;
                        }
                        current = current.leftChild;
                    }

                    else {
                        if (current.rightChild == null){
                            current.rightChild = new Node(val);
                            break;
                        }
                        current = current.rightChild;
                    }
                }
            }


        // Finding in a tree.
        public boolean find(int val){
            var current = root;

            while(current != null){
                if (val < current.val){
                    current = current.leftChild;
                }

                else if (val > current.val){
                    current = current.rightChild;
                }

                else {
                    return true;
                }
            }
            return false;
        }


        // PreOrder Traversal
        // Overloading method to call without argument.
        public void traversePreOrder(){
            traversePreOrder(root);
        }
        private void traversePreOrder(Node root){
            if (root == null){
                return;
            }

            System.out.println(root.val);
            traversePreOrder(root.leftChild);
            traversePreOrder(root.rightChild);
        }



        // Inorder Traversal
        public void traverseInOrder(){
            traverseInOrder(root);
        }
        private void traverseInOrder (Node root){
            if (root == null){
                return;
            }

            traverseInOrder(root.leftChild);
            System.out.println(root.val);
            traverseInOrder(root.rightChild);
        }



        // Post Order Traversal
        public void traversePostOrder(){
            traversePostOrder(root);
        }
        private void traversePostOrder(Node root){
            if (root == null){
                return;
            }

            traversePostOrder(root.leftChild);
            traversePostOrder(root.rightChild);
            System.out.println(root.val);
        }



        // Height
        public int height(){
            return height(root);
        }
        private int height(Node root){

            if (root == null){
                return -1;
            }

            if (root.leftChild == null || root.rightChild == null){
                return 0;
            }

            return 1 + Math.max(height(root.leftChild), height(root.rightChild));
        }



        // Minimum element.
        public int min(){
            return min(root);
        }
        private int min(Node root){

            if (root.leftChild == null && root.rightChild == null){
                return root.val;
            }

            var left = min(root.leftChild);
            var right = min(root.rightChild);

            return Math.min(Math.min(left, right), root.val);
        }


        // Equality
        public boolean equals(CustomTree other){
            if (other == null){
                return false;
            }
            return equals(root, other.root);
        }
        private boolean equals(Node first, Node second) {
            if (first == null && second == null){
                return true;
            }

            if (first != null && second != null){
                return first.val == second.val
                        && equals(first.leftChild, second.leftChild)
                        && equals(first.rightChild, second.rightChild);
            }

            return false;
        }


        // Checking for Binary Search Tree.
        public boolean isBST() {
            return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        private boolean isBST(Node root, int min, int max){
            if (root == null){
                return true;
            }

            if (root.val < min || root.val > max){
                return false;
            }

            return isBST(root.leftChild, min, root.val - 1)
                    && isBST(root.rightChild, root.val + 1, max);
        }


        // Print nodes at a distance.
        public ArrayList<Integer> printAtDist(int distance){
            var list = new ArrayList<Integer>();
            printAtDist(root, distance, list);
            return list;
        }
        private void printAtDist(Node root, int distance, ArrayList<Integer> list){
            if (root == null){
                return;
            }

            if (distance == 0){
                list.add(root.val);
                return;
            }

            printAtDist(root.leftChild, distance-1, list);
            printAtDist(root.rightChild, distance-1, list);
        }


        // Level Order Traversal.
        public void traverseLevelOrder(){
            for (var i = 0; i< height(); i++){
                var list = printAtDist(i);
                for (var value: list){
                    System.out.println(value);
                }
            }
        }
}

