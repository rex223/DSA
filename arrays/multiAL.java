package arrays;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class multiAL {
    public static void main(String[] args) throws IOException {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        System.out.println(list);
        //if we try to directly add another elements using list properties it will show error as until initialization it works like 1D
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number for initialization of rows: ");
        int n=Integer.parseInt(br.readLine());
        
        System.out.print("Enter the number of columns: ");
        int m=Integer.parseInt(br.readLine());
        // intitalization of the arraylist
        // NOTE: if array list is not initialized for multi dimension itr will show error as there is no list inside the aray list
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        // adding of elements in that initialized list
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("Enter the element for index [%d][%d]: ",i,j);
                list.get(i).add(Integer.parseInt(br.readLine()));
            }
        }
        for (ArrayList<Integer> arr : list) {
            System.out.println(arr);
        }
    }
}
