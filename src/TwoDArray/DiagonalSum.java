package pattern.TwoDArray;

public class DiagonalSum {
    public static int digSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // Primary diagonal
            sum += matrix[i][i];
            // Secondary diagonal
            if (i != matrix.length - 1 - i) { //i!=j iska matlab
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Diagonal Sum = " + digSum(matrix));
    }
}
