package entity;
import static constants.Piecename.*;
public class Queen implements PieceIntf{

    private String currentPos;
    
    public Queen(String pos) {
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
    @Override
    public String name() {        
        return QUEEN;
    }

    
}
