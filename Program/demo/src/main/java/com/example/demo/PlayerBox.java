package com.example.demo;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;

public class PlayerBox {

    //Variables of PlayerBox.
    private RadioButton sButton;
    private RadioButton oButton;
    private Label playerLabel;
    private Label playerScore;
    private int score;

    //Constructor.
    public PlayerBox() {
        sButton = new RadioButton("S");
        oButton = new RadioButton("O");
        playerLabel = new Label();
        playerScore = new Label();
        score = 0;
        playerScore.setText("Score: " + Integer.toString(score));
        sButton.setSelected(true);

        ToggleGroup group = new ToggleGroup();
        sButton.setToggleGroup(group);
        oButton.setToggleGroup(group);
    }

    //Constructor.
    public PlayerBox(String playerName, HBox hbox) {
        sButton = new RadioButton("S");
        oButton = new RadioButton("O");
        playerLabel = new Label(playerName);
        score = 0;
        playerScore = new Label();
        playerScore.setText("Score: " + Integer.toString(score));
        sButton.setSelected(true);

        ToggleGroup group = new ToggleGroup();
        sButton.setToggleGroup(group);
        oButton.setToggleGroup(group);

        hbox.getChildren().addAll(playerLabel, sButton, oButton, playerScore);
        hbox.setSpacing(2);


    }

    //Return if the S button is selected.
    public boolean getS () {
        return sButton.isSelected();
    }

    //Return if the O button is selected.
    public boolean getO () {
        return oButton.isSelected();
    }

    public void updatePlayerScore() {
        score = ++score;
        playerScore.setText("Score: " + Integer.toString(score));
    }
    public void setScore(int temp) {
        score = temp;
        playerScore.setText("Score: " + Integer.toString(score));
    }

    public int getScore() {return score;}
}