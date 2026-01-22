public class ZombieInfection {
    public static void main(String[] args) {
        //  0 = Empty, 1 = Wall, 2 = Zombie
        int[][] grid = {
            {0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0},
            {1, 1, 1, 1, 0},
            {2, 0, 0, 0, 0}
        };

        System.out.println("Grid before infection:");
        printGrid(grid);
        infect(grid, 2, 0);

        System.out.println("\nGrid after infection:");
        printGrid(grid);
    }

    public static void infect(int[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;
        // 1. Base Case
        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] != 0) {
            return;
        }
        // 2. Infect the current tile
        grid[r][c] = 2;
        // 3. Recursive calls for 4 directions
        infect(grid, r + 1, c); // Down
        infect(grid, r - 1, c); // Up
        infect(grid, r, c + 1); // Right
        infect(grid, r, c - 1); // Left
    }

    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            for (int tile : row) {
                System.out.print(tile + " ");
            }
            System.out.println();
        }
    }
}
