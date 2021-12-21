package com.example.demo;


import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.ImageCursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.BlurType;
import javafx.scene.effect.Shadow;
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
        GamePlay.allBoxes.get(35).setSpcno(0);

        Snake s2 = new Snake(GamePlay.allBoxes.get(28),GamePlay.allBoxes.get(12));
        GamePlay.allBoxes.get(28).setStatus(-1);
        GamePlay.allBoxes.get(28).setSpcno(1);


        Snake s4 = new Snake(GamePlay.allBoxes.get(61),GamePlay.allBoxes.get(21));
        GamePlay.allBoxes.get(61).setStatus(-1);
        GamePlay.allBoxes.get(61).setSpcno(2);

        Snake s3 = new Snake(GamePlay.allBoxes.get(45),GamePlay.allBoxes.get(34));
        GamePlay.allBoxes.get(45).setStatus(-1);
        GamePlay.allBoxes.get(45).setSpcno(3);


        Snake s5 = new Snake(GamePlay.allBoxes.get(97),GamePlay.allBoxes.get(44));
        GamePlay.allBoxes.get(97).setStatus(-1);
        GamePlay.allBoxes.get(97).setSpcno(4);

        Snake s6 = new Snake(GamePlay.allBoxes.get(93),GamePlay.allBoxes.get(55));
        GamePlay.allBoxes.get(93).setStatus(-1);
        GamePlay.allBoxes.get(93).setSpcno(5);
        Snake s7 = new Snake(GamePlay.allBoxes.get(90),GamePlay.allBoxes.get(88));
        GamePlay.allBoxes.get(90).setStatus(-1);
        GamePlay.allBoxes.get(90).setSpcno(6);

        GamePlay.snakes.add(s1);GamePlay.snakes.add(s2);GamePlay.snakes.add(s3);GamePlay.snakes.add(s4);GamePlay.snakes.add(s5);GamePlay.snakes.add(s6);GamePlay.snakes.add(s7);
    }
    public void ladderset(){
        Ladder l1 = new Ladder(GamePlay.allBoxes.get(22),GamePlay.allBoxes.get(2));
        GamePlay.allBoxes.get(2).setStatus(1);
        GamePlay.allBoxes.get(2).setSpcno(0);
        Ladder l2 = new Ladder(GamePlay.allBoxes.get(29),GamePlay.allBoxes.get(9));
        GamePlay.allBoxes.get(9).setStatus(1);
        GamePlay.allBoxes.get(9).setSpcno(1);
        Ladder l3 = new Ladder(GamePlay.allBoxes.get(33),GamePlay.allBoxes.get(13));
        GamePlay.allBoxes.get(13).setStatus(1);
        GamePlay.allBoxes.get(13).setSpcno(2);

        Ladder l4 = new Ladder(GamePlay.allBoxes.get(52),GamePlay.allBoxes.get(31));
        GamePlay.allBoxes.get(31).setStatus(1);
        GamePlay.allBoxes.get(31).setSpcno(3);
        Ladder l5 = new Ladder(GamePlay.allBoxes.get(64),GamePlay.allBoxes.get(43));
        GamePlay.allBoxes.get(43).setStatus(1);
        GamePlay.allBoxes.get(43).setSpcno(4);
        Ladder l6 = new Ladder(GamePlay.allBoxes.get(86),GamePlay.allBoxes.get(50));
        GamePlay.allBoxes.get(50).setStatus(1);
        GamePlay.allBoxes.get(50).setSpcno(5);
        Ladder l7 = new Ladder(GamePlay.allBoxes.get(81),GamePlay.allBoxes.get(62));
        GamePlay.allBoxes.get(62).setStatus(1);
        GamePlay.allBoxes.get(62).setSpcno(6);
        Ladder l8 = new Ladder(GamePlay.allBoxes.get(96),GamePlay.allBoxes.get(75));
        GamePlay.allBoxes.get(75).setStatus(1);
        GamePlay.allBoxes.get(75).setSpcno(7);

        GamePlay.ladders.add(l1);GamePlay.ladders.add(l2);GamePlay.ladders.add(l3);GamePlay.ladders.add(l4);GamePlay.ladders.add(l5);GamePlay.ladders.add(l6);GamePlay.ladders.add(l7);GamePlay.ladders.add(l8);



    }

}



public class GamePlay {

    public static ArrayList<Box> allBoxes=new ArrayList();
    private static player player1;
    private static player player2;
    private static Dice dice;
    public static ArrayList<Snake> snakes = new ArrayList<>();
    public static ArrayList<Ladder> ladders = new ArrayList<>();
    public static Scene5Controller staticcontroller;
    public static Scene7Controller staticcontroller7;
    public static int diceno = 6;
    private static int turn = 1;
    public static int winner=0;



    public static int p1counter = 0; //created by me!
    public static int p2counter = 0; //created by me!

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
            yy +=66;
            xx=xx-66;
            for(int m=0;m<10;m++){
                Box tempBox2=new Box(xx,yy,i);
                xx=xx-66;allBoxes.add(tempBox2);i++;
            }
            yy=yy+66;
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

    public static void playgame() throws IOException {
//        System.out.println("Size of boxset: "+ allBoxes.size());
//        for(int i=0;i< allBoxes.size();i++){
//            System.out.println("x of box "+allBoxes.get(i).getNumber()+" is "+allBoxes.get(i).getX());
//            System.out.println("y of box "+allBoxes.get(i).getNumber()+" is "+allBoxes.get(i).getY());
//        }
        if(turn==1){
            //p1 translation
            System.out.println("turn1 diceout "+player1.getDiceout());
            if(player1.getStart()==false){
                System.out.println("x of p1: "+player1.getPawn().getPawniv().getLayoutX()+" "+"y of p2: "+player1.getPawn().getPawniv().getLayoutY());
                System.out.println("hi from player1getstart");
                if(player1.getDiceout()==1){
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



                    tt.setDuration(Duration.millis(1000));
                    tt.setNode(player1.getPawn().getPawniv());
                    tt.play();
//                    player1.getPawn().getPawniv().setX((allBoxes.get(0).getX()));
//                    player1.getPawn().getPawniv().setY(-(allBoxes.get(0).getY()));
                    System.out.println("Hello from playgametranslate");

                    p1counter+=1;
                }
            }else{
                if(p1counter+ player1.getDiceout()<=100){
//                    TranslateTransition tt = new TranslateTransition();
//                tt.setToX(player1.getPawn().getPawniv().getX()+66);
//                tt.setToY(player1.getPawn().getPawniv().getY()-0);
                    for(int i=1;i<=player1.getDiceout();i++){
                        TranslateTransition tt = new TranslateTransition();
//                        System.out.println("Hello p1 "+i);
//                        tt.setToX(allBoxes.get(p1counter+ player1.getDiceout()).getX());
//                        tt.setToY(-allBoxes.get(p1counter+ player1.getDiceout()).getY());
//                        tt.setDuration(Duration.millis(500));
//                        tt.setNode(player1.getPawn().getPawniv());
//                        tt.play();
                        tt.setToX(allBoxes.get(p1counter+ i-1).getX());
                        tt.setToY(-allBoxes.get(p1counter+ i-1).getY());
                        tt.setDuration(Duration.millis(1000));
                        tt.setNode(player1.getPawn().getPawniv());
//                        PauseTransition pt = new PauseTransition(Duration.millis(1000));
//                        pt.play();
//                        SequentialTransition seqTransition = new SequentialTransition (
//                                new PauseTransition(Duration.millis(1000)),
//                                tt
//                        );
//                        seqTransition.play();
                        tt.play();





                    }



//                    System.out.println("dice no more than 1");
                    p1counter+= player1.getDiceout();
                }

                System.out.println("from here p1 counterrrrrr "+p1counter);
                if(allBoxes.get(p1counter-1).getStatus()!=0){
                    checksnakeorladder(p1counter-1,1);
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
                System.out.println("after updation p1 counterrr is "+p1counter);
                if(p1counter==100) {
                    winner=1;
                    Thread.currentThread().stop();
                    //declarewinner(1);
                }

            }
            turn = 2;
        }else if(turn ==2){
            System.out.println("turn2 dicout "+player2.getDiceout());
            //p2 translation
            if(player2.getStart()==false){
                System.out.println("hi from player2getstart");
                System.out.println("x of p2: "+player2.getPawn().getPawniv().getLayoutX()+" "+"y of p2: "+player2.getPawn().getPawniv().getLayoutY());
                if(player2.getDiceout()==1){
                    player2.setIsstart(true);
                    TranslateTransition tt = new TranslateTransition();
//                    tt.setToX(player2.getPawn().getPawniv().getX()+(allBoxes.get(0).getX()));
//                    tt.setToY(player2.getPawn().getPawniv().getY()-(allBoxes.get(0).getY()));
//                    tt.setToY((allBoxes.get(0).getY())-player2.getPawn().getPawniv().getY());

                    tt.setToX(allBoxes.get(0).getX()-40);
                    tt.setToY(-(allBoxes.get(0).getY()));

//                    tt.setToX(allBoxes.get(86).getX()-40);
//                    tt.setToY(-allBoxes.get(86).getY());
                    System.out.println("x2: "+(allBoxes.get(0).getX())+" "+"y2: "+(allBoxes.get(0).getY()));
//
//                    tt.setToX(player1.getPawn().getPawniv().getX()-10);
////                    player2.getPawn().getPawniv().setLayoutX((player2.getPawn().getPawniv().getX()+19));
//                    tt.setToY(player1.getPawn().getPawniv().getY()-90);
//                    player2.getPawn().getPawniv().setX((player2.getPawn().getPawniv().getX()+19));
//                    player2.getPawn().getPawniv().setY(player2.getPawn().getPawniv().getY()-90);


                    tt.setDuration(Duration.millis(1000));
                    tt.setNode(player2.getPawn().getPawniv());
                    tt.play();
                    p2counter+=1;

                }
            }else{
                if(p2counter+ player2.getDiceout()<=100){

//                tt.setToX(player1.getPawn().getPawniv().getX()+66);
//                tt.setToY(player1.getPawn().getPawniv().getY()-0);
                    for(int i=1;i<=player2.getDiceout();i++) {
                        TranslateTransition tt = new TranslateTransition();
//                        System.out.println("Hello p2 "+i);

//                        tt.setToX(allBoxes.get(p2counter+ player2.getDiceout()).getX() - 40);
//                        tt.setToY(-allBoxes.get(p2counter+ player2.getDiceout()).getY());
//
//                        tt.setDuration(Duration.millis(500));
//                        tt.setNode(player2.getPawn().getPawniv());
//                        tt.play();
                        tt.setToX(allBoxes.get(p2counter+ i-1).getX() - 40);
                        tt.setToY(-allBoxes.get(p2counter+ i-1).getY());

                        tt.setDuration(Duration.millis(1000));
                        tt.setNode(player2.getPawn().getPawniv());
//                        SequentialTransition seqTransition = new SequentialTransition (
//                                new PauseTransition(Duration.millis(1000)),
//                                tt
//                        );
//                        seqTransition.play();

                        tt.play();


                    }
                    p2counter+= player2.getDiceout();

                }


                    System.out.println("p2 counetr form herrrrre "+p2counter);

//                    System.out.println("dice no more than 1");

                if(allBoxes.get(p2counter-1).getStatus()!=0){
                    checksnakeorladder(p2counter-1,2);
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
                System.out.println("after updation p1 counterrr is "+p1counter);
                if(p2counter==100){
                    winner=2;
                    Thread.currentThread().stop();

               // declarewinner(2);
            }
            }
            turn =1;
        }
          //  System.out.println("p1counter: "+p1counter+" "+"p2counter"+p2counter);
    }
    public static void checksnakeorladder(int counter,int flag){
        TranslateTransition tt2 = new TranslateTransition();
        if(allBoxes.get(counter).getStatus()==1){
            if(flag==1){
                tt2.setToX(ladders.get(allBoxes.get(counter).getSpcno()).getEnd().getX());
                tt2.setToY(-ladders.get(allBoxes.get(counter).getSpcno()).getEnd().getY());

                tt2.setDuration(Duration.millis(1000));
                tt2.setNode(player1.getPawn().getPawniv());
                tt2.play();
//                System.out.println("Set to x: "+ladders.get(allBoxes.get(p1counter).getSpcno()).getEnd().getX());
//                System.out.println("set to y: "+(-ladders.get(allBoxes.get(p1counter).getSpcno()).getEnd().getY()));
                p1counter = allBoxes.indexOf(ladders.get(allBoxes.get(counter).getSpcno()).getEnd())+1;
            }
            else if(flag==2){
                tt2.setToX(ladders.get(allBoxes.get(counter).getSpcno()).getEnd().getX()-40);
                tt2.setToY(-ladders.get(allBoxes.get(counter).getSpcno()).getEnd().getY());
                tt2.setDuration(Duration.millis(1000));
                tt2.setNode(player2.getPawn().getPawniv());
                tt2.play();
//            System.out.println("Set to x: "+(ladders.get(allBoxes.get(p2counter).getSpcno()).getEnd().getX()-40));
//            System.out.println("set to y: "+(-ladders.get(allBoxes.get(p2counter).getSpcno()).getEnd().getY()));
                p2counter = allBoxes.indexOf(ladders.get(allBoxes.get(counter).getSpcno()).getEnd())+1;
            }

        }else if(allBoxes.get(counter).getStatus()==-1){
            if(flag==1){
                tt2.setToX(snakes.get(allBoxes.get(counter).getSpcno()).getStart().getX());
                tt2.setToY(-snakes.get(allBoxes.get(counter).getSpcno()).getStart().getY());
                tt2.setDuration(Duration.millis(1000));
                tt2.setNode(player1.getPawn().getPawniv());
                tt2.play();
//                System.out.println("Set to x: "+snakes.get(allBoxes.get(p1counter).getSpcno()).getEnd().getX());
//                System.out.println("set to y: "+(-snakes.get(allBoxes.get(p1counter).getSpcno()).getEnd().getY()));
                p1counter = allBoxes.indexOf(snakes.get(allBoxes.get(counter).getSpcno()).getStart())+1;

            }else if(flag==2){
                tt2.setToX(snakes.get(allBoxes.get(counter).getSpcno()).getStart().getX()-40);
                tt2.setToY(-snakes.get(allBoxes.get(counter).getSpcno()).getStart().getY());
                tt2.setDuration(Duration.millis(1000));
                tt2.setNode(player2.getPawn().getPawniv());
                tt2.play();
//                System.out.println("Set to x: "+(snakes.get(allBoxes.get(p2counter).getSpcno()).getEnd().getX()-40));
//                System.out.println("set to y: "+(-snakes.get(allBoxes.get(p2counter).getSpcno()).getEnd().getY()));
                p2counter = allBoxes.indexOf(snakes.get(allBoxes.get(counter).getSpcno()).getStart())+1 ;
            }


        }
        //System.out.println("p1counter: "+p1counter+" "+"p2counter"+p2counter);
    }


    public static void declarewinner(int n) throws IOException {
        FXMLLoader loader=new FXMLLoader(HelloApplication.class.getResource("scene7.fxml"));
        Parent root=(Parent)loader.load();
        Scene7Controller controller=loader.getController();
        staticcontroller7 = controller;

        if(n==1){
            controller.setwinnerloser(player1.getName(), player2.getName());
        }else if(n==2){
            controller.setwinnerloser(player2.getName(), player1.getName());
        }
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("scene7.fxml"));

        Game.winner(root);
    }

    public static void newdiceanimation() throws InterruptedException,IOException {
        ImageView diceImage = staticcontroller.getdiceimage();
        Scene5Controller.startstopjumpingarrow(false);

        Random rd= new Random();
        final int[] n = new int[1];
        Thread thread = new Thread(){
//            thread.setDaemon(true);
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
                    if(turn==1){
                        player1.setDiceout(n[0]);
                    }else{
                        player2.setDiceout(n[0]);
                    }
                diceno = n[0];
//                System.out.println("dice no (from inside): "+ diceno);

                try {
                    GamePlay.playgame();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene5Controller.startstopjumpingarrow(true);
                if(turn==1){
                    Bloom glow = new Bloom(0.9);

//                    glow.setLevel(0.9);
                    staticcontroller.glow1.setEffect(glow);
                    Shadow shadow = new Shadow();
                    shadow.setBlurType(BlurType.GAUSSIAN);
                    staticcontroller.glow2.setEffect(shadow);
                }
                if(turn==2){
                    Bloom glow = new Bloom(0.9);
//                    glow.setLevel(0.9);
                    staticcontroller.glow2.setEffect(glow);
                    Shadow shadow = new Shadow();
                    shadow.setBlurType(BlurType.GAUSSIAN);
                    staticcontroller.glow1.setEffect(shadow);
                }
//                    rollButton.setDisable(false);
            }


        };
//        diceImage.setX(759);
//        diceImage.setY(717);
        diceImage.setFitHeight(48);
        diceImage.setFitWidth(48);


        thread.start();
        if(winner!=0){
            GamePlay.declarewinner(winner);
        }

//        while(thread.isAlive()){
//            System.out.println("hello from while");
//
//        }
       // staticcontroller.startstopdiceanimation(true);



//        Thread.sleep(50);

//        diceno = n[0];
//        System.out.println("dice no: "+ diceno);
//        staticcontroller.setDiceimage(diceImage);
//        Pane p = new Pane();
//        p.getChildren().add(diceImage);
//        Scene sc = new Scene(p,800,800);

//        window.setScene(sc);
//        window.show();
//        if(turn==1){
//            turn = 2;
//        }else{
//            turn = 1;
//        }

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

    public static void reset(){
        p1counter = 0;
        p2counter= 0;
        winner = 0;
    }
}