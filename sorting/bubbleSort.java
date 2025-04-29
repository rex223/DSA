package sorting;

import java.util.Arrays;

// Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order.   ALSO known as sinking or exchange sort.
//  It is a stable sorting algorithm and has a time complexity of O(n^2) in the worst and average case, and O(n) in the best case (when the array is already sorted).

// Stable sorting is when values are not tampered with when they are equal
public class bubbleSort {

    static void sortBubble(int[] arr){
        int n=arr.length;
        if (arr==null || n==0) return;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]) swap.swap(arr,j,j+1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting: \n"+Arrays.toString(arr));

        System.out.println();
        sortBubble(arr);
        System.out.println("After sorting:\n"+Arrays.toString(arr));

    }
}
