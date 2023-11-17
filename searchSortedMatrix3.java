
public class searchSortedMatrix3 {

    public static boolean searchSortedMatrix(int matrix[][], int item) {
        int row = matrix.length - 1;
        int col = 0;

        while (col < matrix[0].length && row >= 0) {
            if (matrix[row][col] == item) {
                System.out.println("Found at index : " + "(" + row + "," + col + ")");
                return true;
            } else if (matrix[row][col] > item) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int target = 29;

        searchSortedMatrix(matrix, target);
    }
}
