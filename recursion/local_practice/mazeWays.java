package recursion.local_practice;

public class mazeWays {
    public static void main(String[] args) {
        int ans = waysCount(3,3);
        System.out.println("The no of ways to go to the position is : "+ans);
    }

    private static int waysCount(int row, int col){
        if (row == 1 || col == 1) return 1;
        int left = waysCount(row - 1, col);
        int right = waysCount(row, col - 1);
        return left + right;
    }
}
