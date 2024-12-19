/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
        https://github.com/sba24006/spiralmatrixtraversal/blob/master/Documents/NetBeansProjects/SpiralMatrixTraversal/src/spiralmatrixtraversal/SpiralMatrixTraversal.java
 */
package spiralmatrixtraversal;
import java.util.Scanner;

public class SpiralMatrixTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the matrix
        System.out.print("Enter rows and columns of matrix: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Declare the matrix
        int[][] matrix = new int[rows][cols];

        // Input elements of the matrix
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the spiral traversal
        System.out.print("Spiral Traversal: ");
        spiralTraversal(matrix, rows, cols);

        // Close the scanner
        scanner.close();
    }

    public static void spiralTraversal(int[][] matrix, int rows, int cols) {
        int top = 0, bottom = rows - 1; // Define the top and bottom boundaries
        int left = 0, right = cols - 1; // Define the left and right boundaries

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Move the top boundary down

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Move the right boundary left

            // Traverse from right to left (if still in bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Move the bottom boundary up
            }

            // Traverse from bottom to top (if still in bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Move the left boundary right
            }
        }
    }
}
