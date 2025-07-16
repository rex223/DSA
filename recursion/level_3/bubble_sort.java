package recursion.level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import arrays.Swap;

public class bubble_sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of elements in the array: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        bubbleSortR(arr, n , 0);
        System.out.println("Sorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    private static void bubbleSortR(int[] arr, int length, int currentIndex){
        if(length == 1) return;
        if(currentIndex < length - 1) {
            if(arr[currentIndex] > arr[currentIndex + 1]) arrays.Swap.swap(arr, currentIndex, currentIndex + 1);
            bubbleSortR(arr, length, currentIndex + 1);
        } else {
            bubbleSortR(arr, length - 1, 0);
        }
    }
}
