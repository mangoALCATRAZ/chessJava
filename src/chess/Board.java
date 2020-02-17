/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.util.*;
/**
 *
 * @author woah dude
 */
public class Board {
    private Map<String, Square> boardList = new HashMap<>();
    
    public Board(){
        boolean colorSwitch = true; /// true for white, false for black
        int y = 0;
        char x = 0;
        for(int i = 0; i < 8; i++){
            switch(i){
                case 0:
                    y = 8;
                    break;
                case 1:
                    y = 7;
                    break;
                case 2:
                    y = 6;
                    break;
                case 3:
                    y = 5;
                    break;
                case 4:
                    y = 4;
                    break;
                case 5:
                    y = 3;
                    break;
                case 6:
                    y = 2;
                    break;
                case 7:
                    y = 1;
                    break;
            }
                    
            for(int j = 0; j < 8; j++){
                switch(j){
                    case 0:
                        x = 'a';
                        break;
                    case 1:
                        x = 'b';
                        break;
                    case 2:
                        x = 'c';
                        break;
                    case 3:
                        x = 'd';
                        break;
                    case 4:
                        x = 'e';
                        break;
                    case 5:
                        x = 'f';
                        break;
                    case 6:
                        x = 'g';
                        break;
                    case 7:
                        x = 'h';
                        break;
                }
                Square newSquare = new Square();
                newSquare.setColor(colorSwitch);
                colorSwitch = toggleBool(colorSwitch);
                String outCoord = x + Integer.toString(y);
                newSquare.setCoord(outCoord);
                
                boardList.put(outCoord, newSquare);
            }
        }
    }
    
    
    
    /*
    public ArrayList<Piece> setUp(boolean inColor){ // true for white, false for black
        ArrayList<Piece> ret = new ArrayList<>();
        char x = 'a';
        int y = 0;

        // pawns set up
        for(int i = 0; i < 8; i++){
            Map<Character, Integer> pawnCoord = new HashMap<>();
            pawnCoord.put(x, 2);
            
            String name;
            if(inColor == true){
                name = "whitePawn" + (i + 1);
            }
            else{
                name = "blackPawn" + (i + 1);
            }
            Piece thisPawn = new Pawn(name, "pawn", inColor, pawnCoord);
            x++;
            if(inColor == true){
                y = 6;
            }
            else{
                y = 1;
            }
            
            boardArr[y][i].setOccupyingPiece(thisPawn);
            
            ret.add(thisPawn);
        }
        // rook set up
        if(inColor == true){
            y = 7;
        }
        else{
            y = 0;
        }
        int increm = 1;
        while(increm < 3){
            if(increm == 1){
                x = 'a';
            }
            else{
                x = 'h';
            }
            Map<Character, Integer> thisCoord = new HashMap<>();
            thisCoord.put(x, y);
            Piece rook = new Rook()
        }
        
        
        return ret;
    } */
    
   
    
    
    /* public Map<Integer, Integer> getIndex(Map<Character, Integer> inMap){ // null if error
        Map<Integer, Integer> ret = new HashMap<>();
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(boardArr[i][j].getCoord().equals(inMap)){
                    ret.put(i, j);
                    return ret;
                }
            }
        }
        return null;
    }
    */
    
    
    
    public Square findByCoord(String inCoord){ // error if return null
        Square ret;
        
        if(boardList.containsKey(inCoord)){
            ret = boardList.get(inCoord);
            return ret;
        }
        
        
        return null;
    }
    public static boolean toggleBool(boolean in){
 
        
        if(in == true){
            in = false;
        }
        else if(in == false){
            in = true;
        }
        return in;
    }
    public Map<String, Square> getBoardList(){
        return boardList;
    }
}
