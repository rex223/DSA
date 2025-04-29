package sorting;

public class swap {
    static void swap(int[] arr,int i, int j){
        if (arr[i]==arr[j]) return;
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[j]^arr[i];
        arr[i]=arr[i]^arr[j];
    }
}