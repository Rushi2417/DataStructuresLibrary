// File: StackUsingArrayList.java
package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackUsingArrayList {
    private ArrayList<Object> stack;

    // Constructor to initialize the stack
    public StackUsingArrayList() {
        stack = new ArrayList<>();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Method to push an element onto the stack
    public void push(Object element) {
        stack.add(element);
    }

    // Method to pop an element from the stack
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    // Method to return the top element of the stack without removing it
    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    // Method to get the size of the stack
    public int size() {
        return stack.size();
    }

    // Method to print the elements of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }
}
