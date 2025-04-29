package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main1DSearchb {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of elements in the array: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int i = 0, s = 0, e = arr.length - 1;
        while (i < n) {
            System.out.print("Enter element " + (i + 1) + " :");
            arr[i] = Integer.parseInt(br.readLine());
            i++;
        }
        System.out.print("Enter the number u wanna search for in the array: ");
        int target = Integer.parseInt(br.readLine());
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                System.out.println("Element " + target + " found at index: " + m);
                return;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        System.out.println("Element " + target + " not found in array.");
        System.out.println("Ceiling for element " + target + " is " + arr[s]);
        System.out.println("Floor for element " + target + " is " + arr[e]);
    }
}
