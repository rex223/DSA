package sorting;

//  Selection sort sorts elements after selecting an element and positioning it in the correct place.
//  It is not a stale sorting algorithm

public class selectionSort {
    static void sortSelection(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int last=n-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap.swap(arr,maxIndex,last);
        }
    }
    
    private static int getMaxIndex(int[] arr, int i, int last) {
        int maxIndex=0;
        for (int j=0;j<=last;j++){
            if (arr[maxIndex]<arr[j]){
                maxIndex=j;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting: \n"+java.util.Arrays.toString(arr));
        sortSelection(arr);
        System.out.println("After sorting:\n"+java.util.Arrays.toString(arr));
    }
}
