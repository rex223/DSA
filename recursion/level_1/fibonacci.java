package recursion.level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci {
    static int fib(int n) {
        return (n <= 1) ? n : fib(n - 1) + fib(n - 2);
    }

    static int printFibo(int current, int n){
        if (current >n) return 1;
        System.out.print(fib(current) + " ");
        printFibo(current + 1 , n);
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = Integer.parseInt(br.readLine());
        // System.out.println(fib(n) + " ");
        // System.out.println("Fibonacci series: ");
        // printFibo(0, n); // Tail recursion

        // // Golden ratio approximation
        double phi = (1 + Math.sqrt(5)) / 2;        
        //  finding fibonacci number using golden ratio
        System.out.println("Fibonacci number using golden ratio: " + Math.round(Math.pow(phi, n) / Math.sqrt(5)));

        br.close();
    }
}
