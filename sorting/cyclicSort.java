package sorting;

//  WHEN THE ELEMENTS ARE IN THE RANGE OF 0 TO N-1 OR 1 TO N, WHERE N IS THE SIZE OF THE ARRAY, WE CAN USE CYCLIC SORTING.

public class cyclicSort {
    static void sortCyclic(int[] arr){
        int i=0;
        while (i<arr.length){ {
            if (arr[i]-1 != i) swap.swap(arr, arr[i]-1, i);
            else i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2,6,7,5};
        System.out.println("Before sorting: \n"+java.util.Arrays.toString(arr));
        sortCyclic(arr);
        System.out.println("After sorting:\n"+java.util.Arrays.toString(arr));
    }
}