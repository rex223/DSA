package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainBinary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no of rows: ");
        int m = Integer.parseInt(br.readLine());
        System.out.print("Enter the no of columns: ");
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];
        System.out.println("<<<Enter the elements in ascending or descending order of rows(strictly)>>>");
        System.out.println("Enter A or a for ascending and D or d for descending");
        char str=(br.readLine().charAt(0));
        if (str=='A'||str=='a') {
            
            for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("Element [%d][%d]: ", i, j);
                        arr[i][j] = Integer.parseInt(br.readLine());
                        if (j > 0 && arr[i][j] < arr[i][j - 1]) {
                            System.out.println("Column-wise violation in: [" + j + "]th row.");
                            return;
                        }
                        if (i > 0 && arr[i][j] < arr[i - 1][j]) {
                            System.out.println("Row-wise violation in: [" + i + "]th row.");
                            return;
                        }
                    }
                }
        } else if(str=='D' || str=='d'){
            
            for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("Element [%d][%d]: ", i, j);
                        arr[i][j] = Integer.parseInt(br.readLine());
                        if (j > 0 && arr[i][j] > arr[i][j - 1]) {
                            System.out.println("Column-wise violation in: [" + j + "]th row.");
                            return;
                        }
                        if (i > 0 && arr[i][j] > arr[i - 1][j]) {
                            System.out.println("Row-wise violation in: [" + i + "]th row.");
                            return;
                        }
                    }
                }
        }else{
            System.out.println("Error input. ");
            return;
        }

        System.out.print("Enter the element you want to search: ");
        int target = Integer.parseInt(br.readLine());
        binarySearch.BSearch(arr, target);
        br.close();
    }
}
