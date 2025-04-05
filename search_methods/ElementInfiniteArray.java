package search_methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElementInfiniteArray {

    static int search(int[] arr,int target){
        int s=0,e=1,j = 0;
        int first=-1;
        while (true) {
            try {
                if (arr[e]>=target) {
                    break;
                }
                int s1=e+1;
                e=e+(e-s+1)*2;
                s=s1;
                
            } catch (Exception ex) {
                    e=e-(e-s+1)/2;
                    // s/=2;
                    if (s>=e) {
                        break;
                    }
            
            }
        }
        while (s<=e) {
            j=s+(e-s)/2;
            try {
                if (arr[j]==target) {
                    e=j-1;
                    first=j;
                }else if (arr[j]>target) {
                    e=j-1;
                }else{
                    s=j+1;
                }
                
            } catch (Exception ex) {
                e=j-1;
            }
        }
        return first;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = { 2, 3, 5, 5, 5, 5, 5, 9, 9, 9, 9, 11, 12, 23, 45, 65 };
        System.out.print("Enter the element u want to search: ");
        int target = Integer.parseInt(br.readLine());
        if (search(arr, target) == -1) {
            System.out.println("Element not found");
            return;
        }
        System.out.println("The element is at index: " + search(arr, target));
    }
}