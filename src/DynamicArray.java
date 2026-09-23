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
        if (size + 1 > capacity) {
            arr = changeCapacity(true);
        }

        arr[size++] = num;
    }

    public int removeLast() {
        if (size == 0) {
            return 0;
        }

        int tmp = arr[--size];

        if (size < (capacity / CAPACITY_COEFFICIENT) && capacity > 10) {
            arr = changeCapacity(false);
        }

        return tmp;
    }

    public void addFirst(int num) {
        if (size + 1 > capacity) {
            arr = changeCapacity(true);
        }

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

        if (size < (capacity / CAPACITY_COEFFICIENT) && capacity > 10) {
            arr = changeCapacity(false);
        }

        return tmp;
    }

    public void insert(int num, int idx) {
        if (idx < 0 || idx > size) {
            return;
        }

        if (size + 1 > capacity) {
            arr = changeCapacity(true);
        }

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

        if (size < (capacity / CAPACITY_COEFFICIENT) && capacity > 10) {
            arr = changeCapacity(false);
        }

        return tmp;
    }

    public int sum() {
        int res = 0;

        for (int i = 0; i < size; i++) {
            res += arr[i];
        }

        return res;
    }

    private int[] changeCapacity(boolean expand) {
        int newCapacity;

        if (expand) {
            newCapacity = capacity * CAPACITY_COEFFICIENT;
        } else {
            newCapacity = capacity / CAPACITY_COEFFICIENT;
        }

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
