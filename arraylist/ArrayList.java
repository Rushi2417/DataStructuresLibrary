package arraylist;


//arraycopy function in System
public class ArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size;

    // Constructor to initialize the ArrayList with default capacity
    public ArrayList() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Method to get the size of the ArrayList
    public int size() {
        return size;
    }

    // Method to check if the ArrayList is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get an element at a given index
    public Object get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index is out of bounds");
        return data[index];
    }

    // Method to set an element at a given index
    public void set(int index, Object element) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index is out of bounds");
        data[index] = element;
    }

    // Method to add an element at the end of the ArrayList
    public void add(Object element) {
        if (size == data.length)
            resize(2 * data.length); // Double the capacity if the ArrayList is full
        data[size++] = element;
    }

    // Method to remove an element at a given index
    public Object removeAt(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index is out of bounds");
        Object removedElement = get(index);
        for (int i = index; i < size - 1; i++)
            data[i] = data[i + 1];
        size--;
        if (size < data.length / 4) // Shrink the ArrayList if it's less than 1/4 full
            resize(data.length / 2);
        return removedElement;
    }

    // Method to resize the ArrayList to a new capacity
    private void resize(int newCapacity) {
        Object[] newData = new Object[newCapacity];
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
    }

    // Method to print the elements of the ArrayList
    public void printArrayList() {
        for (int i = 0; i < size; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }
}
