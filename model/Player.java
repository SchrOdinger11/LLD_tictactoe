package model;

public class Player {
    String name;
    Piece pieceType;
    public Player(String name, Piece o){
        this.name = name;
        this.pieceType = o;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Piece getPieceType(){
        return pieceType;
    }   
}
