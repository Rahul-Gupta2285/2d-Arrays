public class diagonal {

    // brute force approch
    // public static int diagonalSum(int matrix[][]) {
    // int sum = 0;
    // int n = matrix.length;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // if (i == j) {
    // sum += matrix[i][j];
    // } else if (i + j == n - 1) {
    // sum += matrix[i][j];
    // }
    // }
    // }
    // return sum;
    // }

    // optimal approch o(n)
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            // primary diagonal
            sum = sum + matrix[i][i];
            // secondary diagonal
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println(diagonalSum(matrix));
    }
}
