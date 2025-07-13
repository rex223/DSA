package recursion.level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverse_num {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number you wanna rev: ");
        int n = Integer.parseInt(br.readLine());
        int result = reverse(n);
        System.out.println("The reversed number is : " + result);
    }

    // Entry function that initializes reverse process
    static int reverse(int n) {
        return helper(n, 0);
    }

    // Pure math-style reversal: rev builds the reversed number
    static int helper(int n, int rev) {
        if (n == 0) return rev;
        return helper(n / 10, rev * 10 + n % 10);
    }
}
