package search_methods;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of rows in your array: ");
        // int n = Integer.parseInt(br.readLine());

        // String search
        // String[] arr=new String[n];
        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter the element at index "+i+" : ");
        // arr[i]=br.readLine();
        // } System.out.print("\nEnter the string you want to search: ");
        // String target=br.readLine();
        // System.out.print(Linear_Search.LSstringPos(arr, target));

        // Integer search
        // int[] arr=new int[n];
        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter the element at index "+i+" : ");
        // arr[i]=Integer.parseInt(br.readLine());
        // }
        // System.out.println("The array is :"+Arrays.toString(arr));
        // System.out.print("\nEnter the string you want to search: ");
        // int target=Integer.parseInt(br.readLine());
        // System.out.print(Linear_Search.LSintegerPos(arr, target));

        // Char search returning boolean
        // String[] arr=new String[n];
        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter the element at index "+i+" : ");
        // arr[i]=br.readLine();
        // }
        // System.out.print("\nEnter the string you want to search: ");
        // String target=br.readLine();
        // System.out.print(Linear_Search.LSchar(arr, target));

        // Char search returning element position in the string
        // String[] arr=new String[n];
        // for (int i = 0; i < n; i++) {
        // System.out.print("Enter the element at index "+i+" : ");
        // arr[i]=br.readLine();
        // }
        // System.out.println("The array is :"+Arrays.toString(arr));
        // System.out.print("\nEnter the char you want to search: ");
        // // char target=(char)(br.readLine().charAt(0)); //works the same as below one
        // char target=(char)(br.read());
        // System.out.println("Our character is: "+target);
        // System.out.print(Linear_Search.LScharPos(arr, target));

        // Finding char in a string
        System.out.print("Enter the string: ");
        String str=br.readLine();
        System.out.print("Enter the char: ");
        char target = (char) (br.read());
        System.out.println("Our character is: " + target);
        System.out.print(Linear_Search.LScharString(str, target));
        br.close();
    }
}
