public class MyList<T> {

    private Object[] array; // Array to hold the data
    private int size;  // Current number of elements in the array
    private static final int CAPACITY = 10; //Max capacity given

    public MyList() {
        this(CAPACITY);
    }

    // Constructor with custom initial capacity
    public MyList(int capacity) {
        if (capacity <= 0) {
            System.out.println("Capacity must be bigger than zero!");
        }
        array = new Object[capacity];
        size = 0;
    }

    // Returns the current number of elements in the list
    public int size() {
        return size;
    }

    // Returns the current capacity of the array
    public int getCapacity() {
        return array.length;
    }

    // Adds an element to the list
    public void add(T data) {
        if (size == array.length) {
            increaseCapacity();
        }
        array[size++] = data;
    }

    // Increases the capacity of the array by doubling its size
    private void increaseCapacity() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
