// File: QueueUsingStack.java
package queue;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> primaryStack;
    private Stack<Integer> secondaryStack;

    // Constructor to initialize the queue
    public QueueUsingStack() {
        primaryStack = new Stack<>();
        secondaryStack = new Stack<>();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return primaryStack.isEmpty() && secondaryStack.isEmpty();
    }

    // Method to get the size of the queue
    public int size() {
        return primaryStack.size() + secondaryStack.size();
    }

    // Method to add an element to the rear of the queue
    public void enqueue(int element) {
        while (!primaryStack.isEmpty()) {
            secondaryStack.push(primaryStack.pop());
        }
        primaryStack.push(element);
        while (!secondaryStack.isEmpty()) {
            primaryStack.push(secondaryStack.pop());
        }
    }

    // Method to remove and return the element at the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return primaryStack.pop();
    }

    // Method to return the element at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return primaryStack.peek();
    }
}
