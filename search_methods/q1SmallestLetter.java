package search_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q1SmallestLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no of elements: ");
        int n = Integer.parseInt(br.readLine());
        char[] arr = new char[n];
        System.out.print("Enter the elements in ascending order\n");
        int c = 0;
        while (c < n) {
            System.out.printf("Index %d: ", c);
            arr[c] = br.readLine().charAt(0);
            if (c > 0 && arr[c] < arr[c - 1]) {
                System.out.println("Incorrect order.");
                return;
            }
            c++;
        }
        System.out.print("Enter the target u want to search in the array: ");
        char target=br.readLine().charAt(0);
        System.out.println(findSmallestLetter(arr,target));


    }

    static char findSmallestLetter(char[] arr, char target) {
        int s = 0, e = arr.length - 1;
        if (arr == null || arr.length == 0) {
            System.out.println("Array not initialised or has no elenents.");
        } else {
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (arr[m] > target) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        // circular wrap
        return arr[s % arr.length];
    }
}
