package util;

import java.util.ArrayList;
import core.Position;
import entity.*;
import core.Box;

public class PositionUtil {

    public void displayCurrPos(ArrayList<ArrayList<Box>> board){

        String piecename ;

        for (int i = 0; i < board.size(); i++) {
            for (int j = 0; j < board.get(i).size(); j++) {

                if(board.get(i).get(j).getPiece() != null)
                     piecename = board.get(i).get(j).getPiece().name();
                else
                     piecename = "null";

                System.out.print(board.get(i).get(j).getPos() +"-"+ piecename + " ");
            }
            System.out.println();
        }


    }

        public PieceIntf getInitialPiece(Position pos, String tempPos) { 
    
            switch (pos.getRow()) {
                case 7: {PieceIntf p = new Pawn(tempPos); return p;}
                case 2: {PieceIntf p = new Pawn(tempPos); return p;}
                case 3: {return null;}
                case 4: {return null;}
                case 5: {return null;}
                case 6: {return null;}
                case 1: {
                    switch (pos.getCol()) {
                        case 65: {PieceIntf p = new Rook(tempPos); return p;}
                        case 72: {PieceIntf p = new Rook(tempPos); return p;}
                        case 66: {PieceIntf p = new Knight(tempPos); return p;}
                        case 71: {PieceIntf p = new Knight(tempPos); return p;}
                        case 67: {PieceIntf p = new Bishop(tempPos); return p;}
                        case 70: {PieceIntf p = new Bishop(tempPos); return p;}
                        case 68: {PieceIntf p = new King(tempPos); return p;}
                        case 69: {PieceIntf p = new Queen(tempPos); return p;}
                        default:  {return null;}
                        }
                    }               
               
                default: {
                    switch (pos.getCol()) {
                        case 65: {PieceIntf p = new Rook(tempPos); return p;}
                        case 72: {PieceIntf p = new Rook(tempPos); return p;}
                        case 66: {PieceIntf p = new Knight(tempPos); return p;}
                        case 71: {PieceIntf p = new Knight(tempPos); return p;}
                        case 67: {PieceIntf p = new Bishop(tempPos); return p;}
                        case 70: {PieceIntf p = new Bishop(tempPos); return p;}
                        case 68: {PieceIntf p = new King(tempPos); return p;}
                        case 69: {PieceIntf p = new Queen(tempPos); return p;}
                        default:  {return null;}
                    }
                }
            }
        }
    
}
