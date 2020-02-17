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
public class Square {
    private boolean color; // trrue for white, false for black
    private String coord = new String();
    
    public void setColor(boolean inColor){
        // true for white, false for black
    
        color = inColor;
    }
    public void setCoord(String inCoord){
        coord = inCoord;
    }
    
    /*public void setOccupyingPiece(Piece inPiece){
        occupyingPiece = inPiece;
    }*/
    
    public boolean getColor(){ // true for white, false for black
        return color;
    }
    
    public String getCoord(){
        return coord;
    }
    public Piece getPieceHere(Map<String, Piece> inMasterList){ // null if error or not found
        if(inMasterList.containsKey(coord)){
            Piece ret = inMasterList.get(coord);
            return ret;
        }
        
        return null;
    }
}
