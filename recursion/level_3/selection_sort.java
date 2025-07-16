package recursion.level_3;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Before sorting: \n" + java.util.Arrays.toString(arr));
        selectionSortR(arr, arr.length, 0);
        System.out.println("After sorting:\n" + java.util.Arrays.toString(arr));
    }

    private static void selectionSortR(int[] arr, int n, int currentIndex){
        if (currentIndex == n) return;

        int minIndex = getMinIndex(arr, currentIndex, n-1);
        arrays.Swap.swap(arr, currentIndex, minIndex);
        selectionSortR(arr, n, currentIndex + 1);
    }

    private static int getMinIndex(int[] arr, int start, int end){
        if (start == end) return start;

        int minIndexInRest = getMinIndex(arr, start + 1, end);
        return arr[start] < arr[minIndexInRest] ? start : minIndexInRest;
    }
}
