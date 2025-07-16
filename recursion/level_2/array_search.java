package recursion.level_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class array_search {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the element you want to search for in the array: ");
        int n = Integer.parseInt(br.readLine());
        int[] arr = {9,5,6,7,2,5,3,4,4,4,4,4,3};
        System.out.print("The element is found at index: ");
        search_element(arr, n, 0);
        System.out.println();
        ArrayList<Integer> ans = search(arr, n, 0);
        System.out.println("Element is found at :"+ans);
    }
    static void search_element(int[] arr, int element, int i){
        if(i==arr.length) return;
        if(arr[i]==element) System.out.print(" " + i);
        search_element(arr, element, i + 1);
    }
    static ArrayList<Integer> search(int[] arr, int element, int index){
        ArrayList<Integer> ans = new ArrayList<>();
        if(index == arr.length) return ans;
        if (arr[index] == element) ans.add(index);
        ArrayList<Integer> next = search(arr, element, index + 1);
        ans.addAll(next);
        return ans;
    }
}