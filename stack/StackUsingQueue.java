// File: StackUsingQueue.java
package stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    private Queue<Integer> primaryQueue;
    private Queue<Integer> secondaryQueue;

    // Constructor to initialize the stack
    public StackUsingQueue() {
        primaryQueue = new LinkedList<>();
        secondaryQueue = new LinkedList<>();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return primaryQueue.isEmpty();
    }

    // Method to push an element onto the stack
    public void push(int element) {
        // Move all elements from primaryQueue to secondaryQueue
        while (!primaryQueue.isEmpty()) {
            secondaryQueue.offer(primaryQueue.poll());
        }
        // Add the new element to the empty primaryQueue
        primaryQueue.offer(element);
        // Move all elements back from secondaryQueue to primaryQueue
        while (!secondaryQueue.isEmpty()) {
            primaryQueue.offer(secondaryQueue.poll());
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return primaryQueue.poll();
    }

    // Method to return the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return primaryQueue.peek();
    }

    // Method to print the elements of the stack
    public void printStack() {
        System.out.print("Stack (top to bottom): ");
        for (int element : primaryQueue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
