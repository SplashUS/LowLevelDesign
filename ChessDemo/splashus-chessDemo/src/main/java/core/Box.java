package core;

public class Box {
    private String pos;
    private Piece piece;

    public Box (String pos, Piece piece) {
        this.pos = pos;
        this.piece = piece;
    }

    public void tryMove(String fromPos, String toPos) {

        this.piece.move(toPos);
    
    }

}
