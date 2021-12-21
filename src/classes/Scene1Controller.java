package com.example.demo;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Scene1Controller implements Initializable {

    @FXML
    private ProgressBar progressbar = new ProgressBar();

    @FXML
    private BorderPane bp;
//    Scene1Controller(){
//        progressbar = new ProgressBar();
//    }


    public void progressbaranimation() throws IOException {
        Timeline tl = new Timeline(
                new KeyFrame(
                        Duration.ZERO,
                        new KeyValue(progressbar.progressProperty(), 0)
                ),
                new KeyFrame(
                        Duration.seconds(5),
                        new KeyValue(progressbar.progressProperty(), 1)
                ),
                new KeyFrame(
                        Duration.millis(5100),
                        actionEvent -> {
                            try {
                                scenechange();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }

                )
        );


        tl.playFromStart();


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            progressbaranimation();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void scenechange() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene2.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Game.mainstage.setScene(scene);
    }
}
