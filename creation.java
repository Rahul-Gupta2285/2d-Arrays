import java.util.Scanner;

public class creation {

    public static int largest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                largest = Math.max(largest, matrix[i][j]);
            }
        }
        return largest;
    }

    public static int smallest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                smallest = Math.min(smallest, matrix[i][j]);
            }
        }
        return smallest;
    }

    public static int[] search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int cell[] = search(matrix, 5);

        if (cell != null) {
            System.out.println(5 + " found at cell : (" + cell[0] + " , " + cell[1] + ")");
        } else {
            System.out.println("Not found");
        }

        System.out.println("Largest in 2d array : " + largest(matrix));

        System.out.println("Smallest in 2d array : " + smallest(matrix));
    }
}