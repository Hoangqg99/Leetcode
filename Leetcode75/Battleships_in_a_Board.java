package Leetcode75;

public class Battleships_in_a_Board {
    public int countBattleships(char[][] board) {
        int m = board.length, n = board[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X') {
                    if ((i == 0 || board[i - 1][j] != 'X') &&
                            (j == 0 || board[i][j - 1] != 'X')) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Battleships_in_a_Board solution = new Battleships_in_a_Board();
        char[][] board = {
                { 'X', '.', '.', 'X' },
                { '.', '.', '.', 'X' },
                { '.', '.', '.', 'X' }
        };
        System.out.println(solution.countBattleships(board));
    }
}
