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
public class Game {
    private Board gameBoard; // board object for this game
    private Map<String, Piece> masterList; // master list of board coordinates to pieces
    private List<Piece> pieceList; // master list of piece objects
    
    public Game(){
        gameBoard = new Board(); // initialize game board
        masterList = new HashMap<>();
        pieceList = new ArrayList<>();
    }
    public static char charIncrem(char in){
        char ret;
        switch(in){
            case 'a':
                ret = 'b';
                break;
            case 'b':
                ret = 'c';
                break;
            case 'c':
                ret = 'd';
                break;
            case 'd':
                ret = 'e';
                break;
            case 'e':
                ret = 'f';
                break;
            case 'f':
                ret = 'g';
                break;
            default:
                ret = 'h';
                break;
        }
        return ret;
    }
    
    public void printBoardTest(){
        char testX = 'a';

        
        System.out.println("\n\n[] for black spaces\n{} for white spaces\nP for pawn\nR for rook\nB for bishop\nN for knight\nQ for Queen\nK for King\n\n");
        
        for(int y = 1; y < 9; y++){
            for(int i = 0; i < 8; i++){
               String coord = testX + Integer.toString(y);
               Square thisSquare = gameBoard.findByCoord(coord);
               
               String pieceOut;
               if(masterList.get(coord) != null){
                    switch(masterList.get(coord).getType()){
                        case "pawn":
                            pieceOut = "P";
                            break;
                        case "rook":
                            pieceOut = "R";
                            break;
                        case "bishop":
                            pieceOut = "B";
                            break;
                        case "knight":
                            pieceOut = "N";
                            break;
                        case "queen":
                            pieceOut = "Q";
                            break;
                        case "king":
                            pieceOut = "K";
                            break;
                        default:
                            pieceOut = " ";
                            break;
                    }
               
                }
            
                else{
                    pieceOut = " ";
                }
               
                if(thisSquare.getColor() == true){
                    System.out.print("{" + pieceOut + "}");
                }
                else{
                    System.out.print("[" + pieceOut + "]");
                }
                
                testX = charIncrem(testX);
            }
            
            System.out.print("\n");
            testX = 'a';
        }
    }
    
    public void setUp(){
        // set up white pawns
        
        char pawnColumn = 'a';
        int two = 2;
        
        int pawnIncrem = 1;
        for(int i = 0; i < 8; i++){
            String name = "whitePawn" + pawnIncrem;
            String coord = pawnColumn + Integer.toString(two);
            Piece whitePawn = new Pawn(name, "pawn", true);
            
            pieceList.add(whitePawn);
            masterList.put(coord, whitePawn);
            
            pawnIncrem++;
            pawnColumn = charIncrem(pawnColumn);
        }
        
        //setup black pawns
        int seven = 7;
        pawnIncrem = 1;
        pawnColumn = 'a';
        for(int i = 0; i < 8; i++){
            String name = "blackPawn" + pawnIncrem;
            String coord = pawnColumn + Integer.toString(seven);
            Piece blackPawn = new Pawn(name, "pawn", false);
            
            pieceList.add(blackPawn);
            masterList.put(coord, blackPawn);
            
            pawnIncrem++;
            pawnColumn = charIncrem(pawnColumn);
        }
        
        //setup white rooks
        String whiteRook1Coord = "a1";
        Piece whiteRook1 = new Rook("whiteRook1", "rook", true);
        pieceList.add(whiteRook1);
        masterList.put(whiteRook1Coord, whiteRook1);
        
        String whiteRook2Coord = "h1";
        Piece whiteRook2 = new Rook("whiteRook2", "rook", true);
        pieceList.add(whiteRook2);
        masterList.put(whiteRook2Coord, whiteRook2);
        
        //setup black rooks
        String blackRook1Coord = "a8";
        Piece blackRook1 = new Rook("blackRook1", "rook", false);
        pieceList.add(blackRook1);
        masterList.put(blackRook1Coord, blackRook1);
        
        String blackRook2Coord = "h8";
        Piece blackRook2 = new Rook("blackRook2", "rook", false);
        pieceList.add(blackRook2);
        masterList.put(blackRook2Coord, blackRook2);
        
        //setup white knights
        String whiteKnight1Coord = "b1";
        Piece whiteKnight1 = new Knight("whiteKnight1", "knight", true);
        pieceList.add(whiteKnight1);
        masterList.put(whiteKnight1Coord, whiteKnight1);
        
        String whiteKnight2Coord = "g1";
        Piece whiteKnight2 = new Knight("whiteKnight2", "knight", true);
        pieceList.add(whiteKnight2);
        masterList.put(whiteKnight2Coord, whiteKnight2);
        
        //setup black knights
        String blackKnight1Coord = "b8";
        Piece blackKnight1 = new Knight("blackKnight1", "knight", false);
        pieceList.add(blackKnight1);
        masterList.put(blackKnight1Coord, blackKnight1);
        
        String blackKnight2Coord = "g8";
        Piece blackKnight2 = new Knight("blackKnight2", "knight", false);
        pieceList.add(blackKnight2);
        masterList.put(blackKnight2Coord, blackKnight2);
        
        //setup white bishops
        String whiteBishop1Coord = "c1";
        Piece whiteBishop1 = new Bishop("whiteBishop1", "bishop", true);
        pieceList.add(whiteBishop1);
        masterList.put(whiteBishop1Coord, whiteBishop1);
        
        String whiteBishop2Coord = "f1";
        Piece whiteBishop2 = new Bishop("whiteBishop2", "bishop", true);
        pieceList.add(whiteBishop2);
        masterList.put(whiteBishop2Coord, whiteBishop2);
        
        //setup black bishops
        String blackBishop1Coord = "c8";
        Piece blackBishop1 = new Bishop("blackBishop1", "bishop", false);
        pieceList.add(blackBishop1);
        masterList.put(blackBishop1Coord, blackBishop1);
        
        String blackBishop2Coord = "f8";
        Piece blackBishop2 = new Bishop("blackBishop2", "bishop", false);
        pieceList.add(blackBishop2);
        masterList.put(blackBishop2Coord, blackBishop2);
        
        //setup white queen
        String whiteQueenCoord = "d1";
        Piece whiteQueen = new Queen("whiteQueen", "queen", true);
        pieceList.add(whiteQueen);
        masterList.put(whiteQueenCoord, whiteQueen);
        
        //setup black queen
        String blackQueenCoord = "d8";
        Piece blackQueen = new Queen("blackQueen", "queen", false);
        pieceList.add(blackQueen);
        masterList.put(blackQueenCoord, blackQueen);
        
        //setup white king
        String whiteKingCoord = "e1";
        Piece whiteKing = new King("whiteKing", "king", true);
        pieceList.add(whiteKing);
        masterList.put(whiteKingCoord, whiteKing);
        
        //setup black king
        String blackKingCoord = "e8";
        Piece blackKing = new King("blackKing", "king", false);
        pieceList.add(blackKing);
        masterList.put(blackKingCoord, blackKing);
    }
   
}
