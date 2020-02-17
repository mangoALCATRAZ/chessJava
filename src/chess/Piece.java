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
public abstract class Piece {
    private String name;
    private String type;
    private boolean color; // true for white, false for black
    
    
    public Piece(String inName, String inType, boolean inColor){

        
        type = inType;
        name = inName;
        color = inColor;
    }
    
    public abstract void move();
    
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public boolean getColor(){
        return color;
    }
    public String getCoord(Map<String, Piece> masterIn){
        char x = 'a';
        
        for(int i = 0; i < 8; i++){
            for(int y = 1; y < 9; y++){
                String thisCoord = x + Integer.toString(y);
                if(masterIn.containsKey(thisCoord)){
                    if(masterIn.get(thisCoord) == this){
                        return thisCoord;
                    }
                }
            }
            x++;
        }
        return null;
    }
    public void setName(String inName){
        name = inName;
    }
    public void setColor(boolean inColor){
        color = inColor;
    }
}
