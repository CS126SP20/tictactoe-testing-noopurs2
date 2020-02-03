package student.tictactoe;

import student.tictactoe.TicTacToe;
import student.tictactoe.Evaluation;

import org.junit.Test;
import static org.junit.Assert.*;


public class TicTacToeTest {
    @Test
    public void simpleNoWinnerBoard() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("O...X.X.."));
    }

    @Test
    public void simpleNoWinnerBoardOne() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("........."));
    }

    @Test
    public void simpleNoWinnerBoardTwo() throws Exception {
        assertEquals(Evaluation.NoWinner, TicTacToe.evaluateBoard("XOXOXXXOO"));
    }

    @Test
    public void XWinnerBoard() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("XXX......"));
    }

    @Test
    public void XWinnerBoardOne() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("X..X..X.."));
    }

    @Test
    public void XWinnerBoardTwo() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("X...X...X"));
    }

    @Test
    public void OWinnerBoard() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("OOO......"));
    }

    @Test
    public void OWinnerBoardOne() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("O..O..O.."));
    }

    @Test
    public void OWinnerBoardTwo() throws Exception {
        assertEquals(Evaluation.Owins, TicTacToe.evaluateBoard("O...O...O"));
    }

    @Test
    public void InvalidInputBoard() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard("XXXXXOXXX"));
    }

    @Test
    public void XWinnerBoardThree() throws Exception {
        assertEquals(Evaluation.Xwins, TicTacToe.evaluateBoard("X.Z-Xax!X"));
    }

    @Test
    public void InvalidInputBoardOne() throws Exception {
        assertEquals(Evaluation.InvalidInput, TicTacToe.evaluateBoard("123456789"));
    }

    @Test
    public void UnreachableStateBoard() throws Exception {
        assertEquals(Evaluation.UnreachableState, TicTacToe.evaluateBoard("XXXOOO..."));
    }
}