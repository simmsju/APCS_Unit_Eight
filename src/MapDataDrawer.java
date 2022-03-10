import java.util.*;
import java.io.*;
import java.awt.*;

public class MapDataDrawer {

    private int[][] grid;

    public MapDataDrawer(String filename, int rows, int cols) throws FileNotFoundException {
        Scanner s = new Scanner(new File(filename));
        // initialize grid
        grid = new int[rows][cols];
        //read the data from the file into the grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = s.nextInt();
            }
        }
    }

    /**
     * @return the min value in the entire grid
     */
    public int findMinValue() {
        int min = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] < min) {
                    min = grid[i][j];
                }
            }
        }
        return min;
    }

    /**
     * @return the max value in the entire grid
     */
    public int findMaxValue() {
        int max = grid[0][0];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > max) {
                    max = grid[i][j];
                }
            }
        }
        return max;
    }

    /**
     * @param col the column of the grid to check
     * @return the index of the row with the lowest value in the given col for the grid
     */
    public int indexOfMinInCol(int col) {
        int min = grid[0][col];
        int index = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][col] < min) {
                min = grid[i][col];
                index = i;
            }
        }
        return index;
    }

    /**
     * Draws the grid using the given Graphics object.
     * Colors should be grayscale values 0-255, scaled based on min/max values in grid
     */
    public void drawMap(Graphics g) {
        int max = findMaxValue();
        int min = findMinValue();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int grayValue = (int) ((((double) grid[i][j] - min) / (max - min) * 255) + 0.5);
                g.setColor(new Color(grayValue, grayValue, grayValue));
                g.fillRect(j, i, 1, 1);
            }
        }
    }

    /**
     * Find a path from West-to-East starting at given row.
     * Choose a foward step out of 3 possible forward locations, using greedy method described in assignment.
     *
     * @return the total change in elevation traveled from West-to-East
     */
    public int drawLowestElevPath(Graphics g, int row) {
        int place = row;
        int up;
        int front;
        int down;
        int temp;
        int change = 0;
        int tempPast;
        g.fillRect(0, place, 1, 1);

        for (int i = 1; i < grid[0].length; i++) {
            tempPast = grid[place][i - 1];
            if (place == 0) {
                front = grid[place][i];
                down = grid[place + 1][i];
                if (down < front) {
                    place++;
                }
            } else if (place == grid.length - 1) {
                up = grid[place - 1][i];
                front = grid[place][i];
                if (up < front) {
                    place--;
                }
            } else {
                up = grid[place - 1][i];
                front = grid[place][i];
                down = grid[place + 1][i];
                if (up < front && up < down) {
                    place--;
                } else if (down < front && down < up) {
                    place++;
                } else if(up == down && up < front) {
                    if (Math.random() > .5) {
                        place--;
                        System.out.println("TIE: UP");
                    } else {
                        place++;
                        System.out.println("TIE: DOWN");
                    }
                }
            }
            temp = grid[place][i];
            change += Math.abs(temp - tempPast);
            g.fillRect(i, place, 1, 1);
        }
        return change;
    }

    /**
     * @return the index of the starting row for the lowest-elevation-change path in the entire grid.
     */
    public int indexOfLowestElevPath(Graphics g){
        int min = drawLowestElevPath(g, 0);
        int minIndex = 0;
        int temp;
        for (int i = 1; i < grid.length; i++) {
            temp = drawLowestElevPath(g, i);
            if (temp < min) {
                min = temp;
                minIndex = i;
            }
        }
        return minIndex;
    }

    public int[][] getGrid() {
        return grid;
    }
}