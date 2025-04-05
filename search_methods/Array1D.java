package search_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array1D {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no of elements in the array: ");
        int n=Integer.parseInt(br.readLine());
        int c=0;
        int[] arr=new int[n];
        System.out.print("Enter the elements in ascending order\n");
        while (c<n) {
            System.out.printf("Index %d: ",c);
            arr[c]=Integer.parseInt(br.readLine());
            if (c>0 && arr[c]<arr[c-1]) {
                System.out.println("Incorrect order.");
                return;
            }
            c++;
        }
        if (arr==null || arr.length==0) {
            System.out.println("Array not initialised or has no elenents.");
        }else{
        System.out.print("Enter the target u want to search in the array: ");
        int target=Integer.parseInt(br.readLine());
        int s=0,e=arr.length-1;
        int floor=Integer.MAX_VALUE;
        int ceil=Integer.MIN_VALUE;
        while (s<=e) {
            int m= s+(e-s)/2;
            if (arr[m]==target) {
                System.out.println("Target found at index: "+m);
                return;

            }else if (arr[m]>target) {
                ceil=arr[m];
                e=m-1;
            }
            else{
                floor=arr[m];
                s=m+1;
                }
            }
        System.out.println("Target not in array.");
        System.out.println("The floor is : "+(floor==Integer.MAX_VALUE? "None":floor));
        System.out.println("The ceiling is : "+(ceil==Integer.MIN_VALUE? "None": ceil));
        }

        br.close();
        return;
    }
}
