package Backtracking;

public class MazeWithObstackles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println("All possible paths:");
        blocks("", 0, 0, board);
    }

    static void blocks(String p, int r, int c, boolean[][] maze) {
        // Base case: reached destination (bottom-right corner)
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        // Check if current position is out of bounds or blocked
        if (r >= maze.length || c >= maze[0].length || !maze[r][c]) {
            return;
        }
        // Move down (if possible)
        if (r < maze.length - 1) {
            blocks(p + "D", r + 1, c, maze);
        }
        // Move right (if possible)
        if (c < maze[0].length - 1) {
            blocks(p + "R", r, c + 1, maze);
        }
    }
}