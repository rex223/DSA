package recursion.level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zero_count {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());
        int result = countZero(n);
        System.out.println("Number of zeros in " + n + " is: " + result);
    }
    static int countZero(int n){
        if (n==0) return 1;
        if (n < 10) return (n == 0 ? 1 : 0); 
        return (n%10 == 0 ? 1 : 0) + countZero(n/10);
    }
}
