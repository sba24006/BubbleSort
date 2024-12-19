/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
         https://github.com/sba24006/DiagonalSum/blob/master/Documents/NetBeansProjects/DiagonalSum/src/diagonalsum/DiagonalSum.java
 */
package diagonalsum;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the matrix (n x n)
        System.out.print("Enter size of matrix: ");
        int n = scanner.nextInt();

        // Declare a 2D array to store the matrix elements
        // A 2D array is used to represent the matrix, with rows and columns
        int[][] matrix = new int[n][n];

        // Prompt the user to enter the elements of the matrix row by row
        System.out.println("Enter elements row by row:");
        for (int i = 0; i < n; i++) { // Loop through each row
            for (int j = 0; j < n; j++) { // Loop through each column in the current row
                // Read the value for the current cell (i, j)
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Declare variables to store the sums of the main diagonal and secondary diagonal
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        // Calculate the sums of the diagonals
        for (int i = 0; i < n; i++) {
            // Main diagonal: Elements where row index equals column index (i.e., matrix[i][i])
            mainDiagonalSum += matrix[i][i];

            // Secondary diagonal: Elements where row index + column index equals n - 1
            // (i.e., matrix[i][n - 1 - i])
            secondaryDiagonalSum += matrix[i][n - 1 - i];
        }

        // Display the calculated sums of the diagonals
        System.out.println("Sum of main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);

        // Close the Scanner to release system resources
        scanner.close();
    }
}
