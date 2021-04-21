package core;

import entity.PieceIntf;

public class Box {
    private String pos;
    private PieceIntf piece;

    public Box (String pos, PieceIntf piece) {
        this.pos = pos;
        this.piece = piece;
    }

    public void tryMove(String fromPos, String toPos) {

        this.piece.move(toPos);
    
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public PieceIntf getPiece() {
        return piece;
    }

    public void setPiece(PieceIntf piece) {
        this.piece = piece;
    }



}
