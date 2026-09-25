public class Main {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        System.out.println(arr);

        arr.addLast(2);
        System.out.println(arr);

        arr.addFirst(1);
        System.out.println(arr);

        arr.addFirst(0);
        System.out.println(arr);

        arr.add(5, 3);
        System.out.println(arr);

        System.out.println(arr.sum());

        arr.remove(2);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        arr.removeLast();
        System.out.println(arr);
    }
}