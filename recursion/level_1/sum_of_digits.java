package recursion.level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum_of_digits {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());
        int result = sumDigit(n);
        System.out.println("Sum of digits of "+n+" is: "+result);

    }
    static int sumDigit(int n){
         if (n==0) return 0;
         return n%10 +sumDigit(n/10);
    }
}
