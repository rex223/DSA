package recursion.Subset;

import java.util.ArrayList;
import java.util.List;

public class arraySubset {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4 };
        List<List<Integer>> ans = subsetArrayDuplicate(arr);
        List<List<Integer>> ans1 = subsetSupreme(arr);
        // List<List<Integer>> ans1 = subsetArray(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
        System.out.println("\n");
        for (List<Integer> list : ans1) {
            System.out.println(list);
        }
        // System.out.println(ans);
    }

    static List<List<Integer>> subsetArray(int[] arr) {
        List<List<Integer>> left = new ArrayList<>();
        left.add(new ArrayList<>());
        for (int num : arr) {
            int size = left.size();
            for (int i = 0; i < size; i++) {
                List<Integer> right = new ArrayList<>(left.get(i));
                right.add(num);
                left.add(right);
            }
        }
        return left;
    }

    static List<List<Integer>> subsetArrayDuplicate(int[] arr) {
        List<List<Integer>> left = new ArrayList<>();
        left.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = left.size() - 1;
            int n = left.size();
            for (int j = start; j < n; j++) {
                List<Integer> right = new ArrayList<>(left.get(j));
                right.add(arr[i]);
                left.add(right);
            }
        }
        return left;
    }

    private static List<List<Integer>> subsetSupreme(int[] arr) {
        List<List<Integer>> left = new ArrayList<>();
        left. add(new ArrayList<>());
        int s = 0;
        int e = 0;
        for (int i=0; i<arr.length; i++){
            s=0;
            if(i>0 && arr[i]==arr[i-1]){
                s=e + 1;
            }
            e = left.size() - 1;
            int n = left.size();
            for (int j = s; j < n; j++) {
                List<Integer> right = new ArrayList<>(left.get(j));
                right.add(arr[i]);
                left.add(right);
            }

        }

        return left;
    }

}
