package com.example.demo;

import javafx.animation.KeyFrame;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Preloader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

//import javax.swing.*;
import java.io.*;
import java.util.Random;


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
//    final static Image d1 = new Image(String.valueOf(main.class.getResource("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice1.png")));
//    final static javafx.scene.image.Image d2 = new javafx.scene.image.Image(String.valueOf(main.class.getResource("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice2.png")));
//    final static javafx.scene.image.Image d3 = new javafx.scene.image.Image(String.valueOf(main.class.getResource("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice3.png")));
//    final static javafx.scene.image.Image d4 = new javafx.scene.image.Image(String.valueOf(main.class.getResource("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice4.png")));
//    final static javafx.scene.image.Image d5 = new javafx.scene.image.Image(String.valueOf(main.class.getResource("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice5.png")));
//    final static javafx.scene.image.Image d6 = new javafx.scene.image.Image(String.valueOf(main.class.getResource("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice6.png")));
    InputStream stream1 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice1.png");
    InputStream stream2 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice2.png");
    InputStream stream3 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice3.png");
    InputStream stream4 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice4.png");
    InputStream stream5 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice5.png");
    InputStream stream6 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice6.png");
//
    Image d1 = new Image(stream1);
    Image d2 = new Image(stream2);
    Image d3 = new Image(stream3);
    Image d4 = new Image(stream4);
    Image d5 = new Image(stream5);
    Image d6 = new Image(stream6);






    private Group d;



    @FXML
    private ImageView player1;

    @FXML
    private ImageView player2;

    public main() throws FileNotFoundException {
    }
    public static Group diceanimation() throws IOException {
        InputStream stream1 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice1.png");
        InputStream stream2 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice2.png");
        InputStream stream3 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice3.png");
        InputStream stream4 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice4.png");
        InputStream stream5 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice5.png");
        InputStream stream6 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice6.png");

        Image d1 = new Image(stream1);
        Image d2 = new Image(stream2);
        Image d3 = new Image(stream3);
        Image d4 = new Image(stream4);
        Image d5 = new Image(stream5);
        Image d6 = new Image(stream6);

        final ImageView dice1 = new ImageView(d1);
        final ImageView dice2 = new ImageView(d2);
        final ImageView dice3 = new ImageView(d3);
        final ImageView dice4 = new ImageView(d4);
        final ImageView dice5 = new ImageView(d5);
        final ImageView dice6 = new ImageView(d6);
        dice1.setFitHeight(40);
        dice1.setFitWidth(40);
        dice2.setFitHeight(40);
        dice2.setFitWidth(40);
        dice3.setFitHeight(40);
        dice3.setFitWidth(40);
        dice4.setFitHeight(40);
        dice4.setFitWidth(40);
        dice5.setFitHeight(40);
        dice5.setFitWidth(40);
        dice6.setFitHeight(40);
        dice6.setFitWidth(40);

        dice1.setY(400);
        dice1.setX(400);
        dice2.setY(400);
        dice2.setX(400);
        dice3.setY(400);
        dice3.setX(400);
        dice4.setY(400);
        dice4.setX(400);
        dice5.setY(400);
        dice5.setX(400);
        dice6.setY(400);
        dice6.setX(400);


        Group d;
        d = new Group(dice1);
//        d.maxHeight(200);
//        d.maxWidth(200);
        Timeline t = new Timeline();
        t.setCycleCount(3);


        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(500),
                (ActionEvent event)-> {
                    d.getChildren().setAll(dice2);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(750),
                (ActionEvent event)-> {
                    d.getChildren().setAll(dice3);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1000),
                (ActionEvent event)-> {
                    d.getChildren().setAll(dice4);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1225),
                (ActionEvent event)-> {
                    d.getChildren().setAll(dice5);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(1500),
                (ActionEvent event)-> {
                    d.getChildren().setAll(dice6);
                }
        ));
        t.play();
        if(t.getCycleCount()==25){
            t.stop();
        }
//        Scene sc = new Scene(d,800,800);
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene5.fxml"));
//
//        Scene5Controller sc5 = new Scene5Controller();
//        sc5.groupSetter(d);
//        Scene sc = new Scene(fxmlLoader.load());
//
//
//        window.setScene(sc);
//        window.setMaximized(true);
//        window.show();
        return d;

    }

    public void newdiceanimation(){
        ImageView diceImage = new ImageView();
        Random rd= new Random();
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread Running");
                try {
                    for (int i = 0; i < 15; i++) {

                        File file = new File("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice" + (rd.nextInt(6)+1)+".png");
//                        ImageIcon diceImage;
                        diceImage.setImage(new Image(file.toURI().toString()));
                        Thread.sleep(50);
                    }
//                    rollButton.setDisable(false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();
        Pane p = new Pane();
        p.getChildren().add(diceImage);
        Scene sc = new Scene(p,800,800);
        window.setScene(sc);
        window.show();

    }

    public static ImageView arrowanimation() throws FileNotFoundException {
        InputStream stream1 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\clipart529578.png");
        Image img =new  Image(stream1);
        ImageView iv = new ImageView(img);
        iv.setFitWidth(40);
        iv.setFitHeight(40);

        

        TranslateTransition tt = new TranslateTransition();
        tt.setByY(50);
        tt.setDuration(Duration.millis(500));
        tt.setCycleCount(500);
        tt.setAutoReverse(true);
        tt.setNode(iv);
        tt.play();
        return iv;
//        Pane p =new Pane();
//        p.getChildren().add(iv);
//        Scene sc = new Scene(p,400,400);
//        window.setScene(sc);
//        window.show();
    }

    @Override
    public void start(Stage stage) throws IOException

    {
                window = stage;
                Pane p = new Pane();


        //        rotor rot = new rotor();
        //        rotator rotate = new rotator();
        //
        //        Text t = new Text();
        //
        //        t.setText("Rotor rotated by "+ rot.getDegree());
        //        t.setLayoutX(130);
        //        t.setLayoutY(190);
        //        RotateTransition rt = new RotateTransition();
        //
        //
        //        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>(){
        //            @Override
        //            public void handle(MouseEvent e) {
        //
        //                rot.setDegree(rot.getDegree()+30);
        //                t.setText("Rotor rotated by "+ rot.getDegree());
        //
        //                rt.setAxis(Rotate.Z_AXIS);
        //                rt.setByAngle(30);
        ////        rt.setCycleCount(500);
        //                rt.setDuration(Duration.millis(1000));
        //                rt.setNode(rot.bt1);
        //                rt.play();
        //
        //            }
        //        };
        //
        //        EventHandler<MouseEvent> eh = new EventHandler<MouseEvent>() {
        //            @Override
        //            public void handle(MouseEvent mouseEvent) {
        //                rt.stop();
        //            }
        //        };
        //        p.getChildren().addAll(rot.bt1,rotate.bt2,t);
        //        rot.bt1.addEventFilter(MouseEvent.MOUSE_CLICKED,eh);
        //        rotate.bt2.addEventFilter(MouseEvent.MOUSE_CLICKED,eventHandler);

//                double cx,orgx;
//                double cy ,orgy;
//                Circle c = new Circle();
//                c.setCenterX(50);
//                c.setLayoutY(50);
//                c.setRadius(15);
//        //
//        //
//        //
//                Bounds b = c.localToScene(c.getBoundsInLocal());
//                orgx = b.getMinX();
//                orgy = b.getMinY();
//
//                cx = orgx;
//                cy = orgy;
//                EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>(){
//                    @Override
//                    public void handle(MouseEvent e) {
//                        TranslateTransition tt = new TranslateTransition();
//                        tt.setToX(e.getSceneX()-orgx);
//                        tt.setToY(e.getSceneY()-orgy);
//                        tt.setNode(c);
//                        tt.play();
//                    }
//                };





        // ****************************DICE ANIMATION*******************
//        final ImageView dice1 = new ImageView(d1);
//        final ImageView dice2 = new ImageView(d2);
//        final ImageView dice3 = new ImageView(d3);
//        final ImageView dice4 = new ImageView(d4);
//        final ImageView dice5 = new ImageView(d5);
//        final ImageView dice6 = new ImageView(d6);
//        dice1.setFitHeight(40);
//        dice1.setFitWidth(40);
//        dice2.setFitHeight(40);
//        dice2.setFitWidth(40);
//        dice3.setFitHeight(40);
//        dice3.setFitWidth(40);
//        dice4.setFitHeight(40);
//        dice4.setFitWidth(40);
//        dice5.setFitHeight(40);
//        dice5.setFitWidth(40);
//        dice6.setFitHeight(40);
//        dice6.setFitWidth(40);
//
//        dice1.setY(400);
//        dice1.setX(400);
//        dice2.setY(400);
//        dice2.setX(400);
//        dice3.setY(400);
//        dice3.setX(400);
//        dice4.setY(400);
//        dice4.setX(400);
//        dice5.setY(400);
//        dice5.setX(400);
//        dice6.setY(400);
//        dice6.setX(400);
//
//
//
//        d = new Group(dice1);
////        d.maxHeight(200);
////        d.maxWidth(200);
//        Timeline t = new Timeline();
//        t.setCycleCount(Timeline.INDEFINITE);
//        t.getKeyFrames().add(new KeyFrame(
//                Duration.millis(2000),
//                (ActionEvent event)-> {
//                    d.getChildren().setAll(dice2);
//                }
//        ));
//        t.getKeyFrames().add(new KeyFrame(
//                Duration.millis(3000),
//                (ActionEvent event)-> {
//                    d.getChildren().setAll(dice3);
//                }
//        ));
//        t.getKeyFrames().add(new KeyFrame(
//                Duration.millis(4000),
//                (ActionEvent event)-> {
//                    d.getChildren().setAll(dice4);
//                }
//        ));
//        t.getKeyFrames().add(new KeyFrame(
//                Duration.millis(5000),
//                (ActionEvent event)-> {
//                    d.getChildren().setAll(dice5);
//                }
//        ));
//        t.getKeyFrames().add(new KeyFrame(
//                Duration.millis(6000),
//                (ActionEvent event)-> {
//                    d.getChildren().setAll(dice6);
//                }
//        ));
//        t.play();
//        Scene sc = new Scene(d,800,800);
//        window.setScene(sc);


        //***************DICE ANIMATION ENDS******************


//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene5.fxml"));
//        Scene sc = new Scene(fxmlLoader.load());

//        player p1  = new player("PLAYER1");


//        Bounds b = player1.localToScene(player1.getBoundsInLocal());
//        double orgx = b.getMinX();
//        double orgy = b.getMinY();
//
//        double cx = orgx;
//        double cy = orgy;
//                EventHandler<MouseEvent> eventHandler = e -> {
//                    TranslateTransition tt = new TranslateTransition();
//                    tt.setToX(e.getSceneX()-orgx);
//                    tt.setToY(e.getSceneY()-orgy);
//                    tt.setNode(player1);
//                    tt.play();
//                };







//        diceanimation();
//        arrowanimation();
        newdiceanimation();

//                p.getChildren().add(c);
//        d.maxHeight(40);
//        d.maxWidth(40);
//            Scene sc = new Scene(d,800,800);

//                sc.setOnMouseClicked(eventHandler);
//                window.setTitle("Harsh20509");
//                window.setScene(sc);
                window.show();

    }



    public void translate(player p1, player p2, int turn,int diceno,int board){

        if(board==1){
            if(turn==1){
                //p1 translation
                TranslateTransition tt = new TranslateTransition();

                // if(current position of pawn is in range) x translate
                //else translate x and y both



            }else if(turn ==2){
                //p2 translation
            }else{

            }
        }else if(board==2){
            if(turn==1){
                //p1 translation
                TranslateTransition tt = new TranslateTransition();
                // if(current position of pawn is in range) x translate
                //else translate x and y both


            }else if(turn ==2){
                //p2 translation
            }else{

            }
        }

    }


}
