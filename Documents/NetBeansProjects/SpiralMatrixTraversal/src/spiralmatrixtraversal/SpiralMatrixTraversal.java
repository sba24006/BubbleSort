/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
        https://github.com/sba24006/spiralmatrixtraversal/blob/master/Documents/NetBeansProjects/SpiralMatrixTraversal/src/spiralmatrixtraversal/SpiralMatrixTraversal.java
 */
package spiralmatrixtraversal;
import java.util.Scanner;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns for the matrix
        System.out.print("Enter rows and columns of matrix: ");
        int rows = scanner.nextInt(); // Read the number of rows
        int cols = scanner.nextInt(); // Read the number of columns

        // Declare a 2D array (matrix) to store the elements
        int[][] matrix = new int[rows][cols];

        // Prompt the user to enter the elements of the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) { // Loop through each row
            for (int j = 0; j < cols; j++) { // Loop through each column in the current row
                matrix[i][j] = scanner.nextInt(); // Read and store the input in the matrix
            }
        }

        // Print the elements of the matrix in spiral order
        System.out.print("Spiral Traversal: ");
        spiralTraversal(matrix, rows, cols); // Call the helper method to perform spiral traversal

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }

    /**
     * Method to perform spiral traversal of the matrix
     *
     * @param matrix The 2D array to traverse
     * @param rows   Number of rows in the matrix
     * @param cols   Number of columns in the matrix
     */
    public static void spiralTraversal(int[][] matrix, int rows, int cols) {
        // Initialize the boundaries of the matrix
        int top = 0, bottom = rows - 1; // Top and bottom rows
        int left = 0, right = cols - 1; // Leftmost and rightmost columns

        // Continue traversing the matrix until the boundaries overlap
        while (top <= bottom && left <= right) {
            // Traverse the top row from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Move the top boundary down to the next row

            // Traverse the right column from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move the right boundary left to the next column

            // Traverse the bottom row from right to left (only if within bounds)
            if (top <= bottom) { // Check if there are rows left to traverse
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move the bottom boundary up to the previous row
            }

            // Traverse the left column from bottom to top (only if within bounds)
            if (left <= right) { // Check if there are columns left to traverse
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move the left boundary right to the next column
            }
        }
    }
}
