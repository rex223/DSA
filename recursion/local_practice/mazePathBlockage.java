package recursion.local_practice;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class mazePathBlockage{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the no of blockages: ");
        int n = Integer.parseInt(br.readLine().trim());

        System.out.print("Enter the destination (row column): ");
        String[] destTokens = br.readLine().trim().split("\\s+");
        int destRow = Integer.parseInt(destTokens[0]);
        int destCol = Integer.parseInt(destTokens[1]);

        ArrayList<int[]> blockages = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            System.out.println("Blockage " + (i+1) + ":");
            System.out.print("Enter row: ");
            int r = Integer.parseInt(br.readLine().trim());
            System.out.print("Enter column: ");
            int c = Integer.parseInt(br.readLine().trim());
            blockages.add(new int[]{r, c});

        }
        if (blockages.isEmpty()) {
            System.out.println("No blockages");
        } else {
            System.out.println(Arrays.deepToString(blockages.toArray()));
        }
        pathBlockMaze(destRow, destCol);

        br.close();
    }

    private static void pathBlockMaze(int row, int col){
        if(row == 0 && col == 0) return;
        String result = "";
        // helperBlock(row, col, )
    }
}