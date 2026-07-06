/*
 * Program: Queue Implementation using Linked List
 * Description:
 * This program implements a Queue using a singly linked list. It supports
 * enqueue (append), dequeue, and print operations, following the
 * FIFO (First In, First Out) principle.
 */
package datastructures;
public class Queue1 {
    Node head;
    Node tail;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node curr = head;
        while (curr.next != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println(curr.data);
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Queue1 queue = new Queue1();
        queue.append(56);
        queue.append(30);
        queue.append(70);
        queue.print();
        System.out.println();

        queue.dequeue();
        queue.print();

        System.out.println();

        queue.append(80);
        queue.print();
    }
}
