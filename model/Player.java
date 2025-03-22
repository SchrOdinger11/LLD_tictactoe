package model;

public class Player {
    String name;
    PieceType pieceType;
    public Player(String name, PieceType o){
        this.name = name;
        this.pieceType = o;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public PieceType getPieceType(){
        return pieceType;
    }   
}
