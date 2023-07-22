package com.DS2.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseLinkedList {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(5);
        System.out.println(node1.data);
        Node<Integer> head = createLinkedList();
        head = evenOddLinked(head);
        printLinked(head);
    }


    public static Node<Integer> createLinkedList() {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2);
        Node<Integer> n3 = new Node<>(3);
        Node<Integer> n4 = new Node<>(4);
        Node<Integer> n5 = new Node<>(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        return n1;
    }

    public static void printLinked(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void incrementElement(Node head){
        Node<Integer> temp = head;

        while (temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    public static void lengthLinked(Node head){
        int count = 0;

        while (head != null){
            count++;
            head = head.next;
        }

        System.out.println(count);
        return;
    }

    public static void printINode(Node head, int i){
        int count = 0;

        if (i < 0){
            System.out.println("Not Found");
            return;
        }

        while (head != null){
            if (count == i){
                System.out.println(head.data);
                return;
            }

            count++;
            head = head.next;
        }

        if (head == null){
            System.out.println("Not Found");
        }
    }

    public static Node<Integer> takeInput() {
        Scanner in = new Scanner(System.in);
        int data = in.nextInt();
        Node<Integer> head = null;
        Node<Integer> temp = null;

        while (data != -1){
            Node<Integer> currentNode = new Node<>(data);
            data = in.nextInt();

            if (head == null){
                head = currentNode;
                temp = head;
            }

            else {
                temp.next = currentNode;
                temp = temp.next;
            }
        }

        return head;
    }

    public static Node<Integer> insertAtPosition(Node head, int value, int pos) {
        Node<Integer> add = new Node<>(value);

        if (pos < 0){
            return head;
        }

        if (pos == 0){
            add.next = head;
            head = add;
            return head;
        }

        int count = 0;
        Node<Integer> current = head;
        Node<Integer> prev = null;

        while (current != null){
            if (count == pos){
                prev.next = add;
                add.next = current;
                return head;
            }

            count++;
            prev = current;
            current = current.next;
        }

        return head;
    }

    public static int findNode(Node<Integer> head, int value){
        if (head == null){
            return -1;
        }

        int i = 0;
        while (head != null){
            if (head.data.equals(value)){
                return i;
            }
            head = head.next;
            i++;
        }
        return -1;
    }

    public static Node appendLast(Node head, int value){
        if (head == null || value == 0){
            return head;
        }

        Node<Integer> orig = head;
        Node<Integer> start = head;
        Node<Integer> prev = head;

        for (int i=0; i<value; i++){
            start = start.next;
        }

        while (start.next != null){
            prev = prev.next;
            start = start.next;
        }

        Node<Integer> temp = prev.next;
        prev.next = null;
        start.next = orig;
        head = temp;

        return head;
    }

    public static Node removeDuplicates(Node head){
        if (head == null){
            return head;
        }

        Node<Integer> t1 = head;
        Node<Integer> t2 = head.next;

        while (t2 != null){
            if (t1.data == t2.data){
                t2 = t2.next;
            }

            else {
                t1.next = t2;
                t1 = t2;
                t2 = t2.next;
            }
        }

        t1.next = t2;
        return head;
    }

    public static void printReverse(Node head){
        if (head == null){
            return;
        }

        List<Integer> values = new ArrayList<>();
        while (head != null){
            values.add((int)head.data);
            head = head.next;
        }

        for (int i=values.size()-1; i>=0; i--){
            System.out.print(values.get(i) + " ");
        }
        return;
    }

    public static void printReverseRecursion(Node head){
        if (head == null){
            return;
        }

        printReverseRecursion(head.next);
        System.out.println(head.data + " ");
    }

    public static boolean palindromeLinked(Node head){
        if (head == null || head.next == null){
            return true;
        }

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        // Acquiring mid point.
        while (fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // Arranging so-called pointers.
        fast = slow.next;
        slow.next = null;
        slow = head;

        // Reverse second half of the Linked List.
        Node<Integer> current = fast;
        Node<Integer> prev = null;
        Node<Integer> fwd = null;

        while (current != null){
            fwd = current.next;
            current.next = prev;
            prev = current;
            current = fwd;
        }


        // Comparing first and second half of the Linked List.
        while (prev != null && slow != null){
            if ((int)slow.data != (int)prev.data){
                return false;
            }

            prev = prev.next;
            slow = slow.next;
        }

        return true;
    }

    public static void printRecursion(Node head){
        if (head == null){
            return;
        }

        System.out.println(head.data);
        printRecursion(head.next);
    }

    public static Node insertRecursion(Node head, int position, int value){
        Node<Integer> insert = new Node(value);
        if (position == 0){
            insert.next = head;
            return insert;
        }

        else {
            Node<Integer> newHead = insertRecursion(head.next, position-1, value);
            head.next = newHead;
            return head;
        }
    }

    public static Node deleteRecursion(Node head, int position){
        if (position == 0){
            head = head.next;
            return head;
        }

        else {
            Node<Integer> newHead = deleteRecursion(head.next, position - 1);
            head.next = newHead;
            return head;
        }
    }

    public static Node reverseRecursion(Node head) {
        if (head == null || head.next == null){
            return head;
        }

        Node<Integer> newHead = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static boolean findNodeRecursion(Node head, int value){
        if (head == null){
            return false;
        }

        if ((int)head.data == value){
            return true;
        }

        return findNodeRecursion(head.next, value);
    }

    public static Node evenOddLinked(Node head){
        if (head == null){
            return head;
        }

        Node<Integer> oddH = null;
        Node<Integer> evenH = null;
        Node<Integer> oddT = null;
        Node<Integer> evenT = null;

        while (head != null){
            if ((int)head.data % 2 == 0){
                if (evenH == null){
                    evenH = head;
                    evenT = head;
                }

                else {
                    evenT.next = head;
                    evenT = evenT.next;
                }
            }

            else {
                if (oddH == null){
                    oddH = head;
                    oddT = head;
                }

                else {
                    oddT.next = head;
                    oddT = oddT.next;
                }
            }

            head = head.next;
        }

        if (oddH == null){
            return evenH;
        }

        else {
            oddT.next = evenH;
        }

        if (evenH == null){
            return oddH;
        }

        else {
            evenT.next = null;
        }

        return oddH;
    }

    public static Node skipMdeleteN(Node head, int m, int n){
        if (m == 0 || head == null){
            System.out.println("Error");
            return null;
        }

        if (n == 0){
            return head;
        }

        Node<Integer> current = head;
        Node<Integer> temp = null;

        while (current != null){
            int take = 0;
            int skip = 0;

            while (current != null && take < m){
                if (temp == null){
                    temp = current;
                }

                else {
                    temp.next = current;
                    temp = current;
                }

                current = current.next;
                take += 1;
            }

            while (current != null && skip < n){
                current = current.next;
                skip += 1;
            }
        }

        if (temp != null){
            temp.next = null;
        }

        return head;
    }

    public static Node swapNodes(Node head, int i, int j){
        if (head == null){
            System.out.println("Error");
            return null;
        }

        Node<Integer> current1 = head;
        Node<Integer> prev1 = null;
        Node<Integer> current2 = head;
        Node<Integer> prev2 = null;

        for (int x=0; x<i; x++){
            prev1 = current1;
            current1 = current1.next;
        }

        for (int x=0; x<j; x++){
            prev2 = current2;
            current2 = current2.next;
        }

        prev1.next = current2;
        current1.next = current2.next;

        if (prev2 != current1) {
            prev2.next = current1;
        }

        current2.next = prev2;

        return head;
    }

    public static Node kReverse(Node head, int k){
        if (k == 0 || k == 1){
            return head;
        }

        Node<Integer> current = head;
        Node<Integer> fwd = null;
        Node<Integer> prev = null;

        int count = 0;

        while (count < k && current != null){
            fwd = current.next;
            current.next = prev;
            prev = current;
            current = fwd;
            count++;
        }

        if (fwd != null){
            head.next = kReverse(fwd, k);
        }

        return prev;
    }
}
