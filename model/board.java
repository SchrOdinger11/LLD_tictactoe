package model;

public class board {
    private PieceType[][] board;
    private int size;
    public board(int size){
        this.size = size;
        board = new PieceType[size][size];
    }
    public boolean setPiece(int x, int y, PieceType piece){
        if(board[x][y] != null){
            return false;
        }
        board[x][y] = piece;
        return true;
    }
    public PieceType getPiece(int x, int y){
        return board[x][y];
    }
    public int getSize(){
        return size;
    }
    public boolean isFull(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWinner(Player currentPlayer){
        for(int i = 0; i < size; i++){
            boolean win = true;
            for(int j = 0; j < size; j++){
                if(board[i][j] == null || board[i][j] != currentPlayer.getPieceType()){
                    win = false;
                    break;
                }
            }
            if(win){
                return true;
            }
        }
        for(int i = 0; i < size; i++){
            boolean win = true;
            for(int j = 0; j < size; j++){
                if(board[j][i] == null || board[j][i] != currentPlayer.getPieceType()){
                    win = false;
                    break;
                }
            }
            if(win){
                return true;
            }
        }
        boolean win = true;
        for(int i = 0; i < size; i++){
            if(board[i][i] == null || board[i][i] != currentPlayer.getPieceType()){
                win = false;
                break;
            }
        }
        if(win){
            return true;
        }
        win = true;
        for(int i = 0; i < size; i++){
            if(board[i][size - i - 1] == null || board[i][size - i - 1] != currentPlayer.getPieceType()){
                win = false;
                break;
            }
        }
        if(win){
            return true;
        }
        return false;
    }
   public void printBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == null){
                    System.out.print(" ");
                }else{
                    if(board[i][j] == PieceType.X){
                        System.out.print("X");
                    }else{
                        System.out.print("O");
                    }
                }
                
                if(j < board[i].length - 1){
                    System.out.print("|");
                }
            }
            System.out.println();
            if(i<board.length - 1){
                for(int j = 0; j < board[i].length; j++){
                    System.out.print("-");
                    if(j < board[i].length - 1){
                        System.out.print("+");
                    }
                }
            System.out.println();
        }}
      
    }
    public PieceType[][] getBoard(){
        return board;
    }   
   
}
