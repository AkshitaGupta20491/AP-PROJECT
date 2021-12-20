package com.example.demo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Scene2Controller {
    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane bp;

    @FXML
    private Button exit2;

    @FXML
    private Button settings;

    @FXML
    private Button startGame;

    @FXML
    void Exit(ActionEvent event) {
        Game.mainstage.close();
    }

    @FXML
    public void Startgame(ActionEvent actionEvent) throws IOException {
        Game.startgame();
    }

    @FXML
    public void settings(ActionEvent actionEvent) throws IOException {
        Game.settings();
    }
}
