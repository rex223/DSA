package binarySearch;

public class binarySearch {

    static int BSearch(int[][] arr, int element) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            System.out.println("The array is not initialized or is empty.");
            return -1;
        }
        int row = arr.length;
        int column = arr[0].length;
       // Visualizing the 2d array as a 1d array (arr[i][j] = arr[i*column+j])
        int left = 0; 
        int right = row*column-1; 

        while (left <= right) {
            int mid = left + (right - left) / 2; 
            int midElement = arr[mid/column][mid%column]; // Convert mid to 2D index
            if (midElement == element){
                System.out.printf("The element [%d] is found at index [%d][%d].\n", element, mid/column, mid%column);
                return 1;
            }else if (midElement > element){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;

    }
}