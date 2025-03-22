package model;

public class Piece {
    PieceType type;
    public Piece(PieceType type){
        this.type = type;
    }
    public PieceType getType(){
        return type;
    }
    public void setType(PieceType type){
        this.type = type;
    }
}
