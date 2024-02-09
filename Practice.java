import array.Array;
import arraylist.ArrayList;
import linkedlist.SinglyLinkedList;
import linkedlist.DoublyLinkedList;
import linkedlist.SinglyCircularLinkedList;
import linkedlist.DoublyCircularLinkedList;
import stack.StackUsingArray;
import stack.StackUsingArrayList;
import stack.StackUsingLinkedList;
import stack.StackUsingQueue;
import queue.QueueUsingArray;
import queue.QueueUsingArrayList;
import queue.QueueUsingLinkedList;
import queue.QueueUsingStack;
import binarytree.BinaryTree;

public class Practice {
    public static void main(String[] args) {
        //Array
        Array arr = new Array(5);
        System.out.println("Is array empty? " + arr.isEmpty());
        arr.add(10); arr.add(20); arr.add(30); arr.add(40); arr.add(50);
        System.out.print("Array elements: "); arr.printArray();
        System.out.println("Array size: " + arr.size());
        int elementAtIndex2 = arr.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);
        arr.set(2, 35);
        arr.printArray();
        arr.insert(3, 25);
        arr.printArray();
        int removedElementAtIndex1 = arr.removeAt(1);
        System.out.println("Removed element at index 1: " + removedElementAtIndex1);
        arr.printArray();
        System.out.print("Final array elements: "); arr.printArray();

        //ArrayList
        ArrayList list = new ArrayList();
        System.out.println("Is ArrayList empty? " + list.isEmpty());
        list.add(10); list.add(20); list.add(30); list.add(40); list.add(50);
        System.out.print("ArrayList elements: "); list.printArrayList();
        System.out.println("ArrayList size: " + list.size());
        Object elementAtIndex3 = list.get(3);
        System.out.println("Element at index 2: " + elementAtIndex2);
        list.set(2, 35);
        System.out.print("ArrayList after setting element at index 2: "); list.printArrayList();
        Object removedElementAtIndex2 = list.removeAt(2);
        System.out.println("Removed element at index 1: " + removedElementAtIndex1);
        System.out.print("ArrayList after removing element at index 1: "); list.printArrayList();



        //SinglyLinkedList
        SinglyLinkedList list1 = new SinglyLinkedList();
        System.out.println("Is LinkedList empty? " + (list1.getSize() == 0));

        list1.insertAtEnd(10); list1.insertAtEnd(20); list1.insertAtEnd(30); list1.insertAtEnd(40); list1.insertAtEnd(50);
        System.out.print("LinkedList elements: "); list1.printLinkedList();

        System.out.println("LinkedList size: " + list1.getSize());

        list1.insertAtBeginning(5);
        System.out.print("LinkedList after inserting at beginning: "); list1.printLinkedList();

        list1.deleteNode(30);
        System.out.print("LinkedList after deleting node with key 30: "); list1.printLinkedList();

        list1.removeFirst();
        System.out.print("LinkedList after removing first node: "); list1.printLinkedList();

        list1.removeLast();
        System.out.print("LinkedList after removing last node: "); list1.printLinkedList();

        list1.reverse();
        System.out.print("LinkedList after reversing: "); list1.printLinkedList();

        list1.setNode(2, 25);
        System.out.print("LinkedList after setting node at position 2: "); list1.printLinkedList();

      

        //DoublyLinkedList
        DoublyLinkedList list2 = new DoublyLinkedList();

        System.out.println("Is LinkedList empty? " + (list2.getSize() == 0));

        list2.insertAtEnd(10); list2.insertAtEnd(20); list2.insertAtEnd(30); list2.insertAtEnd(40); list2.insertAtEnd(50);
        System.out.print("LinkedList elements: "); list2.printForward();

        System.out.println("LinkedList size: " + list2.getSize());

        int dataAtPosition3 = list2.getNode(3);
        System.out.println("Data at position 3: " + dataAtPosition3);

        list2.insertAtBeginning(5);
        System.out.print("LinkedList after inserting at beginning: "); list2.printForward();

        list2.deleteNode(30);
        System.out.print("LinkedList after deleting node with key 30: "); list2.printForward();

        list2.removeFirst();
        System.out.print("LinkedList after removing first node: "); list2.printForward();

        list2.removeLast();
        System.out.print("LinkedList after removing last node: "); list2.printForward();

        list2.reverse();
        System.out.print("LinkedList after reversing: "); list2.printForward();

        list2.setNode(2, 25);
        System.out.print("LinkedList after setting node at position 2: "); list2.printForward();

        

        System.out.print("LinkedList elements in reverse order: "); list2.printBackward();



        //SinglyCircularLinkedList
        SinglyCircularLinkedList list3 = new SinglyCircularLinkedList();

        System.out.println("Is LinkedList empty? " + (list3.getSize() == 0));

        list3.insertAtEnd(10); list3.insertAtEnd(20); list3.insertAtEnd(30); list3.insertAtEnd(40); list3.insertAtEnd(50);
        System.out.print("LinkedList elements: "); list3.printList();


        list3.setNode(2, 25);
        System.out.print("LinkedList after setting node at position 2: "); list3.printList();
      

        list3.deleteNode(30);
        System.out.print("LinkedList after deleting node with key 30: "); list3.printList();

        System.out.println("LinkedList size: " + list3.getSize());
        int dataAtPosition4 = list3.getNode(3);
        System.out.println("Data at position 3: " + dataAtPosition3);

        list3.insertAtBeginning(5);
        System.out.print("LinkedList after inserting at beginning: "); list3.printList();

        list3.removeLast();
    

        



        //DoublyCircularLinkedList
        DoublyCircularLinkedList list4 = new DoublyCircularLinkedList();

        System.out.println("Is LinkedList empty? " + (list4.getSize() == 0));

        list4.insertAtEnd(10); list4.insertAtEnd(20); list4.insertAtEnd(30); list4.insertAtEnd(40); list4.insertAtEnd(50);
        System.out.print("LinkedList elements: "); list4.printList();

        System.out.println("LinkedList size: " + list4.getSize());

        int dataAtPosition5 = list4.getNode(3);
        System.out.println("Data at position 3: " + dataAtPosition3);

        list4.insertAtBeginning(5);
        System.out.print("LinkedList after inserting at beginning: "); list4.printList();

        list4.deleteNode(30);
        System.out.print("LinkedList after deleting node with key 30: "); list4.printList();

        list4.removeFirst();
        System.out.print("LinkedList after removing first node: "); list4.printList();

        list4.removeLast();
        System.out.print("LinkedList after removing last node: "); list4.printList();

        list4.reverse();
        System.out.print("LinkedList after reversing: "); list4.printList();

        list4.setNode(2, 25);
        System.out.print("LinkedList after setting node at position 2: "); list4.printList();

        

      

       

        // Using QueueUsingArray
        QueueUsingArray queueUsingArray = new QueueUsingArray(5);
        queueUsingArray.enqueue(10);
        queueUsingArray.enqueue(20);
        queueUsingArray.enqueue(30);
        queueUsingArray.enqueue(40);
        queueUsingArray.enqueue(50);

        System.out.println("QueueUsingArray:");
        System.out.println("Size: " + queueUsingArray.size());
        System.out.println("Front element: " + queueUsingArray.peek());
        while (!queueUsingArray.isEmpty()) {
            System.out.println("Dequeued: " + queueUsingArray.dequeue());
        }

        // Using QueueUsingArrayList
        QueueUsingArrayList queueUsingArrayList = new QueueUsingArrayList();
        queueUsingArrayList.enqueue(100);
        queueUsingArrayList.enqueue(200);
        queueUsingArrayList.enqueue(300);
        queueUsingArrayList.enqueue(400);
        queueUsingArrayList.enqueue(500);

        System.out.println("\nQueueUsingArrayList:");
        System.out.println("Size: " + queueUsingArrayList.size());
        System.out.println("Front element: " + queueUsingArrayList.peek());
        while (!queueUsingArrayList.isEmpty()) {
            System.out.println("Dequeued: " + queueUsingArrayList.dequeue());
        }

        // Using QueueUsingLinkedList
        QueueUsingLinkedList queueUsingLinkedList = new QueueUsingLinkedList();
        queueUsingLinkedList.enqueue(1000);
        queueUsingLinkedList.enqueue(2000);
        queueUsingLinkedList.enqueue(3000);
        queueUsingLinkedList.enqueue(4000);
        queueUsingLinkedList.enqueue(5000);

        System.out.println("\nQueueUsingLinkedList:");
        System.out.println("Size: " + queueUsingLinkedList.size());
        System.out.println("Front element: " + queueUsingLinkedList.peek());
        while (!queueUsingLinkedList.isEmpty()) {
            System.out.println("Dequeued: " + queueUsingLinkedList.dequeue());
        }

        // Using QueueUsingStack
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enqueue(10000);
        queueUsingStack.enqueue(20000);
        queueUsingStack.enqueue(30000);
        queueUsingStack.enqueue(40000);
        queueUsingStack.enqueue(50000);

        System.out.println("\nQueueUsingStack:");
        System.out.println("Size: " + queueUsingStack.size());
        System.out.println("Front element: " + queueUsingStack.peek());
        while (!queueUsingStack.isEmpty()) {
            System.out.println("Dequeued: " + queueUsingStack.dequeue());
        }






        // Using StackUsingArray
        StackUsingArray stackUsingArray = new StackUsingArray(5);
        stackUsingArray.push(10);
        stackUsingArray.push(20);
        stackUsingArray.push(30);

        System.out.println("StackUsingArray:");
        System.out.println("Size: " + stackUsingArray.size());
        System.out.println("Top element: " + stackUsingArray.peek());
        while (!stackUsingArray.isEmpty()) {
            System.out.println("Popped: " + stackUsingArray.pop());
        }

        // Using StackUsingArrayList
        StackUsingArrayList stackUsingArrayList = new StackUsingArrayList();
        stackUsingArrayList.push(100);
        stackUsingArrayList.push(200);
        stackUsingArrayList.push(300);

        System.out.println("\nStackUsingArrayList:");
        System.out.println("Size: " + stackUsingArrayList.size());
        System.out.println("Top element: " + stackUsingArrayList.peek());
        while (!stackUsingArrayList.isEmpty()) {
            System.out.println("Popped: " + stackUsingArrayList.pop());
        }

        // Using StackUsingLinkedList
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        stackUsingLinkedList.push(1000);
        stackUsingLinkedList.push(2000);
        stackUsingLinkedList.push(3000);

        System.out.println("\nStackUsingLinkedList:");
        System.out.println("Top element: " + stackUsingLinkedList.peek());
        while (!stackUsingLinkedList.isEmpty()) {
            System.out.println("Popped: " + stackUsingLinkedList.pop());
        }

        // Using StackUsingQueue
        StackUsingQueue stackUsingQueue = new StackUsingQueue();
        stackUsingQueue.push(10000);
        stackUsingQueue.push(20000);
        stackUsingQueue.push(30000);

        System.out.println("\nStackUsingQueue:");
        System.out.println("Top element: " + stackUsingQueue.peek());
        while (!stackUsingQueue.isEmpty()) {
            System.out.println("Popped: " + stackUsingQueue.pop());
        }



        

        // Inserting elements into the binary tree
        BinaryTree tree = new BinaryTree();

        // Inserting elements into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Traversing the binary tree
        System.out.println("Inorder traversal:");
        tree.inorder();
        System.out.println("\nPreorder traversal:");
        tree.preorder();
        System.out.println("\nPostorder traversal:");
        tree.postorder();
    }
}
