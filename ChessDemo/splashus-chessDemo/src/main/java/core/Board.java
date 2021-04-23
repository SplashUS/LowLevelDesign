package core;
import java.util.*;

import entity.*;
import util.PositionUtil;

public class Board{
    
    ArrayList<ArrayList<Box>> board = new ArrayList<ArrayList<Box>> ();
    PositionUtil display = new PositionUtil();
    PieceIntf piece;
    
    public Board (){
        Box currentBox;
        
        for (int i = 1 ; i <= 8; i++) {
            ArrayList<Box> boardrow   = new ArrayList<Box> ();
            for (int j = 65; j <=72; j++) {
                String row = String.valueOf(i);
                String column = String.valueOf((char) j);
                StringBuffer pos = new StringBuffer();
                pos.append(row);
                pos.append(column);
                String tempPos = pos.toString();
                piece= display.getInitialPiece(new Position(i,j), tempPos);           
                
                currentBox = new Box(tempPos,piece);
                boardrow.add(currentBox);
            }
            board.add(boardrow);
        }

         display.displayCurrPos(board);

        
    }
    


    public void start() {

        boolean isWhite=true;
        while(gameIsNotOver()){
            if(isWhite){        
                //getCurrPiece(getUserInput("White"));

               // getCurrPiece(getCurrPos(getUserInput("White")));

               // getCurrPiece(getUserInputTargetPos());

                move( getCurrPiece(getCurrPos(getUserInput("White"))) , getCurrPiece(getUserInputTargetPos()) );         
                


                isWhite=false;

        }
        else{           

            move( getCurrPiece(getCurrPos(getUserInput("Black"))) , getCurrPiece(getUserInputTargetPos()) );   

            isWhite=true;
        }
       
            
        }


    }



    private void move(Box currPiece, Box TarPiece) {
        if(isValidMove());
        System.out.println("move done..........");
    }



    private boolean isValidMove() {
        return true;        
    }



    private Position getUserInputTargetPos() {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.println("Enter the Tagert Position: ");  
        return getCurrPos(sc.next());
    }



    private Position getCurrPos(String userInput) {

        Position position = new Position();
        
        int row=Integer.parseInt(userInput.substring(0,1)) - 1;
        int col=(int)userInput.charAt(1) - 65;

        position.setRow(row);
        position.setCol(col);

        return position;

    }

    private Box getCurrPiece(Position position) {

        Box currentBox;
      //  System.out.println("Current piece here is:" + this.board.get(position.getRow()).get(position.getCol()).getPiece().name());
        currentBox = new Box(this.board.get(position.getRow()).get(position.getCol()).getPos(),this.board.get(position.getRow()).get(position.getCol()).getPiece());

        return currentBox;

     }


    private boolean gameIsNotOver() {
        return true;
    }



    private String getUserInput(String Color) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
        System.out.println("*******Its the turn of "+Color+" Player*******");
        System.out.println("Enter the Position of the Piece you want to move: ");  
        String a= sc.next();  
     //   sc.close();
        return a;
    }

}
