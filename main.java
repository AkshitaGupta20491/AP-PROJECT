package com.example.demo;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;


class rotor{
    public Button bt1;
    private int degree = 0;
    rotor(){
        bt1 = new Button("Rotor");
        bt1.setLayoutX(170);
        bt1.setLayoutY(120);
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}

class rotator{
    public Button bt2;
    rotator(){
        bt2 = new Button("Rotator");
        bt2.setLayoutX(160);
        bt2.setLayoutY(270);
    }
}

public class main extends Application {

    Stage window;

    @Override
    public void start(Stage stage) throws Exception

    {
        window = stage;
        Pane p = new Pane();


        rotor rot = new rotor();
        rotator rotate = new rotator();

        Text t = new Text();

        t.setText("Rotor rotated by "+ rot.getDegree());
        t.setLayoutX(130);
        t.setLayoutY(190);
        RotateTransition rt = new RotateTransition();


        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent e) {

                rot.setDegree(rot.getDegree()+30);
                t.setText("Rotor rotated by "+ rot.getDegree());

                rt.setAxis(Rotate.Z_AXIS);
                rt.setByAngle(30);
//        rt.setCycleCount(500);
                rt.setDuration(Duration.millis(1000));
                rt.setNode(rot.bt1);
                rt.play();

            }
        };

        EventHandler<MouseEvent> eh = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                rt.stop();
            }
        };
        p.getChildren().addAll(rot.bt1,rotate.bt2,t);
        rot.bt1.addEventFilter(MouseEvent.MOUSE_CLICKED,eh);
        rotate.bt2.addEventFilter(MouseEvent.MOUSE_CLICKED,eventHandler);




        Scene sc = new Scene(p,400,400);
        window.setTitle("Harsh20509");
        window.setScene(sc);
        window.show();

    }


}
