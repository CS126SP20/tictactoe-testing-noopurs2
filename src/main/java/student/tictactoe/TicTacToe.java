package student.tictactoe;

import student.tictactoe.Evaluation;
/*
by Noopur Shanbhogue
cs 126
the test cases for tic tac toe
2.3.2020
 */
public class TicTacToe {



    public static Evaluation evaluateBoard(String boardState) {
        // check if string passed is null
        if (boardState == null) {
            return Evaluation.InvalidInput;
        }

        // given an empty boardstate or boardstate that has less than 9 characters is an invalid input.
        if (boardState.length() == 0 || boardState.length() != 9) {
            return Evaluation.InvalidInput;
        }

        //convert all charac in string to uppercase to avoid confusion with  X,x,O, and o
        String str = boardState.toUpperCase();

        //find number of Xs and Os to verify whether input is valid (in tic tac toe # of x > 0
        int xCount = 0;
        int oCount = 0;

        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a) == 'X') {
                xCount++;
            } else if (str.charAt(a) == 'O') {
                oCount++;
            }
        }
        if (Math.abs(xCount - oCount) > 1) {
            return Evaluation.InvalidInput;
        }

        if (xCount == 0 && oCount == 0) {
            return Evaluation.InvalidInput;
        }


        int k = 0;  //k iterates through string and new board is created to convert string to array
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ( k < str.length()){
                    board[i][j] = str.charAt(k);
                    k++;
                }
            }
        }


        return Evaluation.NoWinner;
    }
}
