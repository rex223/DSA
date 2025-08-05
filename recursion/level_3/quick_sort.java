package recursion.level_3;

import java.util.Arrays;

import arrays.Swap;

// What is pivot? ---- a reference element
// chose any element as pivot and after first pass all the elements on the left hand side of the pivot
// will be smaller than the pivot and all the larger elements will be on the right hand side of the pivot
// In quick sort the pivot is put at the correct position after every pass
// It is not stable and in place sorting
// A non-stable sorting algorithm does not preserve the relative order of equal elements in the sorted output. This means that if two elements have the same key (value), their original order in the input may change in the final sorted sequence.

// NOTE: quick sort is better than merge sort as it stops if the portion of the array is already sorted
// however for linked list merge sort is /preferred

public class quick_sort {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 2, 1, 9 };
        int arr1[] = Arrays.copyOf(arr, arr.length); // inbuilt algorithms using arr.sort
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("The array is : ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorting the array:");
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        int low = start;
        int high = end;
        while (low <= high) {
            while (arr[low] < pivot)
                low++;
            while (arr[high] > pivot)
                high--;

            if (low <= high) {
                Swap.swap(arr, low, high);
                low++;
                high--;
            }
        }
        quickSort(arr, start, high);
        quickSort(arr, low, end);
        return;
    }
}
