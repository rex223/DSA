package recursion.level_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class rotated_search {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the element to search: ");
        int target = Integer.parseInt(br.readLine());
        int[] arr = {4, 5, 5, 5, 6, 7, 0, 1, 2, 2};
        
        ArrayList<Integer> indices = searchRotated(arr, target, 0, arr.length - 1);
        System.out.println("Element found at indices: " + indices);
    }

    static ArrayList<Integer> searchRotated(int[] arr, int target, int start, int end) {
        ArrayList<Integer> indices = new ArrayList<>();
        
        if (start > end) {
            return indices;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            indices.add(mid);
            indices.addAll(searchRotated(arr, target, start, mid - 1));
            indices.addAll(searchRotated(arr, target, mid + 1, end));
            return indices;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return searchRotated(arr, target, start, mid - 1);
            } else {
                return searchRotated(arr, target, mid + 1, end);
            }
        } 
        else {
            if (target > arr[mid] && target <= arr[end]) {
                return searchRotated(arr, target, mid + 1, end);
            } else {
                return searchRotated(arr, target, start, mid - 1);
            }
        }
    }
}