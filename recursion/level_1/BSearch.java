package recursion.level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BSearch {
    static int search(int arr[], int target, int s, int e){
        int mid = s+(e-s)/2;
        if (s>e) return -1;
        if (arr[mid] == target) return mid;
        if (arr[mid] < target) return search(arr, target, mid+1, e);
        else return search(arr, target, s, mid-1);
    }
    public static void main(String[] args) throws IOException{
        int arr[] = {1, 2, 5 ,7 ,8,9,22};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number to search: ");
        int n = Integer.parseInt(br.readLine());
        int result = search(arr, n, 0, arr.length-1);
        if (result == -1) System.out.println("Element not found in the array.");
        else System.out.println("Element found at index: " + result);
    }
}
