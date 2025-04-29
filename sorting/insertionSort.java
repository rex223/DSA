package sorting;

// Insertion sort is a stable sorting algo 
// Swaps are reduced compared to bubble sort good for partially sorted arrays and takes part in hybrid sorting algorithms
//  Time complexity: O(n^2) in the worst case and O(n) in the best case 

public class insertionSort {
    static void sortInsertion(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap.swap(arr, j - 1, j);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Before sorting: \n" + java.util.Arrays.toString(arr));
        sortInsertion(arr);
        System.out.println("After sorting:\n" + java.util.Arrays.toString(arr));
    }
}
