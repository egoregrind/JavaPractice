public class DynamicArray {
    int[] arr;

    public int sum() {
        int res = 0;

        for (int num : arr) {
            res += num;
        }

        return res;
    }

    public void addLast(int num) {
        int[] res = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }

        res[arr.length] = num;

        arr = res;
    }

    public int removeLast() {
        if (arr.length == 0) {
            return 0;
        }

        int[] res = new int[arr.length - 1];
        int tmp = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            res[i] = arr[i];
        }

        arr = res;

        return tmp;
    }

    public String toString() {
        if (arr.length == 0) {
            return "[]";
        }

        String res = "[";

        for (int i = 0; i < arr.length - 1; i++) {
            res += arr[i] + ", ";
        }

        res += arr[arr.length - 1] + "]";

        return res;
    }
}
