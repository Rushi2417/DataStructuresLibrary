// File: SinglyLinkedList.java
package linkedlist;

public class SinglyLinkedList {
    private Node head;

    // Node class representing an element in the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    

    // Method to insert a new node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to delete a node with a given key
    public void deleteNode(int key) {
        Node temp = head;
        Node prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        prev.next = temp.next;
    }

    // Method to get the size of the linked list
    public int getSize() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to remove the first node from the linked list
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Method to remove the last node from the linked list
    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Method to set the data of a node at a given position
    public void setNode(int position, int data) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == position) {
                current.data = data;
                return;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index is out of bounds");
    }

    // Method to get the data of a node at a given position
    public int getNode(int position) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == position) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        throw new IndexOutOfBoundsException("Index is out of bounds");
    }

    // Method to print the linked list
    public void printLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
