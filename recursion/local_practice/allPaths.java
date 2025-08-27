package recursion.local_practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class allPaths{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the following: ");
        // System.out.print("Row: ");
        // int destRow = Integer.parseInt(br.readLine());
        // System.out.print("\nColumn: ");
        // int destCol = Integer.parseInt(br.readLine());
        int[][] arr = new int[2][2];
        for (int i=0; i<2; i++){
            if(i == 0){
                System.out.println("Enter array size for Row: ");
                arr[0][0] = Integer.parseInt(br.readLine().trim());
                System.out.println("Enter array size for Col: ");
                arr[0][1] = Integer.parseInt(br.readLine().trim());
            }else{
                System.out.println("Enter destination: ");
                System.out.print("Destination Row: ");
                arr[1][0]  = Integer.parseInt(br.readLine().trim());
                System.out.print("Destination Col: ");
                arr[1][1]  = Integer.parseInt(br.readLine().trim());
            }
        }
        System.out.println("The size and destination respectively are: "+Arrays.deepToString(arr));

        // System.out.printf("The destination coordinates are : {%d,%d}",destA);
        allPath(arr);
        br.close();
    }

    private static void allPath(int[][] arr){
        if( arr[0][0] <=0 && arr[0][1] <= 0) return;
        if( arr[1][0] <=0 && arr[1][1] <= 0) return;
        boolean[][] visited = new boolean[arr[0][0]][arr[0][1]];
        String result = "";
        int destRow = arr[1][0];
        int destCol = arr[1][1];
        helperAllPath(arr, visited, destRow, destCol, result); 
    }

    private static void helperAllPath(int[][] arr, boolean[][] visited, int destRow, int destCol, String result){
        if(destCol < 0 || destRow < 0 || destRow >= arr[0][0] || destCol >= arr[0][1]) return;
        if (visited[destRow][destCol]) return;
        
        String ans ="->"+"("+destRow+","+destCol+")";
        if (destRow == 0 && destCol == 0){
            System.out.println("(0,0)->"+result.substring(2));
            return;
        }
        
        visited[destRow][destCol] = true;

        if (destRow > 0) helperAllPath(arr, visited, destRow-1, destCol, ans+result);
        if (destCol > 0) helperAllPath(arr, visited, destRow, destCol-1, ans+result);
        if (destRow < arr[0][0] - 1) helperAllPath(arr, visited, destRow+1, destCol, ans+result);
        if (destCol < arr[0][1] - 1) helperAllPath(arr, visited, destRow, destCol+1, ans+result);
        visited[destRow][destCol] = false;
    }
}