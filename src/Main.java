public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArr = new DynamicArray();
        dynamicArr.arr = new int[]{1, 2, 3};

        System.out.println(dynamicArr);

        dynamicArr.removeLast();

        System.out.println(dynamicArr);

        dynamicArr.removeLast();

        System.out.println(dynamicArr);

        dynamicArr.removeLast();

        System.out.println(dynamicArr);

        dynamicArr.removeLast();

        System.out.println(dynamicArr);
    }
}