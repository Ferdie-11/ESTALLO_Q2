import java.util.Scanner; // Import the Scanner class for taking user input

public class SortingData {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        int[] sortingData = new int[10]; // Declare an array to store 10 integers

        System.out.println("ESTALLO QUIZ TWO");
        System.out.println("SORTING DATA");
        System.out.println("Enter the Data:");

        // Read 10 integers from the user
        for (int i = 0; i < 10; i++) {
            sortingData[i] = scanner.nextInt();  
        }

        // Sort the array using Bubble Sort and Selection Sort
        int[] bubbleSorted = bubbleSort(sortingData.clone());
        int[] selectionSorted = selectionSort(sortingData.clone());

        // Print the sorted arrays
        System.out.println("Bubble Sort:");
        printArray(bubbleSorted);

        System.out.println("Selection Sort:");
        printArray(selectionSorted);

        // Analyze the array for sum of even/odd numbers, minimum and maximum values
        analyzePowerLevels(sortingData);
    }

    // Bubble Sort algorithm to sort the array in ascending order
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Selection Sort algorithm to sort the array in descending order
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        int i, j, temp, maxIdx;
        for (i = 0; i < n - 1; i++) {
            maxIdx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // Analyze the array for sum of even/odd numbers, minimum and maximum values
    public static void analyzePowerLevels(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;
        int min = arr[0];
        int max = arr[0];

        // Iterate through the array to perform analysis
        for (int num : arr) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Print the analysis results
        System.out.println("Analysis:");
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
        System.out.println("Minimum Data: " + min);
        System.out.println("Maximum Data: " + max);
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
