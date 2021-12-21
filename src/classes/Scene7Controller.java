package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class Scene7Controller {

    @FXML
    private Button Menu;

    @FXML
    private Button Replay;

    @FXML
    private Label loser;

    @FXML
    private Label winner;

    @FXML
    void Menu(ActionEvent event) throws IOException {
        Game.exit3();
    }

    @FXML
    void Replay(ActionEvent event) throws IOException {
        Game.replay();
    }

    void setwinnerloser(String s1, String s2){
        winner.setText(s1);loser.setText(s2);
    }
}
