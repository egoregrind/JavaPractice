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
    private int[] arr;
    private int size;
    private int capacity;
    private final int CAPACITY_COEFFICIENT = 2;

    /**
     * Создаёт динамический массив с заданной начальной вместимостью.
     * @param cap начальная вместимость массива
     */
    public DynamicArray(int cap) {
        arr = new int[cap];
        capacity = cap;
        size = 0;
    }

    /**
     * Создаёт динамический массив с начальной вместимостью по умолчанию (10).
     */
    public DynamicArray() {
        this(10);
    };

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

    /**
     * <p>Удаляет элемент по указанному индексу и возвращает его, сдвигая оставшиеся элементы влево:</p>
     * @param idx индекс элемента который хотим удалить
     * @return удалённый элемент по индексу, или 0 если индекс вне допустимого диапазона
     */
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
        int newCapacity = capacity / CAPACITY_COEFFICIENT;
        if (size < newCapacity && capacity > 10) {
            return changeCapacity(newCapacity);
        }

        return arr;
    }

    /**
     * Проверяет необходимость увеличения вместимости массива и при необходимости увеличивает её.
     * @return массив с увеличенной вместимостью, или текущий массив если увеличение не требуется
     */
    private int[] growCapacityCheck() {
        int newCapacity = capacity * CAPACITY_COEFFICIENT;
        if (size + 1 > capacity) {
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

        capacity = newCapacity;

        return res;
    }

    /**
     * <p>Отрисовывает динамический массив в виде строки:</p>
     * <pre>{@code
     * [1, 2, 3, 4]
     * }</pre>
     * @return строковое представление динамического массива
     */
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
