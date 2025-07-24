package recursion.level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import arrays.Swap;


// Inplace has TC of n**2 with SC of n*logn and normal has TC of n*logn and SC of n**2
// This is bcoz we create a new array in normal adding to space and in inPlace array is accessed and checked causing n**2 TC

public class merge_sort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no of elements in the array:");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        System.out.println("Enter the elements of the aray: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Element %d: ", i+1);
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] arr1 = Arrays.copyOf(arr, n);
        System.out.println("The array is:- ");
        System.out.print(Arrays.toString(arr) + " ");
        mergeSortInPlace(arr, 0, n-1);
        mergeSort(arr1, 0, n-1);
        System.out.println("\nThe sorted array(inPlace) is:- ");
        System.out.print(Arrays.toString(arr) + " ");
        System.out.println("\nThe sorted array(normal) is:- ");
        System.out.print(Arrays.toString(arr1) + " ");
    }
    static void mergeSort(int[] arr, int start, int end){
        if (start >= end) return;
        int mid = start +(end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr, start, mid, end);
        
    }
    
    static void merge(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid+1;
        int k = 0;
        int[] array = new int [end - start +1];

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]){
            array[k++] = arr[i++];
            }   
            else {
               array[k++] = arr[j++];
            }
        }
        while (i <= mid) array[k++] = arr[i++];
        while (j <= end) array[k++] = arr[j++];

        for (int l = 0; l < array.length; l++) {
            arr[start + l] = array[l];
        }
    }

    static void mergeSortInPlace(int[] arr, int start, int end){
        int mid = start +(end - start)/2;
        if (start >= end) return;
        else{
            mergeSortInPlace(arr, start, mid);
            mergeSortInPlace(arr, mid+1, end);
            mergeInPlace(arr, start, mid, end);
        }
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid+1;
        while(i <= mid && j <= end) {
            if(arr[i] <= arr[j]) i++;
            else{
                int value = arr[j];
                int index = j;
                while (index!=i){
                    arr[index] = arr[index-1];
                    index--;
                }
                arr[i] = value;
                i++; mid++; j++;
            }
        }
    }
}
