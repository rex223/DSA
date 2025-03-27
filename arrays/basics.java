package arrays;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basics{
    public static void main(String[] args) throws IOException{
        //datatype variable=new datatype[size]
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // int[] arr=new int[20];//creates an integer arraay of size 5
        // //int[] arr; is a declaration takes place at compile tym
        // //arr=new int[5]; is an initialization of tht array in heap memory
        // System.out.println(arr[4]);
        System.out.print("Enter the size of the array: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr1= new int[n];
        System.out.println("The initialised integer array is always made up of zeros: ");
        for (int j : arr1) {
            System.out.print(" "+j);
        }
        // String str=null;//can be defined but int cant be null
        // System.out.println(str);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("\nEnter the value of arr1 at index "+i+" : ");
            arr1[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Array values in string format is: "+Arrays.toString(arr1));
        System.out.println("The integer array is as follows: ");
        for (int num : arr1) {
            System.out.print(num+" ");
        }
        int i=0;
        int j=arr1.length-1;
        //reversing the array
        while (i<j) {
            Swap.swap(arr1, i, j);
            i++;
            j--;
        }
        System.out.println("\nArray after reversing: "+Arrays.toString(arr1));

        br.close();

    }
}