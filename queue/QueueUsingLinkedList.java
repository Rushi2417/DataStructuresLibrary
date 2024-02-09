// File: QueueUsingLinkedList.java
package queue;

import java.util.NoSuchElementException;

public class QueueUsingLinkedList {
    private Node front;
    private Node rear;
    private int size;

    // Node class representing an element in the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor to initialize the queue
    public QueueUsingLinkedList() {
        front = null;
        rear = null;
        size = 0;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the queue
    public int size() {
        return size;
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    // Method to remove and return the element at the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int removedElement = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return removedElement;
    }

    // Method to return the element at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return front.data;
    }
}
