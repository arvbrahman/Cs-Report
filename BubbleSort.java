import java.util.Arrays;

public class BubbleSort {
    
    // Function to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to insert an element into the array
    public static int[] insertElement(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element; // Insert the element at the end
        return newArr;
    }

    // Function to delete an element from the array
    public static int[] deleteElement(int[] arr, int element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found");
            return arr; // Element not found, return the original array
        }

        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue; // Skip the element to be deleted
            }
            newArr[j++] = arr[i];
        }

        return newArr;
    }

    // Main function to test the above methods
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sorting the array
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // Inserting an element
        arr = insertElement(arr, 3);
        System.out.println("After Insertion: " + Arrays.toString(arr));

        // Sorting the array after insertion
        bubbleSort(arr);
        System.out.println("Sorted After Insertion: " + Arrays.toString(arr));

        // Deleting an element
        arr = deleteElement(arr, 4);
        System.out.println("After Deletion: " + Arrays.toString(arr));

        // Sorting the array after deletion
        bubbleSort(arr);
        System.out.println("Sorted After Deletion: " + Arrays.toString(arr));
    }
}
