package search_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// This is for a rotated sorted array with no duplicates
public class rotatedSorted {
    static int searchPivot(int[] arr){
        int s,e,m;
        s=0;e=arr.length-1;
        m=s+(e-s)/2;

        if (arr.length==0) {
            return -1;
        }
        while (s<=e) {
            if (arr.length==1) {
                return 0;
            }
            if(arr[m]>arr[m+1]){
                return m;
            }
            if (arr[m]<arr[m-1]){
                return m-1;
            }
            if (arr[m]>arr[s]){
                s=m+1;
            }else{
                e=m-1;
            }
        }
        return -1;
    }
    static int search(int[] arr, int target){
        int pivot=searchPivot(arr);
        if (arr[pivot]==target){
            return pivot;
        }
        int s=0, e=arr.length-1, m;
        if (arr[s] > target){
            s=pivot+1;
        }else if (arr[s] < target){
            e=pivot-1;
        }
        System.out.println("start: "+s+" end: "+e);
        while(s<=e){
            m=s+(e-s)/2;
            if (arr[m]==target){
                return m;
            }
            if (arr[m]>target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException{
        int [] arr={4,5,6,7,0,1,2};
        int pivot=searchPivot(arr);
        System.out.println("The pivot is at index: "+pivot);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the element u wanna search: ");
        int target = Integer.parseInt(br.readLine());
        System.out.println("The target is found at index: "+search(arr, target));
    }
}
