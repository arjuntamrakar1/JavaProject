public class OneDimensionalArray {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the elements of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    

       
            // Declare a 2D array of integers
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            // Print the elements of the 2D array
            System.out.println("Two-dimensional array:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.println("Element at row " + i + ", column " + j + ": " + matrix[i][j]);
                }
            }
        }

    }
    
