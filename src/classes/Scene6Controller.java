package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Scene6Controller {

    @FXML
    private Button exit6;

    @FXML
    private Button okay;

    @FXML
    void Exit6(ActionEvent event) throws IOException {
        Game.exit6();
    }

    @FXML
    void Okay(ActionEvent event) throws IOException {
        Game.exit3();
    }

}
