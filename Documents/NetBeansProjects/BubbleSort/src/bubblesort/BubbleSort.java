/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
                // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Input: Size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Declare the array to store the element
        int[] array = new int[n]; // 

        // Input: Elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the array before sorting
        System.out.print("Array before sorting: ");
        displayArray(array);// Call the display function to print the array

        // Sort the array using Bubble Sort and count swaps
        int swapCount = bubbleSort(array);

        // Display the array after sorting
        System.out.print("Array after sorting: ");
        displayArray(array);

        // Display total number of swaps
        System.out.println("Total number of swaps: " + swapCount);

        // Close the scanner
        scanner.close();
    }
    
    
    /**
     * This function sorts an array using the Bubble Sort algorithm.
     * It also counts the total number of swaps performed.
     *
     * @param array The input array to be sorted
     * @return The total number of swaps performed
     */

    // Bubble Sort function
    public static int bubbleSort(int[] array) {
        int n = array.length;
        int swapCount = 0; // Counter for swaps

        // Perform Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare adjacent elements
                if (array[j] > array[j + 1]) {
                    // Swap elements if they are in the wrong order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapCount++; // Increment swap counter
                }
            }
        }
        return swapCount; // Return total swaps
    }

    // Function to display the array
    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
