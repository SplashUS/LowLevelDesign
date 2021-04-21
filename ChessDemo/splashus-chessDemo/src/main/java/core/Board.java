package core;
import java.util.*;

import entity.Bishop;
import entity.King;
import entity.Knight;
import entity.Pawn;
import entity.PieceIntf;
import entity.Queen;
import entity.Rook;

public class Board{
    
    ArrayList<ArrayList<Box>> board = new ArrayList<ArrayList<Box>> ();
    PieceIntf piece;
    
    public Board (){
        
        for (int i = 1 ; i <= 8; i++) {
            ArrayList<Box> boardrow   = new ArrayList<Box> ();
            for (int j = 65; j <=72; j++) {
                String row = String.valueOf(i);
                String column = String.valueOf((char) j);
                StringBuffer pos = new StringBuffer();
                pos.append(row);
                pos.append(column);
                String tempPos = pos.toString();
                piece= getInitialPiece(i, j, tempPos);           
                
                Box currentBox = new Box(tempPos,piece);
                boardrow.add(currentBox);
            }
            board.add(boardrow);
        }

        displayCurrPos(board);
        
    }
    


    public PieceIntf getInitialPiece(int row, int column, String tempPos) { 

        switch (row) {
            case 7: {PieceIntf p = new Pawn(tempPos); return p;}
            case 2: {PieceIntf p = new Pawn(tempPos); return p;}
            case 3: {return null;}
            case 4: {return null;}
            case 5: {return null;}
            case 6: {return null;}
            case 1: {
                switch (column) {
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
                switch (column) {
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
}
