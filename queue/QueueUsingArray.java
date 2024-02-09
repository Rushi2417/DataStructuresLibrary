// File: QueueUsingArray.java
package queue;

import java.util.NoSuchElementException;

public class QueueUsingArray {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the queue with a given capacity
    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the size of the queue
    public int size() {
        return size;
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        array[rear] = element;
        size++;
    }

    // Method to remove and return the element at the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int removedElement = array[front];
        front = (front + 1) % capacity;
        size--;
        return removedElement;
    }

    // Method to return the element at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return array[front];
    }
}
