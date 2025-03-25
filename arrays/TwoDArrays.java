package arrays;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;


public class TwoDArrays{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //we can store different size of arrays as each single position in the array is another array which is stored in the heap memory at different locations thus they are not stored in the contiguous memory locations
        int[][] arr={
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };//there is no need to specify the columns
        int[][] arr2D=new int[3][2];
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D[i].length;j++){
                System.out.printf("Enter the [%d][%d]th index of the array: ",i,j);
                arr2D[i][j]=Integer.parseInt(br.readLine());
        }
    }
    for(int i=0;i<arr2D.length;i++){
        for(int j=0;j<arr2D[i].length;j++){
            System.out.print(arr[i][j]+" ");
            }
        System.out.println("");
    }
    // System.out.println("The length of the 2D array is : "+arr2D.length );
    // for (int i = 0; i < arr2D.length; i++) {
    //     System.out.println(Arrays.toString(arr2D[i]));
    // }
    for (int[] array:arr2D) {
        System.out.println(Arrays.toString(array));
    }
}
}