package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class largestArraySplit {
    
    static int[] splitArray(int[] arr){
        int sum=0;
        int max = Integer.MIN_VALUE;
        
        if (arr.length==0 || arr==null) return new int[]{-1};
        for(int num : arr){
            sum+=num;
            max = Math.max(max, num);
        }
        return new int[]{max,sum};
    }
    
    static int search(int[] arr, int k){


        int[] result = splitArray(arr);
        int s = result[0];
        int e = result[1];
        int m;

        while (s < e) { // condition breaks when we have s==e that is our result
            m = s + (e - s) / 2;
            
            int subSum = 0;
            int pieces = 1; //1 is bcoz it's minimum no of parts the array can be split into
            
            for (int num : arr) {
                if (num + subSum > m){
                    subSum = num;
                    pieces++;
                }else{
                    subSum += num;
                }
            }
            if (pieces > k) s = m + 1; // if the no of pieces is greater than k, we need to increase the sum
            else e = m; // if the no of pieces is less than k, we need to decrease the sum
        }
        
        return s;
    }
    public static void main(String[] args) throws IOException {
        int[] arr = {7,2,5,10,8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no of parts to split the array into: ");
        int k = Integer.parseInt(br.readLine());
        if (k <= 0) {
            System.out.println("Invalid input. The no of parts should be greater than 0.");
            return;
        }else if(k > arr.length) {
            System.out.println("Invalid input. The no of parts should be less than or equal to the length of the array.");
            return;
        }
        System.out.println("The largest allowed sum of the sub-array is: " + search(arr, k));
    }
    
}
