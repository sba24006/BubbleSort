/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagonalsum;

import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter size of matrix: ");
        int n = scanner.nextInt();

        // Declare a 2D array to store the matrix
        int[][] matrix = new int[n][n];

        // Input matrix elements row by row
        System.out.println("Enter elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Variables to store sums of diagonals
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        // Calculate the sums of the main diagonal and secondary diagonal
        for (int i = 0; i < n; i++) {
            mainDiagonalSum += matrix[i][i]; // Main diagonal elements: row == column
            secondaryDiagonalSum += matrix[i][n - 1 - i]; // Secondary diagonal: row + column = n - 1
        }

        // Display the results
        System.out.println("Sum of main diagonal: " + mainDiagonalSum);
        System.out.println("Sum of secondary diagonal: " + secondaryDiagonalSum);

        // Close the scanner
        scanner.close();
    }
}
