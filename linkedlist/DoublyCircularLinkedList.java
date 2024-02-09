// File: DoublyCircularLinkedList.java
package linkedlist;


/**
 * InnerDoublyCircularLinkedList
 */


public class DoublyCircularLinkedList {
    private Node head;

    // Node class representing an element in the doubly circular linked list
    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Method to insert a new node at the beginning of the doubly circular linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Method to insert a new node at the end of the doubly circular linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode;
            newNode.prev = newNode;
            head = newNode;
        } else {
            newNode.next = head;
            newNode.prev = head.prev;
            head.prev.next = newNode;
            head.prev = newNode;
        }
    }

    // Method to delete a node with a given key
    public void deleteNode(int key) {
        if (head == null)
            return;
        Node temp = head;
        do {
            if (temp.data == key) {
                if (temp == head && temp.next == head) {
                    head = null;
                } else if (temp == head) {
                    head = temp.next;
                }
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Method to get the size of the doubly circular linked list
    public int getSize() {
        if (head == null)
            return 0;
        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    // Method to remove the first node from the doubly circular linked list
    public void removeFirst() {
        if (head != null) {
            if (head.next == head) {
                head = null;
            } else {
                head.next.prev = head.prev;
                head.prev.next = head.next;
                head = head.next;
            }
        }
    }

    // Method to remove the last node from the doubly circular linked list
    public void removeLast() {
        if (head != null) {
            if (head.next == head) {
                head = null;
            } else {
                head.prev.prev.next = head;
                head.prev = head.prev.prev;
            }
        }
    }

    // Method to reverse the doubly circular linked list
    public void reverse() {
        if (head != null) {
            Node current = head;
            do {
                Node temp = current.next;
                current.next = current.prev;
                current.prev = temp;
                current = temp;
            } while (current != head);
            head = head.prev;
        }
    }

    // Method to set the data of a node at a given position
    public void setNode(int position, int data) {
        if (position < 0 || position >= getSize()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        temp.data = data;
    }

    // Method to get the data of a node at a given position
    public int getNode(int position) {
        if (position < 0 || position >= getSize()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Method to print the doubly circular linked list
    public void printList() {
        if (head == null)
            return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
