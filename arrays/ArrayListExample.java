package arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        // Create an ArrayList
        ArrayList<Integer> list=new ArrayList<>(5);
        list.add(67);
        list.add(267);
        list.add(367);
        list.add(6457);
        list.add(657);
        list.add(6217);
        list.add(67);
        list.add(6457);

        System.out.println(list);
        //even though we mentioned 10 we can add as many as we want

        list.set(0,99);
        list.remove(2);
        //addded and deleted element at list
        System.out.println(list);
        //print last element at list
        System.out.println(list.get(list.size()-1));
        //input using loop
        System.out.print("Enter the number of elements yuoo want to add in the array: ");
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        System.out.println(list);
        br.close();
    }
}
