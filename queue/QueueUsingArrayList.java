// File: QueueUsingArrayList.java
package queue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class QueueUsingArrayList {
    private ArrayList<Integer> queue;

    // Constructor to initialize the queue
    public QueueUsingArrayList() {
        queue = new ArrayList<>();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Method to get the size of the queue
    public int size() {
        return queue.size();
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int element) {
        queue.add(element);
    }

    // Method to remove and return the element at the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.remove(0);
    }

    // Method to return the element at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return queue.get(0);
    }
}
