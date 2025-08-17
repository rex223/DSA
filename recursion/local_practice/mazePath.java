package recursion.local_practice;

public class mazePath {
    public static void main(String[] args) {
        pathMaze(2,2);
        System.out.println("\n");
        pathMazeDiagnoal(2,2);
    }

    private static void pathMaze(int row, int col){
        if (row ==0 && col==0) return;
        String result = "("+row+","+col+")";
        printPath(row, col, result);
        return;
    }

    private static void printPath(int row, int col, String result){
        if (row == 0 && col == 0) {
            System.out.println(result);
            return;
        }
        if (col > 0) printPath(row, col-1, result +"<-"+ "(" + row + "," + (col-1) + ")");
        if (row > 0) printPath(row-1, col, result +"<-"+ "(" + (row-1) + "," + col + ")");
    }
    private static void pathMazeDiagnoal(int row, int col){
        if (row ==0 && col==0) return;
        String result = "("+row+","+col+")";
        printPathDiagonal(row, col, result);
        return;
    }

    private static void printPathDiagonal(int row, int col, String result){
        if (row == 0 && col == 0) {
            System.out.println(result);
            return;
        }
        if (col>1 && row> 1) printPathDiagonal( row - 1, col - 1, "(" + (row-1) + "," + (col-1) +")"+"->"+result);
        if (col > 0) printPathDiagonal(row, col-1, "(" + row + "," + (col-1) + ")"+"->"+ result);
        if (row > 0) printPathDiagonal(row-1, col, "(" + (row-1) + "," + col + ")"+"->"+result);
    }
}