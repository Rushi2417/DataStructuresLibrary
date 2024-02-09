// File: SinglyCircularLinkedList.java
package linkedlist;

public class SinglyCircularLinkedList {
    private Node head;

    // Node class representing an element in the singly circular linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to insert a new node at the beginning of the singly circular linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode; // Point to itself if the list is empty
            head = newNode;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    // Method to insert a new node at the end of the singly circular linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = newNode; // Point to itself if the list is empty
            head = newNode;
        } else {
            newNode.next = head.next;
            head.next = newNode;
            head = newNode;
        }
    }

    // Method to delete a node with a given key
    public void deleteNode(int key) {
        if (head == null)
            return;
        Node temp = head, prev = null;
        while (temp.next != head) {
            if (temp.data == key) {
                if (prev != null)
                    prev.next = temp.next;
                else
                    head.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
        if (temp.data == key) {
            if (temp.next == head) {
                if (prev != null)
                    prev.next = head;
                else
                    head = null;
            } else {
                prev.next = temp.next;
            }
        }
    }

    // Method to get the size of the singly circular linked list
    public int getSize() {
        if (head == null)
            return 0;
        int count = 0;
        Node temp = head.next;
        do {
            count++;
            temp = temp.next;
        } while (temp != head.next);
        return count;
    }

    // Method to remove the first node from the singly circular linked list
    public void removeFirst() {
        if (head != null) {
            if (head.next == head) {
                head = null;
            } else {
                Node temp = head.next;
                head.next = temp.next;
                temp.next = null;
            }
        }
    }

    // Method to remove the last node from the singly circular linked list
    public void removeLast() {
        if (head != null) {
            Node temp = head.next;
            Node prev = null;
            while (temp.next != head.next) {
                prev = temp;
                temp = temp.next;
            }
            if (prev != null) {
                prev.next = head;
            } else {
                head.next = head;
            }
            temp.next = null;
            head = temp;
        }
    }

    // Method to reverse the singly circular linked list
    public void reverse() {
        if (head != null) {
            Node prev = null;
            Node current = head.next;
            Node nextNode;
            do {
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            } while (current != head.next);
            head.next = prev;
            head = prev;
        }
    }

    // Method to set the data of a node at a given position
    public void setNode(int position, int data) {
        if (position < 0 || position >= getSize()) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        Node temp = head.next;
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
        Node temp = head.next;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    // Method to print the singly circular linked list
    public void printList() {
        if (head == null)
            return;
        Node temp = head.next;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head.next);
        System.out.println();
    }
}
