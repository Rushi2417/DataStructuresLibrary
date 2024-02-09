// File: DoublyLinkedList.java
package linkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Node class representing an element in the doubly linked list
    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Method to insert a new node at the beginning of the doubly linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Method to insert a new node at the end of the doubly linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to delete a node with a given key
    public void deleteNode(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                if (current.prev != null)
                    current.prev.next = current.next;
                else
                    head = current.next;
                if (current.next != null)
                    current.next.prev = current.prev;
                else
                    tail = current.prev;
                return;
            }
            current = current.next;
        }
    }

    // Method to get the size of the doubly linked list
    public int getSize() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Method to remove the first node from the doubly linked list
    public void removeFirst() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
    }

    // Method to remove the last node from the doubly linked list
    public void removeLast() {
        if (tail != null) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        }
    }

    // Method to reverse the doubly linked list
    public void reverse() {
        Node temp = null;
        Node current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
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

    // Method to print the doubly linked list in forward direction
    public void printForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to print the doubly linked list in reverse direction
    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
