package sorting;

import java.util.ArrayList;

public class missingNoCyclic {
    // THE BELOW CODE IS FOR MISSING NUMBER BETWEEN 0 TO N AND RETURNS A SINGLE MISSING NUMBER.
    // static int findMissing(int[] arr){
    //     int i = 0;
    //     while (i<arr.length){          
    //         if (arr[i]<arr.length && arr[i]!=i) swap.swap(arr, arr[i], i);
    //         else i++;
    //     }
    //     for (int j=0;j<arr.length;j++){
    //         if (arr[j]!=j) return j;
    //         }
    //     return arr.length; 
    // }

    // public static void main(String[] args) {
    //     int[] arr = {2, 0, 1,  3, 6, 8, 4, 9, 5, 7};
    //     System.out.println("Before sorting: \n" + java.util.Arrays.toString(arr));
    //     int missingNumber = findMissing(arr);
    //     System.out.println("The missing number is: " + missingNumber);
    // }

    // THE BELOW CODE IS FOR MISSING NUMBER BETWEEN 1 TO N AND RETURNS ALL THE MISSING NUMBERS.

    static ArrayList<Integer> findMissing(int[] arr){
        int i =0;
        
        while (i<arr.length) {
            if (arr[i]>0 && arr[i] < arr.length && arr[i] != arr[arr[i] - 1] ) swap.swap(arr, arr[i] - 1, i);
            else i++;
        }
        System.out.println("After sorting:\n" + java.util.Arrays.toString(arr));
        ArrayList<Integer> list=new ArrayList<>();
        // THE BELOW FOR LOOP FINDS MISSING NOS AND THE DUPLICATES WHICH HOLD THE POSITION OF THE MISSING NOS.
        // for(int j=0;j<arr.length;j++){
        //     if(arr[j]!=j+1){
        //         list.add(j+1);
        //         list.add(arr[j]);
        //     }

        // BELOW CODE FINDS FIRST MISSING POSITIVE 
        // NOTE: IN THE IF STATEMENT WITHIN THE WHILE FOR FIRST MISSING POSITIVE,THERE WILL BE AN ADDED CONDITION arr[i]>0
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                list.add(j+1);
                break;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,2,4};
        System.out.println("Before sorting: \n" + java.util.Arrays.toString(arr));
        ArrayList<Integer> missingNumbers = findMissing(arr);
        System.out.println("The missing numbers are: " + missingNumbers);
    }
}