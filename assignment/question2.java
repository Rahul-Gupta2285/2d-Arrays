public class question2 {

    public static int sumOfSecond(int matrix[][]) {
        int sum = 0;
        int m = matrix[0].length;
        for (int j = 0; j < m; j++) {
            sum = sum + matrix[1][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 8 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        System.out.println("Sum of second row is : " + sumOfSecond(matrix));
    }
}
