package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hourglassPattern{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter maximum pattern legnth at an index: ");
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < 2*n ; i++){
            int j = i<=n? i : 2*n-i;
            for(int k =1; k <= n-j; k++){
                System.out.print(" ");
            }
            for(int k =1 ; k<=j; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}