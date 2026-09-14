public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {9, 9, 9},
                {1, 1, 2},
                {0, 0, 0},
                {2, 1, 1}
        };

        ArrayUtils.printMatrix(matrix);
        ArrayUtils.sortMatrixBySum(matrix);
        ArrayUtils.printMatrix(matrix);
    }
}