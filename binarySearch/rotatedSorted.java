package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// This is for a rotated sorted array with duplicates
public class rotatedSorted {
    static int searchPivot(int[] arr){
        
        int s,e,m;
        s=0;e=arr.length-1;

        if (arr.length==0 || arr==null) return -1;
        if (arr[s]<arr[e]) return e;
        while (s<=e) {
            m=s+(e-s)/2;
            if (arr.length==1) return 0;
            if (arr[m]==arr[e] && arr[m]==arr[s]) {s++;e--;}
            if(m<e && arr[m]>arr[m+1]) return m;
            if (m>s && arr[m]<arr[m-1]) return m-1;
            if (arr[m]>arr[s]) s=m+1;
            else if (arr[m]<arr[s]) e=m-1;
            else{
                if (s!=m && arr[s]==arr[m]) s++;
                if (e!=m && arr[e]==arr[m]) e--;
            }
        }
        return e;
    }
    
    //  Count the no of rotations in RSA
    static int countRotations(int[] arr){
        
        int s,e,m;
        s=0;e=arr.length-1;

        if (arr.length==0 || arr==null) return -1;
        if (arr[s]<arr[e]) return e;
        while (s<=e) {
            m=s+(e-s)/2;
            if(m<e && arr[m]>arr[m+1]) return m;
            if (m>s && arr[m]<arr[m-1]) return m-1;
            if (arr[m]>arr[s]) s=m+1;
            else if (arr[m]<arr[s]) e=m-1;
            else{
                if (s!=m && arr[s]==arr[m]) s++;
                if (e!=m && arr[e]==arr[m]) e--;
            }
        }
        return -1;
    }


    static int search(int[] arr, int target){

        int s=0, e=arr.length-1, m;
        int first=-1;
        int pivot=searchPivot(arr);
        
        if (arr[pivot]==target) return pivot;
        if (arr[s] > target) s=pivot+1;
        else e=pivot-1;

        System.out.println("start: "+s+" end: "+e);
        while(s<=e){
            m=s+(e-s)/2;
            if (arr[m]==target){
                first = m;
                e = m-1;
                continue;
            }
            if (arr[m]>target) e=m-1;
            else s=m+1;
        }
        return first;
    }

    public static void main(String[] args) throws IOException{
        int [] arr={6,7,8,9,10,2,2,2,2,2,2,3,4,5};
        int pivot=searchPivot(arr);
        int count=countRotations(arr)+1;
        System.out.println("The array is rotated "+count+" times.");
        if (pivot==-1) {System.out.println("No pivot found.Stopping"); return;}
        System.out.println("The pivot is at index: "+pivot);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the element u wanna search: ");
        int target = Integer.parseInt(br.readLine());
        System.out.println("The target is found at index: "+search(arr, target));
    }
}
