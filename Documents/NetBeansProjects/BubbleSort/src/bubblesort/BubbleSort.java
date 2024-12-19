/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
        https://github.com/sba24006/BubbleSort/blob/master/Documents/NetBeansProjects/BubbleSort/src/bubblesort/BubbleSort.java
 */
package bubblesort;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input: Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt(); // Read the size of the array

        // Declare an array of size 'n' to store the elements
        int[] array = new int[n];

        // Input: Ask the user to enter the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            // Store each entered element in the array
            array[i] = scanner.nextInt();
        }

        // Display the array before sorting
        System.out.print("Array before sorting: ");
        displayArray(array); // Call the function to print the array

        // Sort the array using the Bubble Sort algorithm and count the number of swaps
        int swapCount = bubbleSort(array);

        // Display the array after sorting
        System.out.print("Array after sorting: ");
        displayArray(array); // Call the function to print the sorted array

        // Display the total number of swaps performed during sorting
        System.out.println("Total number of swaps: " + swapCount);

        // Close the Scanner object to release resources
        scanner.close();
    }

    /**
     * This function sorts an array using the Bubble Sort algorithm.
     * It also counts the total number of swaps performed.
     *
     * @param array The input array to be sorted
     * @return The total number of swaps performed
     */
    public static int bubbleSort(int[] array) {
        int n = array.length; // Get the size of the array
        int swapCount = 0; // Initialize a counter to track the number of swaps

        // Perform Bubble Sort
        for (int i = 0; i < n - 1; i++) { // Outer loop controls the number of passes
            for (int j = 0; j < n - 1 - i; j++) { // Inner loop compares adjacent elements
                // Compare the current element with the next element
                if (array[j] > array[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    // Increment the swap counter
                    swapCount++;
                }
            }
        }

        // Return the total number of swaps performed
        return swapCount;
    }

    /**
     * This function displays the elements of an array.
     *
     * @param array The array to be displayed
     */
    public static void displayArray(int[] array) {
        // Loop through each element in the array
        for (int value : array) {
            // Print the current element followed by a space
            System.out.print(value + " ");
        }
        // Move to the next line after printing all elements
        System.out.println();
    }
}
