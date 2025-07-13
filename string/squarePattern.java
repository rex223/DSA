package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class squarePattern {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter length of square: ");
        int n = Integer.parseInt(br.readLine());
        for (int  rows=1; rows<2*n; rows++) {
            for (int columns = 1; columns<2*n; columns++){
                int min = Math.min(Math.min(rows, columns), Math.min(2*n-rows, 2*n-columns));
                System.out.print(min+" ");
            }
            System.out.println("");
        }
        System.out.println("\nReverse of the above pattern: ");
        for (int  rows=1; rows<2*n; rows++) {
            for (int columns = 1; columns<2*n; columns++){
                int max = Math.max(Math.max(rows, columns), Math.max(2*n-rows, 2*n-columns))-n+1;
                System.out.print(max+" ");
            }
            System.out.println("");
        }

    }
}
