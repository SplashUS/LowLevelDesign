package core;
import java.util.*;

public class Board{
    
    ArrayList<ArrayList<Box>> board = new ArrayList<ArrayList<Box>> ();
    Piece p;
    
    public Board (){
        for (int i = 1 ; i <= 8; i++) {
            for (int j = 65; j <=72; j++) {
                String row = String.valueOf(i);
                String column = String.valueOf((char) j);
                StringBuffer pos = new StringBuffer();
                pos.append(row);
                pos.append(column);
                String tempPos = pos.toString();
                p= getInitialPiece(i, j, tempPos);
                //Box currentBox = new Box();
            }
        }
        
    }
    


    public Piece getInitialPiece(int row, int column, String tempPos) {

        switch (row) {
            case 7: {Piece p = new Pawn(tempPos); return p;}
            case 2: {Piece p = new Pawn(tempPos); return p;}
            case 3: {return null;}
            case 4: {return null;}
            case 5: {return null;}
            case 6: {return null;}
            default: {
                switch (column) {
                    case 1: {return null;}
                    case 8: {return null;}
                    case 2: {return null;}
                    case 7: {return null;}
                    case 3: {return null;}
                    case 6: {return null;}
                    case 4: {return null;}
                    case 5: {return null;}
                    default:  {return null;}
                }
            }
        }


    }
}
