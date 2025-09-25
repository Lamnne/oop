//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {
    private boolean[][] grid;
    /**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
	}
	
	
	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
        int row = grid[0].length;
        int col = grid.length;
        int y = 0;
        for (int i = 0; i < row; i++) {
            boolean full = true;
            for (int j = 0; j < col; j++) {
                if (!grid[j][i]) {
                    full = false;
                    break;
                }
            }
            if (!full) {
                for (int j = 0; j < col; j++) {
                    grid[j][y] = grid[j][i];
                }
                y++;
            }
        }
        for (int i = y; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[j][i] = false;
            }
        }
	}
	
	/**
	 * Returns the internal 2d grid array.
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid;
	}
}
