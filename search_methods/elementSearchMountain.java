package search_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class elementSearchMountain {
    static int[] search (int[] arr,int target){
        int ans1=-1,ans2=-1;
        int[] ans;
        int peak=peakIndexMountain.peakIndexArray(arr);
        if (target==arr[peak]) return new int[]{peak};
        int s1=0,s2=arr.length-1,e=peak;
        //ascending part of the array
        while (s1<=e) {
            int m=s1+(e-s1)/2;
            if (arr[m]>target) {
                e=m-1;
            }else if (arr[m]<target) {
                s1=m+1;
            }else{
                ans1=m;
                break;
            }
        }
        ++peak;
        while (peak<=s2) {
            int m = peak+(s2-peak)/2;
            if (arr[m]<target) {
                s2=m-1;
            }else if (arr[m]>target) {
                peak=m+1;
            }else{
                ans2=m;
                break;
            }
        }
        ans=new int[]{ans1,ans2};
        return ans1!=-1&&ans2!=-1?ans:ans1!=-1?new int[]{ans1}:ans2!=-1?new int[]{ans2}:ans;
    }
    public static void main(String[] args) throws IOException {
        int[] arr={1,2,3,4,5,6,4,3,2,1};
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the element u wanna search: ");
        int target=Integer.parseInt(br.readLine());
        System.out.println("The target "+target+" is at index "+Arrays.toString(search(arr, target)));
    }
}
