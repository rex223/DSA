package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxWealth {
        private static final String INVALID_DIMENSIONS_MSG = "Dimensions must be non-negative. Please enter valid values.";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no of rows: ");
        int rows = Integer.parseInt(br.readLine());
        System.out.print("Enter the no of columns: ");
        int columns = Integer.parseInt(br.readLine());
        if (rows<=0 || columns<=0) {
            System.out.println(INVALID_DIMENSIONS_MSG);
            return;
        }
        int[][] arr = new int[rows][columns];
        if (arr==null || arr.length==0) {
                System.out.println("Uninitialized or empty array cant proceed. Please enter valid input");
                return;
            }
        boolean allZeroes=true;
        int max_wealth=Integer.MIN_VALUE;
        for (int i = 0; i < rows; i++) {
            int c=0;
            for (int j = 0; j < columns; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(br.readLine());
                c+=arr[i][j];
                if (arr[i][j]!=0) {
                    allZeroes=false;
                }
            }
            if (c>max_wealth) {
                max_wealth=c;
            }
        }
        System.out.println("The array is : "+Arrays.deepToString(arr));
        if (allZeroes) {
            System.out.println("<<<All the elements are zero kindly enter something to compare wealth>>>");
            return;
        }
        System.out.println("Max wealth is: "+max_wealth);


        br.close();    
    }
}
