import java.util.Random;
import java.util.Scanner;

class TicTacToe {
    static char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        initBoard();
    }

    void initBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    static void dispBoard() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    static void placeMark(int row, int column, char mark) {
        if (row >= 0 && row < 3 && column >= 0 && column < 3) {
            board[row][column] = mark;
        } else {
            System.out.println("Invalid position");
        }
    }

    static boolean checkColWin() {
        for (int j = 0; j <= 2; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        return false;
    }

    static boolean checkRowWin() {
        for (int i = 0; i <= 2; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    static boolean checkDiagWin() {
        if ((board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
                || (board[0][2] != ' ' && board[2][0] == board[1][1] && board[1][1] == board[0][2])) {
            return true;
        } else {
            return false;
        }
    }

    static boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

abstract class Player{
    String name;
    char mark;

    abstract void makeMove();
    boolean isValidMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (TicTacToe.board[row][col] == ' ') {
                return true;
            }
            return false;
        }
        return false;
    }
}

class HumanPlayer extends Player {
    HumanPlayer(String name, char mark) {
        super.name = name;
        super.mark = mark;
    }

    void makeMove() {
        Scanner scan = new Scanner(System.in);
        int row, col;

        do {
            System.out.println("Enter the row and col");
            row = scan.nextInt();
            col = scan.nextInt();
        } while (!isValidMove(row, col));

        TicTacToe.placeMark(row, col, mark);
        
    }

   
}

class AIPlayer extends Player {

    AIPlayer(String name, char mark) {
        this.name = name;
        super.mark = mark;
    }

    void makeMove() {
        Scanner scan = new Scanner(System.in);
        int row, col;

        do {
            Random r = new Random(); 
            row = r.nextInt(3);
            col = r.nextInt(3);
        } while (!isValidMove(row, col));

        TicTacToe.placeMark(row, col, mark);     
    }

    boolean isValidMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            if (TicTacToe.board[row][col] == ' ') {
                return true;
            }
            return false;
        }
        return false;
    }
}

public class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        HumanPlayer player1 = new HumanPlayer("Kal", 'x');
        AIPlayer player2 = new AIPlayer("TabAi", 'o');

        Player curPlayer; // here it is reference for which player should go
        curPlayer = player1;

        while (true) {
            System.out.println(curPlayer.name + "'s turn");
            curPlayer.makeMove();
            TicTacToe.dispBoard();

            if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin()) {
                System.out.println(curPlayer.name + " wins!");
                break;
            } 
            else if (TicTacToe.checkDraw()) {
                System.out.println("It's a draw!");
                break;
            }

            if (curPlayer == player1) {
                curPlayer = player2;
            } else {
                curPlayer = player1;
            }
        }
    }
}
