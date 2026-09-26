/**
 * <p>Класс динамического массива, который автоматически изменяет свой размер при добавлении или удалении элементов.
 * Включает в себя такие методы как:</p>
 * <ul>
 *     <li>Добавление элемента в конец массива</li>
 *     <li>Удаление последнего элемента массива</li>
 *     <li>Добавление элемента в начало массива</li>
 *     <li>Удаление первого элемента массива</li>
 *     <li>Вставка элемента по индексу</li>
 *     <li>Удаление элемента по индексу</li>
 *     <li>Вычисление суммы всех элементов массива</li>
 * </ul>
 */
public class DynamicArray {
    static private final int DEFAULT_INITIAL_CAPACITY = 10;
    static private final int[] DEFAULT_INITIAL_ARRAY = {};
    static private final int CAPACITY_COEFFICIENT = 2;

    private int initialCapacity;
    private int[] arr;
    private int size;

    /**
     * Создаёт динамический массив с начальной вместимостью по умолчанию (10).
     */
    public DynamicArray() {
        this.arr = DEFAULT_INITIAL_ARRAY;
        this.initialCapacity = DEFAULT_INITIAL_CAPACITY;
        this.size = 0;
    };

    /**
     * Создаёт динамический массив с заданной начальной вместимостью.
     * @param cap начальная вместимость массива
     */
    public DynamicArray(int cap) {
        if (cap < 0) {
            initialCapacity = DEFAULT_INITIAL_CAPACITY;
        }
        this.arr = DEFAULT_INITIAL_ARRAY;
        this.initialCapacity = cap;
        this.size = 0;
    }

    public DynamicArray(int... arr) {
        this.size = arr.length;
        this.initialCapacity = arr.length;

        for (int i = 0; i < arr.length; i++) {
            this.arr[i] = arr[i];
        }
    }

    public DynamicArray(DynamicArray array) {
        this.size = array.size;
        this.initialCapacity = array.initialCapacity;

        for (int i = 0; i < array.size; i++) {
            this.arr[i] = array.arr[i];
        }
    }


    /**
     * <p>Добавляет элемент в конец массива:</p>
     * @param num целочисленный элемент который хотим добавить в конец массива
     */
    public void addLast(int num) {
        arr = growCapacityCheck();
        arr[size++] = num;
    }

    /**
     * <p>Удаляет последний элемент массива и возвращает его:</p>
     * @return удалённый последний элемент массива, или 0 если массив пуст
     */
    public int removeLast() {
        if (size == 0) {
            return 0;
        }

        int tmp = arr[--size];
        arr = dropCapacityCheck();
        return tmp;
    }

    /**
     * <p>Добавляет элемент в начало массива:</p>
     * @param num целочисленный элемент который хотим добавить в начало массива
     */
    public void addFirst(int num) {
        arr = growCapacityCheck();

        for (int i = size; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        size++;

        arr[0] = num;
    }

    /**
     * <p>Удаляет первый элемент массива и возвращает его:</p>
     * @return удалённый первый элемент массива, или 0 если массив пуст
     */
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

    /**
     * <p>Вставляет элемент по указанному индексу, сдвигая оставшиеся элементы вправо:</p>
     * @param num целочисленный элемент который хотим вставить
     * @param idx индекс по которому вставляем элемент (от 0 до size)
     */
    public void add(int num, int idx) {
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

    /**
     * <p>Удаляет элемент по указанному индексу и возвращает его, сдвигая оставшиеся элементы влево:</p>
     * @param idx индекс элемента который хотим удалить
     * @return удалённый элемент по индексу, или 0 если индекс вне допустимого диапазона
     */
    public int remove(int idx) {
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

    /**
     * Считает сумму всех элементов динамического массива.
     * @return целочисленная сумма всех элементов массива
     */
    public int sum() {
        int res = 0;

        for (int i = 0; i < size; i++) {
            res += arr[i];
        }

        return res;
    }

    /**
     * Проверяет необходимость уменьшения вместимости массива и при необходимости уменьшает её.
     * @return массив с уменьшенной вместимостью, или текущий массив если уменьшение не требуется
     */
    private int[] dropCapacityCheck() {
        int newCapacity = arr.length / CAPACITY_COEFFICIENT;

        if (size < newCapacity) {
            if (newCapacity < initialCapacity) {
                newCapacity = initialCapacity;
            }
            return changeCapacity(newCapacity);
        }

        return arr;
    }

    /**
     * Проверяет необходимость увеличения вместимости массива и при необходимости увеличивает её.
     * @return массив с увеличенной вместимостью, или текущий массив если увеличение не требуется
     */
    private int[] growCapacityCheck() {
        if (size + 1 > arr.length) {
            int newCapacity = arr.length * CAPACITY_COEFFICIENT;

            if (newCapacity < initialCapacity) {
                newCapacity = initialCapacity;
            }

            arr = changeCapacity(newCapacity);
        }

        return arr;
    }

    /**
     * Создаёт новый массив с заданной вместимостью и копирует в него все элементы текущего массива.
     * @param newCapacity новая вместимость массива
     * @return новый массив с заданной вместимостью, содержащий все элементы текущего массива
     */
    private int[] changeCapacity(int newCapacity) {
        int[] res = new int[newCapacity];

        for (int i = 0; i < size; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    /**
     * <p>Отрисовывает динамический массив в виде строки:</p>
     * <pre>{@code
     * [1, 2, 3, 4]
     * }</pre>
     * @return строковое представление динамического массива
     */
    @Override
    public String toString() {
        if (size == 0) {
            String res = "[]";
            res += " CAP: " + arr.length + ", SIZE: " + size;
            return res;
        }

        String res = "[";

        for (int i = 0; i < size - 1; i++) {
            res += arr[i] + ", ";
        }

        res += arr[size - 1] + "]";

        res += " CAP: " + arr.length + ", SIZE: " + size;

        return res;
    }
}
