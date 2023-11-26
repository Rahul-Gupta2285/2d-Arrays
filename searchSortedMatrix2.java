public class searchSortedMatrix2 {

    // time complexity : O(N+M) because hum ek corner se dusre corner tak traverse
    // karte hue ja rha h
    public static boolean searchSortedMatrix(int matrix[][], int item) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == item) {
                System.out.println("Found at index : " + "(" + row + "," + col + ")");
                return true;
            } else if (matrix[row][col] > item) {
                col--;
            } else {
                row++;
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

        int target = 33;

        searchSortedMatrix(matrix, target);
    }
}
