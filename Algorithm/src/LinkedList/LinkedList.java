package LinkedList;

import java.util.Stack;

class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    private Node head = null;

    Node getHead() {
        return head;
    }

    void insert(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            if (temp.next != null)
                System.out.print(temp.data + "-->");
            else
                System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    void display(Node node) {
        Node temp = node;
        while (temp != null) {
            if (temp.next != null)
                System.out.print(temp.data + "-->");
            else
                System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    void findMiddle() {
        Node fastPointer = head;
        Node slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        System.out.println("The Middle element is :" + slowPointer.data);
    }

    void iterativeReverse() {
        Node prev = null;
        Node current, next;
        current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    void recursiveReverse() {
        recursiveReverseUtil(head, null);
    }

    private void recursiveReverseUtil(Node current, Node prev) {
        if (current.next == null) {
            head = current;
            head.next = prev;
            return;
        }
        Node next = current.next;
        current.next = prev;
        recursiveReverseUtil(next, current);
    }

    void reverseListInGroup(int size) {
        head = reverseListInGroupUtil(head, size);
    }

    private Node reverseListInGroupUtil(Node head, int size) {
        Node current = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while (count < size && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next != null)
            head.next = reverseListInGroupUtil(next, size);
        return prev;
    }

    void merge(Node secondHead) {
        head = mergeHelper(head, secondHead);
    }

    private Node mergeHelper(Node head, Node secondHead) {
        if (head == null)
            return secondHead;
        if (secondHead == null)
            return head;

        Node result;
        if (head.data < secondHead.data) {
            result = head;
            result.next = mergeHelper(head.next, secondHead);
        } else {
            result = secondHead;
            result.next = mergeHelper(head, secondHead.next);
        }
        return result;
    }

    boolean checkPalindrome() {
        Node temp = head;
        boolean palindrome = true;
        Stack<Integer> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (!stack.isEmpty()) {
            if (!(temp.data == stack.pop())) {
                palindrome = false;
                break;
            }
            temp = temp.next;
        }
        return palindrome;
    }

    void alternateSplit() {
        if (head == null || head.next == null)
            return;
        Node head1 = head, head2 = head.next;
        Node temp = head;
        while (temp != null) {
            Node next = temp.next;
            if (temp.next != null)
                temp.next = temp.next.next;
            temp = next;
        }
        display(head1);
        display(head2);
    }

}
