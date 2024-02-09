// File: Array.java
package array;

public class Array {
    private int[] data;
    private int size;

    // Constructor to initialize the array with a given capacity
    public Array(int capacity) {
        this.data = new int[capacity];
        this.size = 0;
    }

    // Method to get the size of the array
    public int size() {
        return size;
    }

    // Method to check if the array is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get an element at a given index
    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index is out of bounds");
        return data[index];
    }

    // Method to set an element at a given index
    public void set(int index, int element) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index is out of bounds");
        data[index] = element;
    }

    // Method to add an element at the end of the array
    public void add(int element) {
        if (size == data.length)
            resize(2 * data.length); // Double the capacity if the array is full
        data[size++] = element;
    }

    // Method to insert an element at a given index
    public void insert(int index, int element) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("Index is out of bounds");
        if (size == data.length)
            resize(2 * data.length); // Double the capacity if the array is full
        for (int i = size; i > index; i--)
            data[i] = data[i - 1];
        data[index] = element;
        size++;
    }

    // Method to remove an element at a given index
    public int removeAt(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index is out of bounds");
        int removedElement = data[index];
        for (int i = index; i < size - 1; i++)
            data[i] = data[i + 1];
        size--;
        if (size < data.length / 4) // Shrink the array if it's less than 1/4 full
            resize(data.length / 2);
        return removedElement;
    }

    // Method to resize the array to a new capacity
    private void resize(int newCapacity) {
        int[] newData = new int[newCapacity];
        for (int i = 0; i < size; i++)
            newData[i] = data[i];
        data = newData;
    }

    // Method to print the elements of the array
    public void printArray() {
        for (int i = 0; i < size; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
}
