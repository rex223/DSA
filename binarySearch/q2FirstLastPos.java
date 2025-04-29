package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class q2FirstLastPos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no of elements in the array: ");
        int n = Integer.parseInt(br.readLine());
        int c = 0;
        int[] arr = new int[n];
        System.out.print("Enter the elements in ascending order\n");
        while (c < n) {
            System.out.printf("Index %d: ", c);
            arr[c] = Integer.parseInt(br.readLine());
            if (c > 0 && arr[c] < arr[c - 1]) {
                System.out.println("Incorrect order.");
                return;
            }
            c++;
        }
        System.out.println("The array is :"+Arrays.toString(arr));
        System.out.print("Enter the target element: ");
        int target = Integer.parseInt(br.readLine());
        System.out.println("The first and last element are at: " + Arrays.toString(FirstLastPos(arr, target)));
    }

    static int[] FirstLastPos(int[] arr, int target) {
        // int[] num={-1,-1};
        int s = 0, e = arr.length - 1;
        int first=-1, last=-1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                e = m - 1;
                first = m;
            }else if (arr[m]>target) {
                e=m-1;
            } 
            else {
                s = m + 1;
            }
        }
        s=0;
        e=arr.length-1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                s = m + 1;
                last = m;
            }else if (arr[m]<target) {
                s=m+1;
            }
            else {
                e = m - 1;
            }
        }

        return new int[]{first,last};
    }
}
// CLEANER SOLUTION
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = findIndex(nums, target, true);
//         int last = findIndex(nums, target, false);
//         return new int[]{first, last};
//     }

//     // findFirst = true for first occurrence, false for last
//     private int findIndex(int[] nums, int target, boolean findFirst) {
//         int s = 0, e = nums.length - 1, index = -1;
//         while (s <= e) {
//             int m = s + (e - s) / 2;
//             if (nums[m] == target) {
//                 index = m;
//                 if (findFirst) e = m - 1;
//                 else s = m + 1;
//             } else if (nums[m] > target) {
//                 e = m - 1;
//             } else {
//                 s = m + 1;
//             }
//         }
//         return index;
//     }
// }
