package com.example.demo;

import javafx.animation.*;
import javafx.application.Application;
import javafx.application.Preloader;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
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

    static Stage window;
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

    public void progressbaranimation(){

//        ProgressBar pb = new ProgressBar();
//
//
//
//        Thread th = new Thread(){
//            public void run(){
//                for(int i=0;i<=1;i+=0.1){
//
//                    pb.setLayoutX(200);
//                    pb.setLayoutY(200);
//                    pb.setProgress(i);
//
//
//
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }




//        };
//        th.start();
//        Pane p = new Pane();
//        p.getChildren().add(pb);
//        Scene sc = new Scene(p,400,400);
//        window.setScene(sc);
//        window.show();

        ProgressBar bar = new ProgressBar(0);
        bar.setPrefSize(200, 24);
        Pane p = new Pane();
        Timeline task = new Timeline(
                new KeyFrame(
                        Duration.ZERO,
                        new KeyValue(bar.progressProperty(), 0)
                ),
                new KeyFrame(
                        Duration.seconds(5),
                        new KeyValue(bar.progressProperty(), 1)
                )
        );

//        Button button = new Button("Go!");
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override public void handle(ActionEvent actionEvent) {
//                task.playFromStart();
//            }
//        });
        task.playFromStart();
//        VBox layout = new VBox(10);
//        layout.getChildren().setAll(
//                bar
////                button
//        );
//        layout.setPadding(new Insets(10));
//        layout.setAlignment(Pos.CENTER);

        p.getChildren().add(bar);

        window.setScene(new Scene(p));
        window.show();
//    }




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
//        newdiceanimation();
//        progressbaranimation();

//                p.getChildren().add(c);
//        d.maxHeight(40);
//        d.maxWidth(40);
//            Scene sc = new Scene(d,800,800);

//                sc.setOnMouseClicked(eventHandler);
//                window.setTitle("Harsh20509");
//                window.setScene(sc);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene3.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        main.window.setScene(scene);
                window.show();

    }
    public static void playgame() throws IOException {
//        System.out.println("Size of boxset: "+ allBoxes.size());
//        for(int i=0;i< allBoxes.size();i++){
//            System.out.println("x of box "+allBoxes.get(i).getNumber()+" is "+allBoxes.get(i).getX());
//            System.out.println("y of box "+allBoxes.get(i).getNumber()+" is "+allBoxes.get(i).getY());
//        }
        if(GamePlay.getTurn()==1){
            //p1 translation
            System.out.println("turn1");
            if(GamePlay.getPlayer1().getStart()==false){
                System.out.println("x of p1: "+GamePlay.getPlayer1().getPawn().getPawniv().getLayoutX()+" "+"y of p2: "+GamePlay.getPlayer1().getPawn().getPawniv().getLayoutY());
                System.out.println("hi from player1getstart");
                if(GamePlay.getPlayer1().getDiceout()==1){
                    GamePlay.getPlayer1().setIsstart(true);
                    TranslateTransition tt = new TranslateTransition();
//                    tt.setToX(player1.getPawn().getPawniv().getX()+(allBoxes.get(0).getX()));
////                    tt.setToY(player1.getPawn().getPawniv().getY()-(allBoxes.get(0).getY()));
//                    tt.setToY((allBoxes.get(0).getY())-player1.getPawn().getPawniv().getY());

//                    tt.setToX(player1.getPawn().getPawniv().getX()+19);
//
//                    tt.setToY(player1.getPawn().getPawniv().getY()-90);
//                    player1.getPawn().getPawniv().setX(player1.getPawn().getPawniv().getX()+19);
//                    player1.getPawn().getPawniv().setY(player1.getPawn().getPawniv().getY()-90);

//                    tt.setToX((player1.getPawn().getPosition().getX())+(allBoxes.get(0).getX()));
//                    tt.setToY(player1.getPawn().getPosition().getY()-(allBoxes.get(0).getY()));
                    tt.setToX((GamePlay.allBoxes.get(0).getX()));
                    tt.setToY(-(GamePlay.allBoxes.get(0).getY()));

//                    System.out.println("x1: "+(allBoxes.get(0).getX())+" "+"y1: "+(allBoxes.get(0).getY()));



                    tt.setDuration(Duration.millis(500));
                    tt.setNode(GamePlay.getPlayer1().getPawn().getPawniv());
                    tt.play();
//                    player1.getPawn().getPawniv().setX((allBoxes.get(0).getX()));
//                    player1.getPawn().getPawniv().setY(-(allBoxes.get(0).getY()));
                    System.out.println("Hello from playgametranslate");


                }
            }else{
                if(GamePlay.p1counter+ GamePlay.getPlayer1().getDiceout()<=100){
                    TranslateTransition tt = new TranslateTransition();
//                tt.setToX(player1.getPawn().getPawniv().getX()+66);
//                tt.setToY(player1.getPawn().getPawniv().getY()-0);
//                    for(int i=1;i<=player1.getDiceout();i++){
//                        System.out.println("Hello p1 "+i);
                    tt.setToX(GamePlay.allBoxes.get(GamePlay.p1counter+ GamePlay.getPlayer1().getDiceout()).getX());
                    tt.setToY(-GamePlay.allBoxes.get(GamePlay.p1counter+ GamePlay.getPlayer1().getDiceout()).getY());
                    tt.setDuration(Duration.millis(500));
                    tt.setNode(GamePlay.getPlayer1().getPawn().getPawniv());
                    tt.play();
//                        tt.setToX(allBoxes.get(p1counter+ i).getX());
//                        tt.setToY(-allBoxes.get(p1counter+ i).getY());
//                        tt.setDuration(Duration.millis(500));
//                        tt.setNode(player1.getPawn().getPawniv());
//                        tt.play();




//                    }
                    GamePlay.p1counter+= GamePlay.getPlayer1().getDiceout();


//                    System.out.println("dice no more than 1");

                }
                if(GamePlay.allBoxes.get(GamePlay.p1counter).getStatus()!=0){
                    checksnakeorladder(GamePlay.p1counter,1);
//                    TranslateTransition tt2 = new TranslateTransition();
//                    if(allBoxes.get(p1counter).getStatus()==1){

//                        tt2.setToX(ladders.get(allBoxes.get(p1counter).getSpcno()).getEnd().getX());
//                        tt2.setToY(-ladders.get(allBoxes.get(p1counter).getSpcno()).getEnd().getY());
//
//                        tt2.setDuration(Duration.millis(500));
//                        tt2.setNode(player1.getPawn().getPawniv());
//                        tt2.play();
//                        System.out.println("Set to x: "+ladders.get(allBoxes.get(p1counter).getSpcno()).getEnd().getX());
//                        System.out.println("set to y: "+(-ladders.get(allBoxes.get(p1counter).getSpcno()).getEnd().getY()));
//                        p1counter = allBoxes.indexOf(ladders.get(allBoxes.get(p1counter).getSpcno()).getEnd());

//                    }else{
//                        tt2.setToX(snakes.get(allBoxes.get(p1counter).getSpcno()).getEnd().getX());
//                        tt2.setToY(-snakes.get(allBoxes.get(p1counter).getSpcno()).getEnd().getY());
//                        tt2.setDuration(Duration.millis(500));
//                        tt2.setNode(player1.getPawn().getPawniv());
//                        tt2.play();
//                        System.out.println("Set to x: "+snakes.get(allBoxes.get(p1counter).getSpcno()).getEnd().getX());
//                        System.out.println("set to y: "+(-snakes.get(allBoxes.get(p1counter).getSpcno()).getEnd().getY()));
//                        p1counter = allBoxes.indexOf(snakes.get(allBoxes.get(p1counter).getSpcno()).getEnd());
//                    }


                }
                if(GamePlay.p1counter==100) {
                    GamePlay.declarewinner(2);
                }

            }
            GamePlay.setTurn(2);
        }else if(GamePlay.getTurn() ==2){
            System.out.println("turn2");
            //p2 translation
            if(GamePlay.getPlayer2().getStart()==false){
                System.out.println("hi from player2getstart");
                System.out.println("x of p2: "+GamePlay.getPlayer2().getPawn().getPawniv().getLayoutX()+" "+"y of p2: "+GamePlay.getPlayer2().getPawn().getPawniv().getLayoutY());
                if(GamePlay.getPlayer2().getDiceout()==1){
                    GamePlay.getPlayer2().setIsstart(true);
                    TranslateTransition tt = new TranslateTransition();
//                    tt.setToX(player2.getPawn().getPawniv().getX()+(allBoxes.get(0).getX()));
//                    tt.setToY(player2.getPawn().getPawniv().getY()-(allBoxes.get(0).getY()));
//                    tt.setToY((allBoxes.get(0).getY())-player2.getPawn().getPawniv().getY());

                    tt.setToX(GamePlay.allBoxes.get(0).getX()-40);
                    tt.setToY(-(GamePlay.allBoxes.get(0).getY()));
                    System.out.println("x2: "+(GamePlay.allBoxes.get(0).getX())+" "+"y2: "+(GamePlay.allBoxes.get(0).getY()));
//
//                    tt.setToX(player1.getPawn().getPawniv().getX()-10);
////                    player2.getPawn().getPawniv().setLayoutX((player2.getPawn().getPawniv().getX()+19));
//                    tt.setToY(player1.getPawn().getPawniv().getY()-90);
//                    player2.getPawn().getPawniv().setX((player2.getPawn().getPawniv().getX()+19));
//                    player2.getPawn().getPawniv().setY(player2.getPawn().getPawniv().getY()-90);


                    tt.setDuration(Duration.millis(500));
                    tt.setNode(GamePlay.getPlayer2().getPawn().getPawniv());
                    tt.play();

                }
            }else{
                if(GamePlay.p2counter+ GamePlay.getPlayer2().getDiceout()<=100){
                    TranslateTransition tt = new TranslateTransition();
//                tt.setToX(player1.getPawn().getPawniv().getX()+66);
//                tt.setToY(player1.getPawn().getPawniv().getY()-0);
//                    for(int i=1;i<=player2.getDiceout();i++) {
//                        System.out.println("Hello p2 "+i);

                    tt.setToX(GamePlay.allBoxes.get(GamePlay.p2counter+ GamePlay.getPlayer2().getDiceout()).getX() - 40);
                    tt.setToY(-GamePlay.allBoxes.get(GamePlay.p2counter+ GamePlay.getPlayer2().getDiceout()).getY());

                    tt.setDuration(Duration.millis(500));
                    tt.setNode(GamePlay.getPlayer2().getPawn().getPawniv());
                    tt.play();
//                        tt.setToX(allBoxes.get(p2counter+ i).getX() - 40);
//                        tt.setToY(-allBoxes.get(p2counter+ i).getY());
//
//                        tt.setDuration(Duration.millis(500));
//                        tt.setNode(player2.getPawn().getPawniv());
//                        tt.play();


//                    }
                    GamePlay.p2counter+= GamePlay.getPlayer2().getDiceout();



//                    System.out.println("dice no more than 1");
                }
                if(GamePlay.allBoxes.get(GamePlay.p2counter).getStatus()!=0){
                    checksnakeorladder(GamePlay.p2counter,2);
//                    TranslateTransition tt2 = new TranslateTransition();
//                    if(allBoxes.get(p2counter).getStatus()==1){
//                        tt2.setToX(ladders.get(allBoxes.get(p2counter).getSpcno()).getEnd().getX()-40);
//                        tt2.setToY(-ladders.get(allBoxes.get(p2counter).getSpcno()).getEnd().getY());
//                        tt2.setDuration(Duration.millis(500));
//                        tt2.setNode(player2.getPawn().getPawniv());
//                        tt2.play();
//                        System.out.println("Set to x: "+(ladders.get(allBoxes.get(p2counter).getSpcno()).getEnd().getX()-40));
//                        System.out.println("set to y: "+(-ladders.get(allBoxes.get(p2counter).getSpcno()).getEnd().getY()));
//                        p2counter = allBoxes.indexOf(ladders.get(allBoxes.get(p2counter).getSpcno()).getEnd());
//                    }else{
//                        tt2.setToX(snakes.get(allBoxes.get(p2counter).getSpcno()).getEnd().getX()-40);
//                        tt2.setToY(-snakes.get(allBoxes.get(p2counter).getSpcno()).getEnd().getY());
//                        tt2.setDuration(Duration.millis(500));
//                        tt2.setNode(player2.getPawn().getPawniv());
//                        tt2.play();
//                        System.out.println("Set to x: "+(snakes.get(allBoxes.get(p2counter).getSpcno()).getEnd().getX()-40));
//                        System.out.println("set to y: "+(-snakes.get(allBoxes.get(p2counter).getSpcno()).getEnd().getY()));
//                        p2counter = allBoxes.indexOf(snakes.get(allBoxes.get(p2counter).getSpcno()).getEnd()) ;
//
//                    }
                }
                if(GamePlay.p2counter==100){
                    GamePlay.declarewinner(2);
                }
                GamePlay.setTurn(1);
            }
        }}
    public static void checksnakeorladder(int counter,int flag) throws IOException {
        TranslateTransition tt2 = new TranslateTransition();
        if(GamePlay.allBoxes.get(counter).getStatus()==1){
            if(flag==1){
                tt2.setToX(GamePlay.ladders.get(GamePlay.allBoxes.get(GamePlay.p1counter).getSpcno()).getEnd().getX());
                tt2.setToY(-GamePlay.ladders.get(GamePlay.allBoxes.get(GamePlay.p1counter).getSpcno()).getEnd().getY());

                tt2.setDuration(Duration.millis(500));
                tt2.setNode(GamePlay.getPlayer1().getPawn().getPawniv());
                tt2.play();
//                System.out.println("Set to x: "+ladders.get(allBoxes.get(p1counter).getSpcno()).getEnd().getX());
//                System.out.println("set to y: "+(-ladders.get(allBoxes.get(p1counter).getSpcno()).getEnd().getY()));
                GamePlay.p1counter = GamePlay.allBoxes.indexOf(GamePlay.ladders.get(GamePlay.allBoxes.get(GamePlay.p1counter).getSpcno()).getEnd());
            }
            else if(flag==2){
                tt2.setToX(GamePlay.ladders.get(GamePlay.allBoxes.get(counter).getSpcno()).getEnd().getX()-40);
                tt2.setToY(-GamePlay.ladders.get(GamePlay.allBoxes.get(counter).getSpcno()).getEnd().getY());
                tt2.setDuration(Duration.millis(500));
                tt2.setNode(GamePlay.getPlayer2().getPawn().getPawniv());
                tt2.play();
//            System.out.println("Set to x: "+(ladders.get(allBoxes.get(p2counter).getSpcno()).getEnd().getX()-40));
//            System.out.println("set to y: "+(-ladders.get(allBoxes.get(p2counter).getSpcno()).getEnd().getY()));
                GamePlay.p2counter = GamePlay.allBoxes.indexOf(GamePlay.ladders.get(GamePlay.allBoxes.get(GamePlay.p2counter).getSpcno()).getEnd());
            }

        }else if(GamePlay.allBoxes.get(counter).getStatus()==-1){
            if(flag==1){
                tt2.setToX(GamePlay.snakes.get(GamePlay.allBoxes.get(GamePlay.p1counter).getSpcno()).getStart().getX());
                tt2.setToY(-GamePlay.snakes.get(GamePlay.allBoxes.get(GamePlay.p1counter).getSpcno()).getStart().getY());
                tt2.setDuration(Duration.millis(500));
                tt2.setNode(GamePlay.getPlayer1().getPawn().getPawniv());
                tt2.play();
//                System.out.println("Set to x: "+snakes.get(allBoxes.get(p1counter).getSpcno()).getEnd().getX());
//                System.out.println("set to y: "+(-snakes.get(allBoxes.get(p1counter).getSpcno()).getEnd().getY()));
                GamePlay.p1counter = GamePlay.allBoxes.indexOf(GamePlay.snakes.get(GamePlay.allBoxes.get(GamePlay.p1counter).getSpcno()).getStart());

            }else if(flag==2){
                tt2.setToX(GamePlay.snakes.get(GamePlay.allBoxes.get(GamePlay.p2counter).getSpcno()).getStart().getX()-40);
                tt2.setToY(-GamePlay.snakes.get(GamePlay.allBoxes.get(GamePlay.p2counter).getSpcno()).getStart().getY());
                tt2.setDuration(Duration.millis(500));
                tt2.setNode(GamePlay.getPlayer2().getPawn().getPawniv());
                tt2.play();
//                System.out.println("Set to x: "+(snakes.get(allBoxes.get(p2counter).getSpcno()).getEnd().getX()-40));
//                System.out.println("set to y: "+(-snakes.get(allBoxes.get(p2counter).getSpcno()).getEnd().getY()));
                GamePlay.p2counter = GamePlay.allBoxes.indexOf(GamePlay.snakes.get(GamePlay.allBoxes.get(GamePlay.p2counter).getSpcno()).getStart()) ;
            }




        }
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
