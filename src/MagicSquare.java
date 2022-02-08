public class MagicSquare {

    private int[][] grid;

    public MagicSquare(int[][] g) {
        grid = g;
    }


    public int rowSum(int row) {

        return 0;
    }


    public int colSum(int col) {

        return 0;
    }


    public int upDiagSum() {

        return 0;
    }


    public int downDiagSum() {

        return 0;
    }


    public boolean isMagicSquare() {

        return false;
    }


    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}
