package recursion.level_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pattern_triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the no of rows you want: ");
        int rows = Integer.parseInt(br.readLine());
        System.out.println("The pattern is: ");
        printTriangle(rows, 1);
    }

    private static void printTriangle(int rows, int currentRow) {
        printSpace(rows, currentRow);
        if (currentRow > rows) return;
        printStars(currentRow);
        System.out.println();
        printTriangle(rows, currentRow + 1);
    }

    // Helper recursive function to print stars in a row
    private static void printStars(int count) {
        if (count == 0) return;
        System.out.print("* ");
        printStars(count - 1);
    }

    private static void printSpace(int rows,  int currentRow){
        if (currentRow >= rows) return;
        System.out.print(" ");
        printSpace(rows, currentRow + 1);
    }
}