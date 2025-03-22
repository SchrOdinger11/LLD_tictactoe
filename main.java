import model.board;

public class main {
    public static void main(String[] args) {
        board b=new board(3);
        game g=new game(b);
       
        g.start();
    }
                  
}
