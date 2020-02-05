package student.tictactoe;

import student.tictactoe.Evaluation;
/*
by Noopur Shanbhogue
cs 126
the test cases for tic tac toe
2.3.2020
 */
public class TicTacToe {
    /** this is the code for the board has different wins and cases**/
    public static Evaluation evaluateBoard(String boardState) {
        // check if string passed is null
        if (boardState == null) {
            return Evaluation.InvalidInput;
        }

        // given a boardstate that has less than 9 characters is an invalid input.
        if (boardState.length() != 9) {
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
        //the number of x's is more than os
        int diff = xCount - oCount;
        if (Math.abs(diff) > 1) {
            return Evaluation.InvalidInput;
        }

        //a board that does not have any x and o so all different characters
        if (xCount == 0 && oCount == 0) {
            return Evaluation.InvalidInput;
        }

        //k iterates through string and new board is created to convert string to array
        int k = 0;
        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ( k < str.length()){
                    board[i][j] = str.charAt(k);
                    k++;
                }
            }
        }

        //array that checks for Horizontal wins
        boolean xWin = false;
        boolean oWin = false;
        for (int m = 0; m < 3; m++) {
            if (board[m][0] == board[m][1] && board[m][1] == board[m][2]) {
                if (board[m][1] == 'X') {
                    xWin = true;
                } else if (board[m][1] == 'O') {
                    oWin = true;
                }
            }
        }

        //array checks for vertical wins
        for (int n = 0; n < 3; n++) {
            if (board[0][n] == board[1][n] && board[1][n] == board[2][n]) {
                if (board[0][n] == 'X') {
                    xWin = true;
                } else if (board[0][n] == 'O') {
                    oWin = true;
                }

            }
        }

        //array checks for diagonal wins
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            if (board[0][0] == 'X') {
                xWin = true;
            } else if (board[0][0] == 'O') {
                oWin = true;
            }
        }

        //array check for anti-diagonal
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            if (board[0][2] == 'X') {
                xWin = true;
            } else if (board[0][2] == 'O') {
                oWin = true;
            }
        }

        // check for wins and unreachable state using the enum
        if (oWin == true && xWin == true) {
            return Evaluation.UnreachableState;
        } else if (oWin == true) {
            return Evaluation.Owins;
        } else if (xWin == true) {
            return Evaluation.Xwins;
        }


        return Evaluation.NoWinner;
    }
}
