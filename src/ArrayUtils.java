public class ArrayUtils {
    public static int sum(int... arr) {
        int res = 0;

        for (int num : arr) {
            res += num;
        }

        return res;
    }


    public static int[] convertInt(String... strings) {
        int[] res = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            res[i] = Integer.parseInt(strings[i]);
        }

        return res;
    }


    public static int[] addLast(int num, int[] src) {
        int[] res = new int[src.length + 1];

        for (int i = 0; i < src.length; i++) {
            res[i] = src[i];
        }

        res[src.length] = num;

        return res;
    }


    public static void sortMatrixBySum(int[][] matrix) {
        int rows = matrix.length;

        int[] sums = new int[rows];

        for (int i = 0; i < rows; i++) {
            sums[i] = sum(matrix[i]);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < rows; j++) {
                if (sums[i] > sums[j]) {
                    int tmpSum = sums[i];
                    sums[i] = sums[j];
                    sums[j] = tmpSum;

                    int[] tmpArray = matrix[i];
                    matrix[i] = matrix[j];
                    matrix[j] = tmpArray;
                }
            }
        }
    }


    public static void print(int[] arr) {
        System.out.print("{");

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }

        System.out.print("}\n");
    }

    public static void printMatrix(int[][] matrix) {
        System.out.print("{\n");

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(" ");
            print(matrix[i]);
        }

        System.out.print("}\n");
    }
}
