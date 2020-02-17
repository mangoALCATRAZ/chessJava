# chessJava
## Project Abstract

This is a chess application that is implemented in Java. So far, only the barebone skeleton is done, but the idea is to 
take advantage of Java's object-oriented nature to implement the rules to a complex game. The program will eventually incorporate a visual interface, while this skeleton is text-based. Also, this game should ideally be able to be played online. Both the UI and networking features will likely need to implement multithreading in order to run concurrently with the game rules and logic. This project should also be extendable, with new features easy to add and implement. The program, so far, calls a Game object which stores a hash-key list of space coordinates to pieces. This game object also creates a Board object, which stores a hash-key list of coordinates to spaces. These lists are used for all reference to where pieces are relative to space coordinates, and where spaces are to space coordinates. 

The following UML diagram illustrates the skeleton code that has been implemented so far: This is where the rules logic for the game will be

![alt](/Untitled%20Diagram.png)

## Project Relevance

This project very deliberately incorporates aspects of Object-Oriented design. This factored into choosing Java as a language, due to its OO nature. This allows the various components of the software, such as Pieces, Squares, Boards, etc, to be incorporated in a realistic way that mimics real life. This should simplify both implementing and understanding the code at hand. Also, another class topic that will be studied will be Multithreading. For the GUI and networking functionality, it is very likely that multithreading will be needed in order to ensure that these operations run concurrently with the rules of the game on each local machine. Whether or not use of locks or mutual exclusion to protect shared elements across threads has yet to be determined.

## Proposed Contribution

I have already developed a simple setup demo incorporating what is described in the UML document above. This creates a Game object which allocates a list of pieces to space coordinates, sets up a Board object with Square objects allocated to space coordinates, and prints out a sample of the default configuration of the board to System.out. This board represents the beginning state of a chess game, with each piece in its appropriate place from a1 to h8. I am interested in continuing to implement the rules of the game, which other tasks such as check/checkmate watching, gui, and networking could be handled by others.

## How to Use
Here is a link to the repository containing the program: https://github.com/mangoALCATRAZ/chessJava

### Building:
This has been tested to work on Netbeans 8.2 on Windows 10. Cloning should be as simple as going into Netbeans and using their git interface to clone the repo into a new project file. Then, one should be able to complie, provided that their JDK and Netbeans are set up properly.

### Running:
This demo has a main() method that should print to System.Out a default positioning of each square and piece. If this is what results, the demo is running properly.
