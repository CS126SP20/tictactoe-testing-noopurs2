package student.tictactoe;

import student.tictactoe.TicTacToe;
import student.tictactoe.Evaluation;

import org.junit.Test;
import static org.junit.Assert.*;


public class TicTacToeTest {

    @Test
    public void simpleNullBoard() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard(null));
    }

    @Test
    public void simpleEmptyBoard() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard(""));
    }

    @Test
    public void simpleNoWinnerBoard() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O...X.X.."));
    }


    @Test
    public void simpleTieBoardOne() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("OXOXXOOOX"));
    }

    @Test
    public void XRowWinnerBoard() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XXXOXOOOX"));
    }

    @Test
    public void XColumnWinnerBoard() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XOOX..X.."));
    }

    @Test
    public void XDiagonalWinnerBoard() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XO..XO..X"));
    }

    @Test
    public void ORowWinnerBoard() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("OoOXXOOXX"));
    }

    @Test
    public void OColumnWinnerBoard() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("OXXOXOOOX"));
    }

    @Test
    public void ODiagonalWinnerBoard() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("OXXXOOXOO"));
    }

    @Test
    public void InvalidInputBoard() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard("XXXXXOXXX"));
    }

    @Test
    public void InvalidInputNumbersBoardOne() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard("123456789"));
    }

    @Test
    public void UnreachableStateTwoWinsBoard() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("XXXOOO..."));
    }

    @Test
    public void ODiagonalWinnerBoardChecksExtraCharac() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard("OXXXOOXOOO"));
    }
}