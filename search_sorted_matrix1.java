public class search_sorted_matrix1 {

    // brote force approch
    public static boolean searchSortedMatrix(int matrix[][], int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Found at index : " + i + " , " + j);
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        int target = 35;

        searchSortedMatrix(matrix, target);
    }
}
