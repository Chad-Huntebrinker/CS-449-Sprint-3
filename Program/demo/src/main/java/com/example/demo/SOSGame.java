package com.example.demo;

import javafx.scene.control.Label;

//Parent Class for the Simple and General Game classes.
public class SOSGame {
    private Board board;
    private Board SOSBoard;
    private PlayerBox bluePlayer;
    private PlayerBox redPlayer;
    private GUI gui;
    private Box box;
    private Label displayTurn;

    //Constructer
    SOSGame() {
        board = new Board();
        SOSBoard = new Board();
        bluePlayer = new PlayerBox();
        redPlayer = new PlayerBox();
        gui = new GUI(new Board());
        box = new Box();
        displayTurn = new Label();
    }

    //This function is used to draw a letter on a specific box. Both of the Game Modes will need to draw
    //something on the board, so this a good function to put in the parent class.
    public boolean drawALetter(Board board, Board SOSBoard, PlayerBox blue, PlayerBox red,
                               GUI guiInput, Box boxInput, Label turnInput) {
        this.board = board;
        this.SOSBoard = SOSBoard;
        bluePlayer = blue;
        redPlayer = red;
        gui = guiInput;
        box = boxInput;
        displayTurn = turnInput;

            //If the box is not empty, return false (becuase we didn't draw anything).
            if (!box.getValue().isEmpty()) {
                return false;
            }

            //If it is Blue Player's turn.
            if(this.board.getIsBlueTurn()) {
                //If Blue Player has selected the S radio button, draw S.
                if (bluePlayer.getS()) {
                    box.drawS();
                }

                //Else, draw an O.
                else {
                    box.drawO();
                }
            }

            //Else it is Red Player's turn.
            else {

                //If the red player has S selected, then draw a S.
                if(redPlayer.getS()) {
                    box.drawS();
                }

                //Else, draw an O.
                else {
                    box.drawO();
                }
            }

            //If we are here, then we drew something on the board.  So, return true.
            return true;
    }

    //Our getters and setters.
    public Board getBoard() {return board;}
    public Board getSOSBoard() {return SOSBoard;}
    public PlayerBox getBluePlayer() {return bluePlayer;}
    public PlayerBox getRedPlayer() {return redPlayer;}
    public GUI getGui() {return gui;}
    public Box getBox() {return box;}
    public Label getDisplayTurn() {return displayTurn;}

    public void setBoard(Board input) {board = input;}
    public void setSOSBoard(Board input) {SOSBoard = input;}
    public void setBluePlayer(PlayerBox input) {bluePlayer = input;}
    public void setRedPlayer(PlayerBox input) {redPlayer = input;}
    public void setGui(GUI input) {gui = input;}
    public void setBox(Box input) {box = input;}
    public void setDisplayTurn(Label input) {displayTurn = input;}
}