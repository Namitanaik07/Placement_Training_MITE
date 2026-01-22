import java.util.Arrays;

public class ZigZagPrinter {
    public static void printVisual(String s, int numRows) {
        if (numRows == 1) {
            System.out.println(s);
            return;
        }

        int n = s.length();
        // A rough estimate for columns: the string length is always enough
        char[][] grid = new char[numRows][n];
        
        // Fill the grid with spaces initially
        for (char[] row : grid) Arrays.fill(row, ' ');

        int row = 0, col = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            grid[row][col] = c;
            if (row == 0 || row == numRows - 1) {
                goingDown = !goingDown;
            }

            if (goingDown) {
                row++;
            } else {
                row--;
                col++;
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= col; j++) {
                System.out.print(grid[i][j] + "  "); 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printVisual("PAYPALISHIRING", 3);
    }
}
