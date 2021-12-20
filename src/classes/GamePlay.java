package com.example.demo;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.util.Duration;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

interface snakeLaddersetup{
     void Snakeset();
     void ladderset();
}

class Board1 implements snakeLaddersetup{
         public void Snakeset(){
        Snake s1 = new Snake(GamePlay.allBoxes.get(35),GamePlay.allBoxes.get(2));
        GamePlay.allBoxes.get(35).setStatus(-1);

        Snake s2 = new Snake(GamePlay.allBoxes.get(28),GamePlay.allBoxes.get(12));
        GamePlay.allBoxes.get(28).setStatus(-1);
        Snake s3 = new Snake(GamePlay.allBoxes.get(45),GamePlay.allBoxes.get(34));
        GamePlay.allBoxes.get(45).setStatus(-1);
        Snake s4 = new Snake(GamePlay.allBoxes.get(61),GamePlay.allBoxes.get(21));
             GamePlay.allBoxes.get(61).setStatus(-1);
        Snake s5 = new Snake(GamePlay.allBoxes.get(97),GamePlay.allBoxes.get(44));
             GamePlay.allBoxes.get(97).setStatus(-1);
        Snake s6 = new Snake(GamePlay.allBoxes.get(93),GamePlay.allBoxes.get(56));
             GamePlay.allBoxes.get(93).setStatus(-1);
        Snake s7 = new Snake(GamePlay.allBoxes.get(91),GamePlay.allBoxes.get(89));
             GamePlay.allBoxes.get(91).setStatus(-1);

             GamePlay.snakes.add(s1);GamePlay.snakes.add(s2);GamePlay.snakes.add(s3);GamePlay.snakes.add(s4);GamePlay.snakes.add(s5);GamePlay.snakes.add(s6);GamePlay.snakes.add(s7);
    }
    public void ladderset(){
        Ladder l1 = new Ladder(GamePlay.allBoxes.get(22),GamePlay.allBoxes.get(2));
        GamePlay.allBoxes.get(22).setStatus(1);
        Ladder l2 = new Ladder(GamePlay.allBoxes.get(29),GamePlay.allBoxes.get(9));
        GamePlay.allBoxes.get(29).setStatus(1);
        Ladder l3 = new Ladder(GamePlay.allBoxes.get(33),GamePlay.allBoxes.get(13));
        GamePlay.allBoxes.get(33).setStatus(1);
        Ladder l4 = new Ladder(GamePlay.allBoxes.get(32),GamePlay.allBoxes.get(31));
        GamePlay.allBoxes.get(32).setStatus(1);
        Ladder l5 = new Ladder(GamePlay.allBoxes.get(64),GamePlay.allBoxes.get(43));
        GamePlay.allBoxes.get(64).setStatus(1);
        Ladder l6 = new Ladder(GamePlay.allBoxes.get(81),GamePlay.allBoxes.get(62));
        GamePlay.allBoxes.get(81).setStatus(1);
        Ladder l7 = new Ladder(GamePlay.allBoxes.get(86),GamePlay.allBoxes.get(30));
        GamePlay.allBoxes.get(86).setStatus(1);
        Ladder l8 = new Ladder(GamePlay.allBoxes.get(90),GamePlay.allBoxes.get(76));
        GamePlay.allBoxes.get(90).setStatus(1);

        GamePlay.ladders.add(l1);GamePlay.ladders.add(l2);GamePlay.ladders.add(l3);GamePlay.ladders.add(l4);GamePlay.ladders.add(l5);GamePlay.ladders.add(l6);GamePlay.ladders.add(l7);GamePlay.ladders.add(l8);



    }


}



public class GamePlay{

    public static ArrayList<Box> allBoxes=new ArrayList();
    private static player player1;
    private static player player2;
    private static Dice dice;
    public static ArrayList<Snake> snakes = new ArrayList<>();
    public static ArrayList<Ladder> ladders = new ArrayList<>();
    public static Scene5Controller staticcontroller;
    public static int diceno = 6;
    private static int turn = 1;

    public static int getTurn() {
        return turn;
    }

    public static player getPlayer1() {
        return player1;
    }

    public static void setPlayer1(player player1) {
        GamePlay.player1 = player1;
    }

    public static player getPlayer2() {
        return player2;
    }

    public static void setPlayer2(player player2) {
        GamePlay.player2 = player2;
    }

    public static void setTurn(int turn) {
        GamePlay.turn = turn;
    }

    public static void launchGame (Image im1, Image im2, int board, String s1, String s2) throws IOException {
        FXMLLoader loader=new FXMLLoader(GamePlay.class.getResource("scene5.fxml"));
        Parent root=(Parent)loader.load();
        Scene5Controller controller=loader.getController();
        staticcontroller = controller;
        controller.setValues(s1,s2);

        // animations (dice and arrow)
        controller.jumpingarrowset(GamePlay.arrowanimation());
        controller.setonimageview();






        // animation ends
//        ImageView iv1 = new ImageView(im1);
//        ImageView iv2 = new ImageView(im2);

        controller.setpawnimages(im1,im2);
        GamePlay.BoxSet();
        if(board==1){
            Board1 b1 = new Board1();
            b1.ladderset();
            b1.Snakeset();

        }else{

        }
        player1 = new player(s1,false,new Pawn(allBoxes.get(100),staticcontroller.bigpawn1));
        player2 = new player(s2,false,new Pawn(allBoxes.get(101),staticcontroller.bigpawn2));


        Game.play(root);
//        dice = new Dice(dicebtn);

    }

    public static  void BoxSet(){
        int i=1;
        double yy=90;
        for(int k=0;k<5;k++){
            double xx=19;
            for(int j=0;j<10;j++){
                Box tempBox1=new Box(xx,yy,i);
                xx=xx+66;allBoxes.add(tempBox1);i++;

            }
            yy -=66;
            xx=xx-66;
            for(int m=0;m<10;m++){
                Box tempBox2=new Box(xx,yy,i);
                xx=xx-66;allBoxes.add(tempBox2);i++;
            }
            yy=yy-66;
        }
        Box b1 = new Box(439,650,0);
        Box b2 = new Box(483,659,0);

        allBoxes.add(b1);
        allBoxes.add(b2);

    }

    public void Exit5(ActionEvent actionEvent) throws  IOException{
        Game.exit5();
    }

//    public static Group diceanimation() throws IOException {
//        staticcontroller.startstopjumpingarrow(true);
////        staticcontroller.diceanimationgetter().setVisible(true);
//
//        System.out.println("Entered in diceanimation");
//        InputStream stream1 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice1.png");
//        InputStream stream2 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice2.png");
//        InputStream stream3 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice3.png");
//        InputStream stream4 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice4.png");
//        InputStream stream5 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice5.png");
//        InputStream stream6 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice6.png");
//
//        Image d1 = new Image(stream1);
//        Image d2 = new Image(stream2);
//        Image d3 = new Image(stream3);
//        Image d4 = new Image(stream4);
//        Image d5 = new Image(stream5);
//        Image d6 = new Image(stream6);
//
//        final ImageView dice1 = new ImageView(d1);
//        final ImageView dice2 = new ImageView(d2);
//        final ImageView dice3 = new ImageView(d3);
//        final ImageView dice4 = new ImageView(d4);
//        final ImageView dice5 = new ImageView(d5);
//        final ImageView dice6 = new ImageView(d6);
//        dice1.setFitHeight(47);
//        dice1.setFitWidth(47);
//        dice2.setFitHeight(47);
//        dice2.setFitWidth(47);
//        dice3.setFitHeight(47);
//        dice3.setFitWidth(47);
//        dice4.setFitHeight(47);
//        dice4.setFitWidth(47);
//        dice5.setFitHeight(47);
//        dice5.setFitWidth(47);
//        dice6.setFitHeight(47);
//        dice6.setFitWidth(47);
//
//        dice1.setY(717);
//        dice1.setX(759);
//        dice2.setY(717);
//        dice2.setX(759);
//        dice3.setY(717);
//        dice3.setX(759);
//        dice4.setY(717);
//        dice4.setX(759);
//        dice5.setY(717);
//        dice5.setX(759);
//        dice6.setY(717);
//        dice6.setX(759);
//        ArrayList<Image> dicelist = new ArrayList<>();
//        dicelist.add(d1);
//        dicelist.add(d2);
//        dicelist.add(d3);
//        dicelist.add(d4);
//        dicelist.add(d5);
//        dicelist.add(d6);
//
//
//        ArrayList<ImageView> ilist = new ArrayList<>();
//        ilist.add(dice1);
//        ilist.add(dice2);
//        ilist.add(dice3);
//        ilist.add(dice4);
//        ilist.add(dice5);
//        ilist.add(dice6);
//
//
//        Group d;
//        d = new Group(ilist.get(diceno-1));
//
//        Timeline t = new Timeline();
//        t.setCycleCount(3);
//
//
//
//        Random rd = new Random();
////        int n = rd.nextInt(6)+1;
//
//
//
//        t.getKeyFrames().add(new KeyFrame(
//                Duration.millis(250),
//                (ActionEvent event)-> {
//                    d.getChildren().setAll(ilist.get(rd.nextInt(6)));
//                }
//        ));
//
//        t.getKeyFrames().add(new KeyFrame(
//                Duration.millis(375),
//                (ActionEvent event)-> {
//                    d.getChildren().setAll(ilist.get(rd.nextInt(6)));
//                }
//        ));
//        t.getKeyFrames().add(new KeyFrame(
//                Duration.millis(500),
//                (ActionEvent event)-> {
//                    d.getChildren().setAll(ilist.get(rd.nextInt(6)));
//                }
//        ));
//        t.getKeyFrames().add(new KeyFrame(
//                Duration.millis(612),
//                (ActionEvent event)-> {
//                    d.getChildren().setAll(ilist.get(rd.nextInt(6)));
//                }
//        ));
//        int n = rd.nextInt(6);
//        t.getKeyFrames().add(new KeyFrame(
//                Duration.millis(750),
//                (ActionEvent event)-> {
//                    d.getChildren().setAll(ilist.get(n));
//                }
//        ));
//
//        staticcontroller.startstopjumpingarrow(false);
//        t.play();
//
//        diceno = n+1;
//        System.out.println("Hello: "+ diceno);
//
////        if(t.getCycleCount()==25){
////            t.stop();
////        }
//
//
////        staticcontroller.diceanimationgetter().setVisible(false);
//        staticcontroller.getdiceimage().setImage(dicelist.get(diceno-1));
//        staticcontroller.getBorderpane().getChildren().add(staticcontroller.getdiceimage());
//
//
//
//        return d;
//    }

    public static void playgame(){
        if(turn==1){
            //p1 translation
            System.out.println("turn1");
            if(player1.getStart()==false){
                System.out.println("x of p1: "+player1.getPawn().getPawniv().getLayoutX()+" "+"y of p2: "+player1.getPawn().getPawniv().getLayoutY());
                System.out.println("hi from player1getstart");
                if(diceno==1){
                     player1.setIsstart(true);
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
                    tt.setToX((allBoxes.get(0).getX()));
                    tt.setToY(-(allBoxes.get(0).getY()));
                    System.out.println("x1: "+(allBoxes.get(0).getX())+" "+"y1: "+(allBoxes.get(0).getY()));



                    tt.setDuration(Duration.millis(500));
                    tt.setNode(player1.getPawn().getPawniv());
                    tt.play();
                    System.out.println("Hello from playgametranslate");


                }
            }else{
                TranslateTransition tt = new TranslateTransition();
//                tt.setToX(player1.getPawn().getPawniv().getX()+66);
//                tt.setToY(player1.getPawn().getPawniv().getY()-0);
                tt.setToX(allBoxes.get(1).getX());
                tt.setToY(-allBoxes.get(1).getY());
                tt.setDuration(Duration.millis(500));
                tt.setNode(player1.getPawn().getPawniv());
                tt.play();

                System.out.println("dice no more than 1");
            }
            turn = 2;


            // if(current position of pawn is in range) x translate
            //else translate x and y both



        }else if(turn ==2){
            System.out.println("turn2");
            //p2 translation
            if(player2.getStart()==false){
                System.out.println("hi from player2getstart");
                System.out.println("x of p2: "+player2.getPawn().getPawniv().getLayoutX()+" "+"y of p2: "+player2.getPawn().getPawniv().getLayoutY());
                if(diceno==1){
                    player2.setIsstart(true);
                    TranslateTransition tt = new TranslateTransition();
//                    tt.setToX(player2.getPawn().getPawniv().getX()+(allBoxes.get(0).getX()));
//                    tt.setToY(player2.getPawn().getPawniv().getY()-(allBoxes.get(0).getY()));
//                    tt.setToY((allBoxes.get(0).getY())-player2.getPawn().getPawniv().getY());

                    tt.setToX(allBoxes.get(0).getX()-40);
                    tt.setToY(-(allBoxes.get(0).getY()));
                    System.out.println("x1: "+(allBoxes.get(0).getX())+" "+"y1: "+(allBoxes.get(0).getY()));
//
//                    tt.setToX(player1.getPawn().getPawniv().getX()-10);
////                    player2.getPawn().getPawniv().setLayoutX((player2.getPawn().getPawniv().getX()+19));
//                    tt.setToY(player1.getPawn().getPawniv().getY()-90);
//                    player2.getPawn().getPawniv().setX((player2.getPawn().getPawniv().getX()+19));
//                    player2.getPawn().getPawniv().setY(player2.getPawn().getPawniv().getY()-90);


                    tt.setDuration(Duration.millis(500));
                    tt.setNode(player2.getPawn().getPawniv());
                    tt.play();

                }
            }else{
                TranslateTransition tt = new TranslateTransition();
//                tt.setToX(player1.getPawn().getPawniv().getX()+66);
//                tt.setToY(player1.getPawn().getPawniv().getY()-0);
                tt.setToX(allBoxes.get(1).getX()-40);
                tt.setToY(-allBoxes.get(1).getY());

                tt.setDuration(Duration.millis(500));
                tt.setNode(player2.getPawn().getPawniv());
                tt.play();

                System.out.println("dice no more than 1");
            }
            turn =1;
        }
    }

    public static void newdiceanimation() throws InterruptedException {
        ImageView diceImage = staticcontroller.getdiceimage();

        Random rd= new Random();
        final int[] n = new int[1];
        Thread thread = new Thread(){
            public void run(){
                System.out.println("Thread Running");

                    for (int i = 0; i < 15; i++) {

                        n[0] = rd.nextInt(6)+1;

                        File file = new File("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\dice" + (n[0])+".png");
//                        ImageIcon diceImage;
                        diceImage.setImage(new Image(file.toURI().toString()));
                        try {
                            Thread.sleep(20);
                        } catch (InterruptedException e) {
                            System.out.println(e);;
                        }

                    }
                diceno = n[0];
//                System.out.println("dice no (from inside): "+ diceno);


//                    rollButton.setDisable(false);
            }

        };
//        diceImage.setX(759);
//        diceImage.setY(717);
        diceImage.setFitHeight(48);
        diceImage.setFitWidth(48);

        thread.start();
//        while(thread.isAlive()){
//            System.out.println("hello from while");
//
//        }
        staticcontroller.startstopdiceanimation(true);



//        Thread.sleep(50);

//        diceno = n[0];
        System.out.println("dice no: "+ diceno);
//        staticcontroller.setDiceimage(diceImage);
//        Pane p = new Pane();
//        p.getChildren().add(diceImage);
//        Scene sc = new Scene(p,800,800);

//        window.setScene(sc);
//        window.show();

    }

    public static ImageView arrowanimation() throws FileNotFoundException {
        InputStream stream1 = new FileInputStream("C:\\Users\\krish\\IdeaProjects\\demo\\src\\main\\resources\\playerimages\\clipart529578.png");
        Image img =new  Image(stream1);
        ImageView iv = new ImageView(img);
        iv.setFitWidth(40);
        iv.setFitHeight(40);


        iv.setLayoutX(761);
        iv.setLayoutY(630);
        TranslateTransition tt = new TranslateTransition();
        tt.setByY(50);
        tt.setDuration(Duration.millis(500));
        tt.setCycleCount(500);
        tt.setAutoReverse(true);
        tt.setNode(iv);
        tt.play();


        return iv;

    }
}