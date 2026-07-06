/*
 * Program: Queue Implementation using Linked List
 * Description:
 * This program implements a Queue using a singly linked list. It supports
 * the enqueue (append) operation to insert elements at the rear of the queue
 * and the print() method to display all elements from front to rear,
 * following the FIFO (First In, First Out) principle.
 */
package datastructures;
public class Queue {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void append(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void print(){
        Node curr=head;
        while(curr.next!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println(curr.data);
    }

    public static void main(String[] args){
        Queue queue=new Queue();
        queue.append(56);
        queue.append(30);
        queue.append(70);

        queue.print();
    }
}