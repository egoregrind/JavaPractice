// todo: javadoc

public class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;
    private final int CAPACITY_COEFFICIENT = 2;

    public DynamicArray(int cap) {
        arr = new int[cap];
        capacity = cap;
        size = 0;
    }

    public DynamicArray() {
        this(10);
    };

    public void addLast(int num) {
        arr = growCapacityCheck();

        arr[size++] = num;
    }

    public int removeLast() {
        if (size == 0) {
            return 0;
        }

        int tmp = arr[--size];

        arr = dropCapacityCheck();

        return tmp;
    }

    public void addFirst(int num) {
        arr = growCapacityCheck();

        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        size++;

        arr[0] = num;
    }

    public int removeFirst() {
        if (size == 0) {
            return 0;
        }

        int tmp = arr[0];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

        arr = dropCapacityCheck();

        return tmp;
    }

    public void insert(int num, int idx) {
        if (idx < 0 || idx > size) {
            return;
        }

        arr = growCapacityCheck();

        for (int i = size; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
        size++;

        arr[idx] = num;
    }

    public int removeFrom(int idx) {
        if (idx < 0 || idx > size) {
            return 0;
        }

        int tmp = arr[idx];
        for (int i = idx; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;

        arr = dropCapacityCheck();

        return tmp;
    }

    public int sum() {
        int res = 0;

        for (int i = 0; i < size; i++) {
            res += arr[i];
        }

        return res;
    }

    private int[] dropCapacityCheck() {
        int newCapacity = capacity / CAPACITY_COEFFICIENT;
        if (size < newCapacity && capacity > 10) {
            return changeCapacity(newCapacity);
        }

        return arr;
    }

    private int[] growCapacityCheck() {
        int newCapacity = capacity * CAPACITY_COEFFICIENT;
        if (size + 1 > capacity) {
            arr = changeCapacity(newCapacity);
        }

        return arr;
    }

    private int[] changeCapacity(int newCapacity) {
        int[] res = new int[newCapacity];

        for (int i = 0; i < size; i++) {
            res[i] = arr[i];
        }

        capacity = newCapacity;

        return res;
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }

        String res = "[";

        for (int i = 0; i < size - 1; i++) {
            res += arr[i] + ", ";
        }

        res += arr[size - 1] + "]";

        // res += " CAP: " + capacity + ", SIZE: " + size;

        return res;
    }
}
