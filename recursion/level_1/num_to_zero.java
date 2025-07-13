package recursion.level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// here we will write a function that takes a number and returns the number of steps to reach zero
//  if the number is even, we divide it by 2
//  if the number is odd, we subtract 1 from it

public class num_to_zero {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());
        int result = numToZero(n);
        System.out.println("Number of steps to reach zero from " + n + " is: " + result);
    }
    static int numToZero(int n){
        if(n==0) return 0;
        n = (n%2 == 0) ? n/2: n-1;
        return 1 + numToZero(n);
    }
}
