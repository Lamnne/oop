// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid is the charGrid copy.
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
        int row = grid.length;
        int col = grid[0].length;
        int rowMin = row;
        int colMin = col;
        int rowMax = -1;
        int colMax = -1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == ch) {
                    if (i < rowMin) {
                        rowMin = i;
                    }
                    if (i > rowMax) {
                        rowMax = i;
                    }
                    if (j < colMin) {
                        colMin = j;
                    }
                    if (j > colMax) {
                        colMax = j;
                    }
                }
            }
        }
        if (rowMax == -1) {
            return 0;
        }
        return (rowMax - rowMin + 1) * (colMax - colMin + 1);
	}

    /**
     * used to calculate length of (i,j) follow (di,dj).
     * @param i is row.
     * @param j is column.
     * @param di is row direction.
     * @param dj is column direction.
     * @param ch is the character being considered.
     * @return length of arm.
     */
    private int aLength(int i, int j, int di, int dj, char ch) {
        int len = 0;
        int r = i + di, c = j + dj;
        while (r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] == ch) {
            len ++;
            r += di;
            c += dj;
        }
        return len;
    }

	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
        int row = grid.length;
        int col = grid[0].length;
        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == ' ') {
                    continue;
                }
                int up = aLength(i, j, -1, 0, grid[i][j]);
                int down = aLength(i, j, 1, 0, grid[i][j]);
                int right = aLength(i, j, 0, 1, grid[i][j]);
                int left = aLength(i, j, 0, -1, grid[i][j]);
                if (up >= 2 && up == down && up == left && up == right) {
                    ans ++;
                }
            }
        }
        return ans;
	}
}
