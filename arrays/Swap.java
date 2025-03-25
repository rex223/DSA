package arrays;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Swap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.print("Enter the no of rows: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("initialized rows succesfully....\n");
        System.out.println(list);
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        System.out.print("Enter the no of columns : ");
        int m = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Enter the aray at [%d][%d]: ", i, j);
                list.get(i).add(Integer.parseInt(br.readLine()));
            }
        }
        for(ArrayList<Integer> arr: list) {
            System.out.println(arr);
        }
    }
}
