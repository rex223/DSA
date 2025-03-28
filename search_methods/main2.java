package search_methods;

import java.io.*;
import java.util.*;

// Search in 2d array, min and max in the array,
public class main2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no of rows: ");
        int rows = Integer.parseInt(br.readLine());
        System.out.print("Enter the no of columns: ");
        int columns = Integer.parseInt(br.readLine());
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        // FINDING THE MAXIMUM ELEMENT IN THE 2D ARRAY
        int max = Integer.MIN_VALUE;
        int c = 0, r = 0;
        System.out.println("The 2d array is ");
        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));
            r = 0;
            for (int i : num) {
                if (i > max) {
                    max = i;
                }
                r++;
            }
            c++;
        }

        System.out.printf("The max element is %d at index [%d][%d]%n", max, c, r);

        // Prints the array in a readable format for multi-dimensional arrays
        System.out.println(Arrays.deepToString(arr));
        System.out.print("Enter the element to search: ");
        int target = Integer.parseInt(br.readLine());
        int[] shit = Linear_Search.LSinteger2D(arr, target);
        System.out.println(Arrays.toString(shit));

        br.close();
    }
}
