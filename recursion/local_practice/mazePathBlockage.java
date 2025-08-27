package recursion.local_practice;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class mazePathBlockage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the destination...");
        System.out.print("DestRow: ");
        int destRow = Integer.parseInt(br.readLine());
        System.out.print("DestCol: ");
        int destCol = Integer.parseInt(br.readLine());
        System.out.print("\nEnter the no of blockages: ");
        int n = Integer.parseInt(br.readLine());
        ArrayList<int[]> blockage = new ArrayList<>();
        for(int i=0; i<n; i++){
            System.out.print("Blockage Row "+i+1+": ");
            int r = Integer.parseInt(br.readLine());
            System.out.print("Blockage Col "+i+1+": ");
            int c = Integer.parseInt(br.readLine());
            if((r-destRow + c-destCol) > 0 ) continue;
            if(r==destRow && c == destCol) {System.out.println("Cant proceed blockage and destination r the same"); return;}
            blockage.add(new int[]{r, c});
        }
        System.out.printf("\nThe destination is : {%d,%d}\n",destRow,destCol);
        System.out.println("The blockages are at locations: ");
        System.out.println(blockage.stream().map(Arrays::toString).toList());
        pathBlockMaze(destRow, destCol, blockage);
        br.close();
    }

    private static void pathBlockMaze(int dRow, int dCol, ArrayList<int[]> blockages) {
        if (dCol == 0 && dRow == 0) return;
        String result = "";
        helperBlock(dRow, dCol, blockages, result);
    }

    private static void helperBlock(int dRow, int dCol,  ArrayList<int[]> blockages,String result){
        if( dCol ==0 && dRow == 0) {
            System.out.println("(0,0)"+result);
            return;
        }
        for(int i=0; i<blockages.size(); i++){
            if (dRow == blockages.get(i)[0] && dCol == blockages.get(i)[1]) return;

        }
        String cell = "->("+dRow+","+dCol+")";

        if (dRow>0) helperBlock(dRow - 1, dCol, blockages, cell + result);
        if (dCol>0) helperBlock(dRow, dCol - 1, blockages, cell + result);
    }
}