package core;
public class Pawn implements Piece{
    private String currentPos;
    
    public Pawn(String pos) {
        this.currentPos = pos;
    }
    public void move(String moveToPos) {
        if (isValidMove()) {
            movePawn(moveToPos);
        }
        else {
            //handle otherwise case
        }
    }
    private void movePawn(String moveToPos) {
        this.currentPos = moveToPos;
    }
    private boolean isValidMove() {
        return false;
    }

    
}