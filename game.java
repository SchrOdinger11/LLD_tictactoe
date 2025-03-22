import java.util.Deque;


import model.Player;
import model.board;
import model.PieceType;

public class game {
    private board board;
    private Deque<Player> players;

    public  game(board board) {
        this.board = board;
        players = new java.util.ArrayDeque<>();
        Player player1 = new Player("Player 1", PieceType.X);
        Player player2 = new Player("Player 2", PieceType.O);
        players.add(player1);
        players.add(player2);
    }

    public void start() {
        
        while (true) {
            Player currentPlayer = players.pollFirst();
            System.out.println("Current board:");
            board.printBoard();
            System.out.println(currentPlayer.getName() + "'s turn");
            System.out.println("Enter row:");
            int row = Integer.parseInt(System.console().readLine());
            System.out.println("Enter column:");
            int column = Integer.parseInt(System.console().readLine());
            if (board.setPiece(row, column, currentPlayer.getPieceType())) {
                board.printBoard();
                if (board.isWinner(currentPlayer)) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                }
                if (board.isFull()) {
                    System.out.println("It's a draw!");
                    break;
                }
               // currentPlayer = players.poll();
                players.addLast(currentPlayer);
            } else {
                board.printBoard();
                players.addFirst(currentPlayer);
                System.out.println("Invalid move");
            }
        }
    }
}