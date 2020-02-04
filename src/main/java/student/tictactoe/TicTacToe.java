package student.tictactoe;

import student.tictactoe.Evaluation;

public class TicTacToe {

    private int[][] board = new int[3][3];

    public static Evaluation evaluateBoard(String boardState) {
// given an empty board or baord that has less than 9 characters is an invalid input.
        if (boardState.length() == 0 || boardState.length() != 9) {
            return Evaluation.NoWinner;
        }

        return Evaluation.NoWinner;
    }
}
