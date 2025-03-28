package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EvenDigits {
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
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("The array is : "+Arrays.deepToString(arr));
        int c=0;
        for (int[] num : arr) {
            for (int i : num) {
                if (evDigits(i)) {
                    c++;
                }               
            }
        }
        System.out.println(""+c);
        br.close();
    }
static boolean evDigits(int number){
    // METHOD BELOW HAS T.C O(N)
    // String num=String.valueOf(number);
    // char[] arr=num.toCharArray();
    // for (char c : arr) {
        //     j++;
        // }
    if (number<0) {
        number*=-1;
    }
    // METHOD BELOW HAS T.C 0(logn)
    // int j=0;
    // while (number!=0) {
    //     number/=10;
    //     j++;
    //     }
    // return j % 2==0;
    
    if (number==0) {
        return false;
    }
    int j=(int)Math.log10(number)+1;
    return j%2==0;
    }
}
