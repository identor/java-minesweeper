/*
 * A Datastrucutre representing a Minesweeper board. A board will be a two
 * Dimensional character array which contains character elements representing a
 * single state, states and their corresponding character representation are
 * seen in the table below.
 * 
 *    Character   |         State
 * -------------------------------------------
 *       -        |  Hidden empty
 * -------------------------------------------
 *       *        |  Hiden mine
 * -------------------------------------------
 *       #        |  Revealed mine
 * -------------------------------------------
 *     0 - 8      |  Opened, a mine is near
 */
package minesweeper;

/**
 *
 * @author irvin
 */
public class Board {
    private char [][] board;
    private int mineCount;

    public Board (int width, int height, int mineCount) {
        this.board = new char[height][width];
        this.mineCount = mineCount;
    }

    public int getHeight() {
        return this.board.length;
    }

    public int getWidth() {
        return this.board[0].length;
    }

    public int getMineCount() {
        return this.mineCount;
    }

    /**
     * Get User View - The table will contain these characters `-` or `0-8`,
     * 
     * `-` will represent an unopened cell
     * `0-8` will represent an opened cell
     * 
     * @return A two dimensional character array representing the board as
     *         viewed by the user.
     */
    public char[][] getUserView() {
        return new char[0][0];
    }

    /**
     * Place Mines
     * 
     * Randomly place mines in the `board`.
     */
    private void placeMines() {
        
    }
}
