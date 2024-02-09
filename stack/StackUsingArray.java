// File: StackUsingArray.java
package stack;

public class StackUsingArray {
    private int[] array;
    private int top;
    private int capacity;

    // Constructor to initialize the stack with a given capacity
    public StackUsingArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1; // Initialize top as -1 to indicate an empty stack
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to push an element onto the stack
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        array[++top] = element;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1; // Return a default value indicating stack underflow
        }
        return array[top--];
    }

    // Method to return the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; // Return a default value indicating an empty stack
        }
        return array[top];
    }

    // Method to get the size of the stack
    public int size() {
        return top + 1;
    }

    // Method to print the elements of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
