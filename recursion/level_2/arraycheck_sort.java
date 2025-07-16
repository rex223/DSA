package recursion.level_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class arraycheck_sort {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no of elements in the array: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:-");
        for (int i = 0; i < n; i++) {
            System.out.print("Index " + i + ": ");
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("The elements of the array are:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        if (check_sort(arr, 0) == true) {System.out.println("\nThe array is sorted!");}
        else {System.out.println("\nThe array is not sorted");}

    }
    static boolean check_sort(int[] arr, int i){
        if (i == arr.length-1) return true;
        if (arr[i] <= arr[i+1]) return check_sort(arr, i+1);
        else return false;
        }
}

