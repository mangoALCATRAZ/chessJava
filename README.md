# chessJava
## Project Abstract

This is a chess application that is implemented in Java. So far, only the barebone skeleton is done, but the idea is to 
take advantage of Java's object-oriented nature to implement the rules to a complex game. The program will eventually incorporate a visual interface, while this skeleton is text-based. Also, this game should ideally be able to be played online. Both the UI and networking features will likely need to implement multithreading in order to run concurrently with the game rules and logic. This project should also be extendable, with new features easy to add and implement. The program, so far, calls a Game object which stores a hash-key list of space coordinates to pieces. This game object also creates a Board object, which stores a hash-key list of coordinates to spaces. These lists are used for all reference to where pieces are relative to space coordinates, and where spaces are to space coordinates. 

The following UML diagram illustrates the skeleton code that has been implemented so far: This is where the rules logic for the game will be

